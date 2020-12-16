package test1;

import test.AAA;

public class CCC {
	
	public static void main(String[] args) {
		
		AAA.n = 0; // class에 public을 빼면 AAA가 아예 보이지 않는다.
		
		//AAA a = new AAA(); // 다른 패키지에 있기 때문에 import 해주어야 함.
		
		//a.num = 10;
	}
	
	
	

}
