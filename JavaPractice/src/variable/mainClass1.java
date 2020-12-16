package variable;

public class mainClass1 {

	public static void main(String[] args) {
		/*
		 * 실행 순서
		 	소스코드
		 		|
		 	compile(문자코드 -> 기계어(2진코드)), <- 라이브러리(lib-외부파일) => *.class
		 		|
		 	build -> *.exe 실행 파일 생성
		 		|
		 	실행
		 
		  
		 */
		
		
		
		/*
		 	숫자(상수): 변하지 않는 수, 23을 21로 바꿀 수 없듯이 고유한 수
		  		숫자 -> 2진수: 0과 1 - 호환이 좋음
		  			  8진수: 0 - 7 / 8 -> 010 - 사용빈도 적음.
		  			  10진수: 0 - 9
		  			  16진수: 0 - 9 A B C D E F(15) ex) 0x8  0xA1 - 호환이 좋음
		  			  
		  			  ex) 2진수: 1010	1100 -> 10진수: 
		  			   			8421	8421
		  			   			16의 1승  16의 0승
		  			   			16*(8+2) + 1*(8+4) = 160+12 = 172
		  			   			A		   C
		  			   			
		  			   			0x8D(16진수) -> 8bit
		  			   			8: 1000	D: 1101
		  */
		
		/* 변수(별명)
		 변수: 특정 이름을 정하고 값을 변경할 수 있는 공간.
		 	 문자, 문자열, 숫자(정수, 실수)
		 		  				 */
		
		int 	i; //integer(정수)
	//	자료형 	변수
		
		// 의미를 부여하는 것이 효율적!! 
		int n;
		int number; //명확하게 표현하는 것이 좋다.
		
		n = 123; // =는 같다라는 표시가 아닌 대입이라는 의미.
		number = 234;
		number = 345; // 계속해서 변경 가능.
		
		number = 56;
		
		int num = 23; // 선언과 동시에 대입도 가능

		num = 333; // ↖변경 
		
		// 변수명을 정하는 룰
		int aa; // 1
		int AA; // 2 -> 1과 2는 다른 변수
		int _num; // 가능 _은 연산기호로 취급
		// int -num; 불가능 -은 문자로 취급
		// 똑같은 변수명을 중복 선언은 불가능;
		int Num; //대소문자가 다르면 가능 (하지만 비추)
		
		int studentNumberPosition; //camel 기법 새로운 단어가 시작될 때 대문자로 시작
		int studen_number_position;
		int stuNumPos;
		
		/*
		 	예약어: 이미 시스템적으로 등록되어 있어서 변수로 사용할 수 없는 단어들
		 	- int, float, double, 
		 
		 */
//		int double; error - double은 예약어라 변수로 사용 불가능
//		int stuNumPos; error - 같은 이름의 변수명은 사용 불가능
//		int +strNum; error - 연산자는 변수명으로 사용 불가능
//		int 2num; error - 상수는 첫글자로 불가능(자바에서만 불가능) 
		int 넘버; //한글은 가능하나 실제로 사용은 하지 말기(욕먹음ㅋㅋ)
		
		// 변수의 종류
		/*
		 	- 숫자형
		 		1.정수
		 		  byte		1 byte == 8bit	1111 1111 -> 255 -> 0을 포함한 256개 숫자 표현 가능(255까지 x)
		 		  short		2 byte == 16bit (short int) 
		 		  int		4 byte 
		 		  long		8 byte			(long int)
		 		
		 		2.실수(소수)
		 		  float		4 byte - 실무에서는 사용 빈도 낮음.
		 		  double 	8 byte
		 	
		 	
		 	- 문자형
		 		1. 문자
		 		  char		2 byte		a - z, A - Z, 가 - 하 	ex)h e l l o
		 		
		 		2. 문자열
		 		  string(wrapper class - 사용하기 편하도록 class화 해놓은 것)
		 	
		 	- 논리형
		 	      boolean	1 byte (true(1) / false(0)) - 그렇다고 1을 대입하면 오류남.
		 	
		 */
		
		number = 11;
		System.out.println(number);
		System.out.println("number = " + number);
		System.out.println("number: " + number);
		
//		09/21(화)
		// 변수의 선언
		byte by; //1byte == 0000 0000 	0x00	1111	1111 =>	0xff
//												8421	8421	0xff0000 -> 255 0 0(RED)-> 24bit
//												255				0xff000024 -> 24는 투명도
//		0 -> +, 1 -> -	<= 8자리 중 맨 첫 숫자
		
		System.out.println();
		// 변수의 대입
		by = 12;	// value -128 ~ 127 -> 범위가 넘어가면 오류가 남.
		
		byte by1 = 24; // 선언과 동시에 대입
		
		System.out.println("by = " + by);
		System.out.println("by1 = " + by1);
		
		System.out.println();
		// 정수 수치
		by = 20;
		System.out.println(by);
		
		short sh; // 2 byte 
		sh = 1234; 
		System.out.println("sh = " + sh);
		
		int Number; // 4byte
		Number = 1234567890; // 실무에서는 단위를 올려서 사용 ex) 원단위 -> 천원단위
		System.out.println("Number = " + Number);
		
		long lo; // 8byte
		lo = 4545454545454545L; //대문자 L을 붙여 long값임을 나타냄. L이 없을 경우 int값으로 생각해 오류가 남.
		System.out.println("lo = " + lo);
		
		System.out.println();
		//실수 수치
		float f; // 4byte
		f = 123.456111222333444555666f; // f를 붙이지 않으면 double로 인식함. 소숫점이 5자리가지 표기 -> 소숫점에 한계가 있어 사용빈도가 낮음.
		System.out.println("f = " + f);
		
		double d; // 8byte
		d = 123.123456789123456789;
		System.out.println("d = " +d); // 
		
		System.out.println();
		// 문자형
		
		char c; // 2byte 	 영문 -> 1byte 0 ~ 255		character
//							한글 -> 2byte -> c언어에서는 한글과 영문을 따로 취급. -> ASCII코드 사용 불가능
//							ASCII a(97)-z A(65)-Z 		
//							ASCII code -> Uni code UTF-8(유니코드)
		c = 'A';
		System.out.println("c = " + c);
		
//		c = '강';
//		System.out.println("c = " + c); //2byte
		
		System.out.println();
		// printf	%c %d %s
		System.out.printf("%c %d \n", c, (int)c); //정수 표현 (int)캐스티 변환(강제 변환) char -> int로 강제 변환
		
		System.out.println();
		// 문자열
		// String -> 자료형이 아님. Wrapper class -> 문자열을 편하게 쓸 수 있도록 만들어 놓은 객체
		
	
		String str; // str == 변수 -> 인스턴스(instance(주체))
		str = "안녕하세요.";
		System.out.println("str = " + str);
		
		str = "건강하세요";
		System.out.println("str = " + str);
		
		
		System.out.println();
		//논리형 -> 참(true)/거짓(false)
		//boolean 1byte
		//c언어: bool = 1byte		 BOOL = 4byte 
		
		boolean b;
		b = true; 
		System.out.println("b = " + b);
		b = false;
		System.out.println("b = " + b);
		
		System.out.println("TSET");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
