package ifclass;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		 	제어문
		 	
		 	조건문
		 		if
		 		else
		 		
		 		if
		 		else if
		 		
		 		if
		 		else if
		 		else if
		 		else
		 		
		 		switch(값이 명확해야 함.)
		 		
		 	
		 	순환문
		 		for
		 		
		 		foreach(for문의 간략화)
		 		
		 		while
		 		
		 		do while	
		 				break
		 				continue		 			 			 	
		 	 
		 */
		
		/*
		 	논리연산자(true or false)
		 	&& AND
		 	|| OR
		 	!  NOT
		 	 + 부등호  > < >= >= == !=
		 	 
		 	 
		 	조건문 형식
		 	if(조건(true)){
		 		처리
		 	}
		 */
		
		int number = 5;
		
		if(number > 0) {
			
			System.out.println("number는 0보다 큽니다."); // => 출력값: number는 0보다 큽니다.
			
		}
		
		if(number > 5) {
			System.out.println("number는 5보다 큽니다."); // 값이 false라 출력되지 않음.
		}
		
		if(number >= 5) {
			System.out.println("number는 5보다 크거나 같다.."); // => 출력값:number는 5보다 크거나 같다.. 
		}
		
		if(number == 5) {
			System.out.println("number는 5이다."); // => 출력값:number는 5이다.
			
		} 
		
		if(number > 0 && number < 10) {
			System.out.println("number는  0보다 크고 10보다 작습니다."); // =>출력값: number는  0보다 크고 10보다 작습니다.
				
		}
		
		if(number < 5 || number < 10) {
			System.out.println("number는  5보다 작거나 10보다 작습니다."); // => 출력값: number는  5보다 작거나 10보다 작습니다.
			
		}
		
		boolean b;
		b = true;
		if(b == true) {
			System.out.println("b는 true입니다."); // => 출력값: b는 true입니다.
		}
	
		b = false;
//		if(b == false) {
		if(!b) {
			System.out.println("b는 false입니다."); // => 출력값: b는 true입니다.
		}
		
		if(number >0 && number <= 10) {
		
		}
		if(number == 1) {
		
		}
//		| -> 처리 속도는 논리연산자 보다 하나하나 나열하는 게 더 빠름.
		if(number == 10) {
		
		
		}
		
		if(!(number < 0 || number > 10)) { // !를 붙여줌으로써 값이 false -> true 바뀜
//		-> number >= 0 && number <= 10
			System.out.println("number는 0보다 작거나 10보다 큽니다."); // => 출력값: number는 0보다 작거나 10보다 큽니다.
			
		}
		
		
		/*
		 	if(조건1){ -> 둘 중 하나는 무조건 실행
		 		조건1이 true일 경우 실행
		 	} else{
		 		조건1이 false일 경우 실행
		 	}
		 */
		
		number = 10;
		if(number > 5) {
			System.out.println("number는 5보다 크다."); // => 출력값: number는 5보다 크다.
		} else {
			System.out.println("number는 5보다 작거나 같다."); // => 출력 x
		}
		
		number = 5;
		if(number > 5) {
			System.out.println("number는 5보다 크다."); // => 출력 x
		} else {
			System.out.println("number는 5보다 작거나 같다."); // => 출력값: number는 5보다 작거나 같다.
		}
		
		
		/*
		 	조건 분기
		 	n개의 조건
		 	if 
		 	else if
		 	else if
		 	else
		 	
		 */
		
		number = 85;
		
		if(number == 100) {
			System.out.println("A++ 입니다.");
			
			
		} else if(number >= 90) {
			System.out.println("A+ 입니다.");
			
		} else if( number >= 80) {
			System.out.println("B 입니다."); // => 출력값: B 입니다.
		}else if(number >= 70) {
			System.out.println("C 입니다.");
			
		} else{
			System.out.println("재시험 입니다.");
		}
		
		number = 65;
		
		if(number == 100) {
			System.out.println("A++ 입니다.");
			
			
		} else if(number >= 90) {
			System.out.println("A+ 입니다.");
			
		} else if( number >= 80) {
			System.out.println("B 입니다."); 
		}else if(number >= 70) {
			System.out.println("C 입니다.");
			
		} else{
			System.out.println("재시험 입니다."); // => 출력값: 재시험 입니다.
		}
		
		
		/*
		 	조건문 안의 조건문
		 	
		 */
		
		number = 95;
		// A++ / A+
		if(number >= 90) {
			// A++ > 95
			if(number>=95) {
				System.out.println("A++ 입니다.");
				
				
			} else {// A+ > 90
				System.out.println("A+ 입니다.");
				
			}
			
		} else if(number >= 80) {
			
		}
		
		// 판정
		// 입력한 숫자가 홀수냐 짝수냐?
		
		
		//결과가 홀수 입니다. 혹은 짝수 입니다.
		
		Scanner sc = new Scanner(System.in);
		// input
		System.out.print("숫자: ");
		number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
		
		
		// 분산처리 -> 최대한 분산처리 해라
		System.out.print("숫자: ");
		number = sc.nextInt();
		
		
		int one = 0;
				
		if(number%2==0) {
//			one == 0;
		} else {
			
		}
		
		// 3항 연산자
		String str;
		str = (number % 2 == 0)?"짝수입니다.":"홀수입니다.";
		System.out.println(str);
		
		//가독성이 중요!
		
		//String
		String str1 = "hello";
		String str2 = "hell";
		
		str2 = str2 + "o";
		
		System.out.println("str2: "+ str2);
		
		if(str1 == str2) {
			System.out.println("같은 문자열 입니다.");
			
		}
		
		if(str1.equals(str2) == true) { // 문자열 비교시 정확하게 비교할 수 있는 함수
			System.out.println("equals 같은 문자열 입니다.");
		}
		
		
		
		
		
		
		
	}

}
