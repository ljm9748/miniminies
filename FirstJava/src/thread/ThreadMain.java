package thread;

public class ThreadMain {

	public static void main(String[] args) {
		// 쓰래드 생성
		ShowThread st1 = new ShowThread("1번 쓰래드");
		ShowThread st2 = new ShowThread("2번 쓰래드");
		// Runnable 인터페이스를 이용한 Thread
		Runnable target = new ShowRunnable();
		Thread st3 = new Thread(target);
				
		// 우선 순위 설정 1 ~ 10 >> 기본은 5
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		st1.setPriority(Thread.MAX_PRIORITY);
		st2.setPriority(Thread.MIN_PRIORITY);
		
		
		st1.start();
		st2.start();
		//st3.start();
		
//		for(int i=0; i<100; i++) {
//			System.out.println("안녕하세요~ 메인쓰래드 입니다.");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {				
//				e.printStackTrace();
//			} // 100/1000 초
//		}		
//		System.out.println("메인 쓰래드가 종료되었습니다.");
	}

	
}
