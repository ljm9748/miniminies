package thread;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try {
			at.join();
			mt.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
		System.out.println("연산의 횟수 >> " + cal.opPlusCnt);
		System.out.println("연산의 횟수 >> " + cal.opMinCnt);
				

	}

}

class AddThread extends Thread{
	Calculator cal;
	
	AddThread(Calculator c){
		cal = c;
	}
	
	public void run() {
		for(int i=0; i<10000; i++) {
		System.out.println("1 + 2 = " + cal.add(1, 2));
		System.out.println("2 + 4 = " + cal.add(2, 4));
	
		}
	}
}

class MinThread extends Thread {
	Calculator cal;
	
	MinThread(Calculator c){
		cal = c;
	}
	
	public void run() {
		for(int i=0; i<10000; i++) {
		System.out.println("2 - 1 = " + cal.min(2, 1));
		System.out.println("4 - 2 = " + cal.min(4, 2));
	
		}
	}
}


