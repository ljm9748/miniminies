package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TCPIPMultiChatClient {

	public static void main(String[] args) {
		
		try {
			String serverIp = "192.168.0.24";	// = localhost => 프로그램이 돌고 있는 컴퓨터 호스트 자신의 주소
			// Socket 연결
			Socket socket = new Socket(serverIp, 7777);
			
			// 메세지를 받는 쓰래드
			Thread receiver = new ClientReceiver(socket);
			// 메세지를 전송하는 쓰래드
			Thread sender = new ClientSenderThread(socket, "수인");
			
			sender.start();
			receiver.start();
			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
	}

}

class ClientSenderThread extends Thread{
	
	// 보내기 쓰래드는 Socket, OutputStream, name이 필요하다.
	// 생성자 통해서 작성
	
	Socket socket;
	
	DataOutputStream out;
	String name;
	
	public ClientSenderThread(Socket s, String name) {		
		this.socket = s;		
		
		
		try {
			out = new DataOutputStream(s.getOutputStream());
			this.name = name;
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	

	@Override
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// 데이터(이름)을 전송
			// 접속하면 바로 이름을 서버에 전송
			if(out!=null) {
				out.writeUTF(name);
			}
			
			// 반복
			while(out!=null) {
				out.writeUTF(" ["+name+"] " + sc.nextLine());
			}
			
			
		} catch(IOException e){
			
		}
	}
	
}

// 받는 값
class ClientReceiver extends Thread{
	// 메세지를 받아서 콘솔에 출력
	// Socket, inputStream이 필요
	
	Socket socket;
	DataInputStream in;
	
	// 생성자
	public ClientReceiver(Socket socket) {
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			
		}
		
	}
	
	// 메소드
	public void run() {
		while(in!=null){
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				
			}
		}
	}
	
	
}