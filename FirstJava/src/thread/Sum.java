package thread;

public class Sum {
	int num;
	
	// 생성자
	Sum(){
		num=0;
	}
	
	synchronized void addNum(int n) { // synchronized는 동시 접근을 막는다.
		num += n;
	}
	
	int getNum() {
		return num;
	}
}
