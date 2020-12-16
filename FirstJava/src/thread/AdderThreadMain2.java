package thread;

public class AdderThreadMain2 {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		Sum sum = new Sum();
		
		AdderThread1 t1 = new AdderThread1(sum, 1, 5000);
		AdderThread1 t2 = new AdderThread1(sum, 5001, 10000);
		
		t1.start();
		t2.start();
		
		try {
			//Thread.sleep(1000);
			t1.join(); 	// 결과 값이 다른 이유: 데이터가 참조 처리를 할 때 잘못 참조를 하고 있다.
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1 ~ 100까지의 합 >> " + sum.getNum());
	}
	
}
