package cast;

public class mainClass {

	public static void main(String[] args) {
		/*
		 * 					우선 순위
		 	boolean 1byte	낮음
		 			 	
		 	byte 	1byte
		 	short	2byte
		 	int 	4byte
		 	long 	8byte
		 	
		 	float 	4byte
		 	double 	8byte	높음
		 
		 	자료형의 변환(auto, cast)
		 	
		 	자동 자료형 변환(auto)*/
		 	short sh = 12345; 	//2byte
		 	int i;				//4byte
		 	i = sh;				//자동 형변환
		 	System.out.println("i = " + i);
		 	
		 	//강제 자료형 변환
		 	i = 1234567;
		 	sh = (short)i;
		 	
		 	System.out.println("sh = " + sh); //물이 넘친 상황
		 	//주의 사항 범위가 넘어갈 경우는 형변환 금지 -> 엉뚱한 값이 나오기 때문
		 	
		 	long l = 123456789L;
		 	float f = l;
		 	double d = l;
		 	
		 	System.out.println("f = " + f); //1.23456792E8 => 7다음 9가 나옴.(오류)
		 	System.out.println("d = " + d);
		 
		 	// 1.23456789E8
		 	// 1.23456789 * 10^8(100000000) -> 10의 8승 = 123456789
		 	
		 	double d1 = 1.234e2; // 1.234 * 100 = 123.4
		 	double d2 = 1.234e-2; // 1.234 * 0.01 = 0.01234
		 	System.out.println("d1: " + d1);
		 	System.out.println("d2: " + d2);
		 	
		 	int n1, n2;
		 	n1 = 3;
		 	n2 = 2;
		 	
		 	double result = (double)n1/n2; //n1이 강제형 변환이 되면서 3.0/2.0이 됨.
		 	System.out.println("result: "+ result);
		 	
		 	
		 	
		 	
		 	
		 
		

	}

}
