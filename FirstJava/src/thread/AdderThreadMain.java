package thread;

public class AdderThreadMain {

	public static void main(String[] args) {
		
		AdderThread at1 = new AdderThread(1, 5000);
		AdderThread at2 = new AdderThread(5000, 10000);
		
		// 쓰래드 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		// Object 클래스가 가지고 있음.
		try {
			t1.join(); // t1 쓰래드가 종료될 때까지 다른 쓰래드는 멈춘 상태이다.
			t2.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100까지의 합 >> " + (at1.getNum() + at2.getNum()));
		

	}

}
