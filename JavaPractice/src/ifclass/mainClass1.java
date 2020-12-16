package ifclass;


import java.util.Scanner;

public class mainClass1 {

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
				
				switch

			순환문
				for
				
				foreach
				
				while
				
				do while
							break
							continue		
		*/
		
		/*
			논리연산자 (true/false)
			&& 	AND
			||  OR
			!   NOT
			
			부등호
			> < >= <= == !=
			
			형식
			
			if( 조건(true) ){
				처리
			}			
		*/
		
		int number = 5;
		
		if(number > 0) {
			System.out.println("number는 0보다 큽니다");
		}
		
		if(number > 5) {
			System.out.println("number는 5보다 큽니다");
		}
		
		if(number >= 5) {
			System.out.println("number는 5보다 크거나 같습니다");
		}
		
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
		
		if(number > 0 && number < 10) {	// 1 ~ 9
			System.out.println("number는 0보다 크고 10보다 작습니다");
		}
		if(number < 5 || number < 10) {
			System.out.println("number는 5보다 작거나 10보다 작습니다");
		}
		
		boolean b;
		b = false;
		if(b == true) {
			System.out.println("b는 true입니다");
		}
		
	//	if(b == false) {
		if(!b) {
			System.out.println("b는 false입니다");
		}
		
		// number >= 0 && number <= 10
		if( !(number < 0 || number > 10) ) {
			System.out.println("number는 0보다 작거나 10보다 큽니다");
		}
		
		/*
			if(조건1){
				조건1 = true
				처리1
			}
			else{
				처리2
			}		
		*/
		number = 5;
		if(number > 5) {
			System.out.println("number > 5");
		}
		else {
			System.out.println("number <= 5");
		}
		
		/*
			조건 분기
			n개의 조건
			if
			else if
			else if
			else if
			else
		*/
		
		number = 65;
		
		if(number == 100) {
			System.out.println("A++ 입니다");
		}
		else if(number >= 90) {
			System.out.println("A+ 입니다");
		}
		else if(number >= 80) {
			System.out.println("B 입니다");
		}
		else if(number >= 70) {
			System.out.println("C 입니다");
		}		
		else {
			System.out.println("재시험입니다");
		}
		
		// 조건문 안에 조건문
		number = 95;
		// A++ A+
		if(number >= 90) {			
			// A++	> 95
			if(number >= 95) {
				System.out.println("A++ 입니다");
			}			
			// A+	> 90
			else {
				System.out.println("A+ 입니다");
			}			
		}
		else if(number >= 80) {
			
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("숫자 = ");
		number = sc.nextInt();
		
		// 판정
		// 입력한 숫자가 홀수/짝수 인지?
		int one = 0;
		if(number % 2 == 0) {
			one = 0;
		//	System.out.println("짝수입니다");
		}
		else {
			one = 1;
		//	System.out.println("홀수입니다");
		}		
		
		// 결과
		// 홀수입니다/짝수입니다
		if(one == 0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
		
		// 3항 연산자
		String str;
		str = (number % 2 == 0)?"짝수입니다":"홀수입니다";
		System.out.println(str);	
		
		// 가독성
		
		// String
		String str1 = "hello";
		String str2 = "hell";
		
		str2 = str2 + "o";
		
		System.out.println("str2:" + str2);
		
		if(str1 == str2) {
			System.out.println("같은 문자열입니다");
		}
		
		if(str1.equals(str2) == true) {
			System.out.println("equals 같은 문자열입니다");
		}
		

	}

}












