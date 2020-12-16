package thread;

// 쓰래드 클래스를 정의할 대 상속이 필요한 경우 Runnable 인터페이스를 구현해서 쓰래드를 생성할 수 있다.
public class ShowRunnable implements Runnable{

	@Override
	public void run() {
		// 새로운 실행 환경에서 처리할 코드를 작성
				for(int i=0; i<100; i++) {
					System.out.println("안녕하세요. Runnable 입니다.");
					try {
						// sleep 메소드(ms)는 Object 클래스의 메소드 => 현재 쓰래드를 1/1000 초 간격으로 잠시 멈춤.
						Thread.sleep(100); 	// 100/1000초 
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}	
					
				}
				System.out.println("Runnable 쓰래드가 종료되었습니다.");
		
	}
	// 추상메소드를 구현 해야함.
	
	

}
