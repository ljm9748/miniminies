package operator;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

//	If문과 if~else문
		int num = 10;
		if (num > 0) {
			System.out.println("num은 0보다 크다");

		}

		if ((num % 2) == 0) {
			System.out.println("num은 짝수");

		} else {
			System.out.println("num은 홀수");
		}

		System.out.println();

		Scanner sc = new Scanner(System.in);
//		if~else문의 중첩
		int score = 0;
		String grade = null;

		System.out.print("점수를 입력하세요>>");
		score = sc.nextInt();

		if (score >= 90) { // score가 90점돠 같거나 크면 A학점(grade)
			grade = "A";
			if (score >= 98) {
				grade += "+"; // grade = grade + "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";

			if (score >= 88) {
				grade += "+";
			} else if (score < 84) {
				grade += "-";

			}
		} else { // if, else if문도 속하지 않을 경우 else문 결과가 출력된다.
			grade = "C";
		}

		System.out.println("학생의 점수는: " + score + " 성적은:  " + grade);

		System.out.println();
//		문제1 아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if문만 사용하는 방식으로 변경해보자.
		// 수정 전
		int num1 = 12;

		if (num1 > 0) {
			if ((num1 % 2) == 0) {
				System.out.println("양수이면서 짝수");
			}
		}

		// 수정 후

		if (num1 > 0 && (num1 % 2) == 0) { // &&를 사용해서 두 개의 문장을 하나로 합칠 수 있다.
			System.out.println("양수이면서 짝수");
		}

		System.out.println();
//		다음과 같이 출력이 이루어지도록 작성해보자.

		int num2 = 0;
		System.out.print("숫자를 입력하세요>>");
		num2 = sc.nextInt();
		// num2<0 이라면 "0 미만" 출력
		if(num<0) {
			System.out.println("num2는 0 미만");
		}
		// 0<=num2<100 이라면 "0이상 100 미만" 출력
		else if(num>=0&&num2<100) {
			System.out.println("num2는 0이상 100미만");
		}
		// 100<=num2<200이라면 "100이상 200 미만" 출력
		else if(num2>=100&&num2<200) {
			System.out.println("num2는 100이상 200미만");
		}
		// 300<=num2 이라면 "300이상" 출력
		else {
			System.out.println("num2는 300 이상");
		}
		
		System.out.println();
//		CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고, if~else를 사용하는 형태로 변경해보자.
		num1 = 50;
		num2 = 100;
		int big, diff;
		
		if(num1>num2) {
			System.out.println("big = "+ num1);
		} else {
			System.out.println("big = "+num2);
		}
		
		if(num1>num2) {
			diff = num1-num2;
			System.out.println("diff = " + diff);
		} else {
			diff = num2-num1;
			System.out.println("diff = " + diff);
		}

	}

}
