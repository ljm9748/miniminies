package thread;

public class AdderThread extends Sum implements Runnable{
	int start;
	int end;
	
	AdderThread(int n1, int n2){
		start = n1;
		end = n2;
		
	}

	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			addNum(i);
		}
		
	}

}
