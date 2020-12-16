package thread;

// 쓰레드 클래스 정의는 Thread 클래스를 상속해서 정의
public class ShowThread extends Thread {

	String threadName;
	
	// 생성자
	public ShowThread(String name) {
		threadName = name;
	}
	
	@Override
	public void run() {	
		// 새로운 실행 환경에서 처리할 코드를 작성
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요. " + threadName + "입니다.");
			try {
				// sleep 메소드(ms)는 Object 클래스의 메소드 => 현재 쓰래드를 1/1000 초 간격으로 잠시 멈춤.
				sleep(1000); 	// 100/1000초 
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}	
			
		}
		System.out.println(threadName +"가 종료되었습니다.");
		
	}
	
	


}
