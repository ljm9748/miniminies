package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TCPIPMultiChatServer {
	
	// 접속 사용자 정보를 저장 >> 메세지를 전체에게 보내기 위해
	// 저장 정보 >> name, OutputStream
	// Map<String, object>에 저장
	HashMap<String, Object> clients;
	
	public TCPIPMultiChatServer() {
		clients = new HashMap<String, Object>();
		Collections.synchronizedMap(clients); // 쓰래드 동기화에 안전하게 사용하도록 해주는 메소드
	}
	
	public void start() throws IOException {
		// ServerSocket 실행
		// 사용자의 요청이 있으면  Socket 생성해서 
		// 연결 -> clients 사용자 정보를 저장해서 쓰래드로 처리
		
		// 서버 소켓 생성
		ServerSocket serverSocket = new ServerSocket(7777);
		System.out.println("Chatting Server Start.....!!");
		
		Socket socket = null;
		
		// 반복해서 소켓을 받음
		while(true) {
			// 요청이 들어올 때까지 대기 -> 요청이 들어오면 새로운 Scocket 생성해서 반환
			socket = serverSocket.accept();
			
			// map에 정보저장 -> 접속한 사용자들에게 메세지를 전송
			
			System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"] 사용자 접속");
			
			ServerReceiver receiver = new ServerReceiver(socket);
			receiver.start();
		}
	}
	
	void sendToAll(String msg) {
		// 일괄처리 / Map은 순서가 없음 -> Map이 가지고 있는 Key를  Set으로 만든다.
		Set<String> keys = clients.keySet();		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext()) {
			DataOutputStream out = (DataOutputStream) clients.get(itr.next()); // 키 값을 가져옴
			
			// 
			try {
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
	
	// 내부 클래스 >> 데이터를 받아서 저장 -> 메세지 전체 발송 
	private class ServerReceiver extends Thread{
		// 필요한 데이터 >> Socket, InputStream, OutputStream
		Socket socket;
		DataOutputStream out;
		DataInputStream in;
		
		public ServerReceiver(Socket socket) { //out과 in은 소켓만 있으면 값을 받을 수 있다.
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		}
		
		@Override
		public void run() {
			String name = null; // 접속한 사용자의 이름
			
			// name 값을 가져옴.
			try {
				name = in.readUTF();	// 이름을 스트림을 통해 받는다.
				clients.put(name, out); // Map의 사용자 정보 저장
				sendToAll(">>>>>>>>>> " + name + " 님이 접속하셨습니다.");	// 내부 클래스에서는 아웃터 클래스의 (인스턴스) 멤버를 참조할 수 있다.
				
				while(in!=null) {
					sendToAll(in.readUTF());
				}
				
			} catch (IOException e) {				
				e.printStackTrace();
				
			} finally {
				clients.remove(name);
				System.out.println(name + " 님이 나가셨습니다.");
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
			
		new TCPIPMultiChatServer().start();
			
	} // main
	
	
}
