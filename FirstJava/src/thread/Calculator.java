package thread;

public class Calculator {
	int opPlusCnt = 0;
	int opMinCnt = 0;
	
	public int add(int n1, int n2) {
		synchronized (this) { 
			opPlusCnt++;
		}
		
		return n1 + n2;
	}
	
	public int min(int n1, int n2) {
		synchronized (obj) { // 동기화 대상이 다를 경우 obj를 넣어 add와 분리시킴.
			opMinCnt++;
		} 
		
		return n1-n2;
	}
	
	// Object 인스턴스 생성
	// 새로운 동기화 키
	Object obj = new Object();
	
	
	
}
