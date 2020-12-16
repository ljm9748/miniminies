package exam;

public class ExamMethod {
	public static void main(String[] args) {
		// 메소드: 데이터를 받아서, 처리하고, 결과를 반환하는 기능
		
		// 1번 메소드 호출
		System.out.println("-----문제01-----");
		cal(10, 3);
		
		// 2번 메소드 호출
		System.out.println("-----문제02-----");
		abs(-3, -7);
		
		// 3번 메소드 호출
		System.out.println("-----문제03-----");
		// 원의 넓이 구하기
		System.out.println(cirArea(5));
		// 원의 둘레
		System.out.println(circu(5));
		
		// 4번 메소드 호출
		System.out.println("-----문제04-----");
		// 1~100까지의 범위에서 소수 찾기
		//System.out.println(isPrimeNumber(3)); -> test
		//System.out.println(isPrimeNumber(4)); -> test
				
		for(int i=1; i<=100; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
		
		
		
	}	
//		문제01 -> return이 없다(반환하는 데이터가 없다.)
		/*
		  	두 개의 정수를 전달 받아서, 
		  	두 수의 사칙 연산 결과를 출력하는 메소드와
		  	이 메소드를 호출하는 main메소드를 정의해보자
		  	단. 나눗셈은 몫과 나머지를 각각 출력해야 한다. 
		  	return이 없다.
		 */
	static void cal(int num1, int num2) {
			// 사칙연산 결과를 출력하는 메소드 생성
			// 사칙연산: +, -, *, /, %
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
		}
	
//		문제02
		/*
		 	두 개의 정수를 전달 받아서,
		 	두 수의 절대값을 계산하여 출력하는 메소드와
		 	 이 메서드를 호출하는 main 메소드를 정의해보자
		 	 단 메소드 호출 시 전달되는 값의 순서에 상관없이 절대값이 게산되어서 출력되어야 한다.
		 	 return이 없다.
		 */
	
	static void abs(int num1, int num2) {
			System.out.println("num1의 절대값: " + (num1>0?num1:-num1));
			System.out.println("num2의 절대값: " + (num2>0?num2:-num2));
		
	}
	
//		문제03
		/*
		 	원의 반지름 정보를 전달하면,
		 	원의 넓이를 계산해서 반환하는 메소드와 (π*r∧2)
		 	원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고, (2*π*r)
		 	 이를 호출하는 main메소드를 정의하자
		 	(2*π*r)- 둘레, (π*r∧2)- 넓이 // π -> double 타입​
		 */
	static double cirArea(double radius) {	// radius - 반지름 // 넓이
			return Math.PI*radius*radius;
	}
	
	static double circu(double radius) {	// 둘레
			return 2*Math.PI*radius;
	}
	
//		문제04
		/*
	 		전달되는 값이 -> 매개변수 필요 -> int
	 		소수(prime number)인지 아닌지를 판단하여, -> 처리-> 소수: 1과 자기 자신으로만 나누어 떨어지는 수
	 		소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, -> 반환 (boolean)
	 		이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
		 */
	
	static boolean isPrimeNumber(int num) {
		
		
			int cnt = 0;
			// 소수인지 아닌지 판별
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					cnt++;
				}
			}
		
			return cnt>2?false:true;
	}
	
	
	
		
	
	
}
