package exam;

import java.util.Scanner; 
// java.util.Scanner를 Scanner라는 이름으로 간단하게 사용할 수 있게 클래스를 import로 간단하게 불러온다.

public class ForExample2 {

	public static void main(String[] args) {

//		문제1 아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.
		/*
		 * int num=120;
		 * 
		 * if(num>0) {
		 * 
		 * if((num%2)==0)
		 * 
		 * System.out.println(“양수이면서 짝수");
		 */
		System.out.println("-----문제1-----");
		int num = 120;

		if (num > 0 && num % 2 == 0) {
			System.out.println("num은 양수이면서 짝수");
		}

//		문제2
		/*
		 * 다음과 같이 출력이 이루어지도록 작성해보자. num < 0 이라면 “0 미만” 출력 0 ≤ num <100 이라면 “0이상 100 미만“
		 * 출력 100 ≤ num < 200 이라면 “100이상 200 미만“ 출력 200 ≤ num < 300 이라면 “200이상 300 미만“
		 * 출력 300 ≤ num 이라면 “300이상 “ 출력
		 */
		System.out.println("-----문제2-----");

		num = 20;

		if (num < 0) {
			System.out.println("0미만");
		} else if (num < 100) { //num >= 0 && num < 100
			System.out.println("0이상 100미만");
		} else if (num < 200) { //num >= 100 && num < 200
			System.out.println("100이상 200미만");
		} else if (num < 300) { //num >= 200 && num < 300
			System.out.println("200이상 300미만");
		} else {
			System.out.println("300이상");
		}

//		문제3
		System.out.println("-----문제3-----");
		int num1 = 50;
		int num2 = 100;
		int big, diff;
		if (num1 > num2) {
			big = num1;
		} else {
			big = num2;
		}
		System.out.println("big: " + big);
		if (num1 > num2) {
			diff = num1 - num2;
		} else {
			diff = num2 - num1;
		}
		System.out.println("diff: " + diff);

//		문제4
		System.out.println("-----문제4-----");
		int n = 2;
		if (n == 1) {
			System.out.println("Simple Java");
		} else if(n==2) {
			System.out.println("Funny Java");
		} else if(n==3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");		
		}
		System.out.println("Do you like coffee?");
		
//		문제5
		System.out.println("-----문제5-----");
		/*num = 20;

		if (num < 0) {
			System.out.println("0미만");
		} else if (num < 100) { //num >= 0 && num < 100
			System.out.println("0이상 100미만");
		} else if (num < 200) { //num >= 100 && num < 200
			System.out.println("100이상 200미만");
		} else if (num < 300) { //num >= 200 && num < 300
			System.out.println("200이상 300미만");
		} else {
			System.out.println("300이상");
		} */
		
		num = 350;
		
		if(num<0) {
			System.out.println("0미만");
		}
		switch(num/100) {
		
			case 0: 
				System.out.println("0이상 100 미만");
				break;
			case 1: 
				System.out.println("100이상 200미만");
				break;
			case 2:
				System.out.println("200이상 300미만");
				break;
			default:
				System.out.println("300이상");
				break;
		}

		
//		문제6
		System.out.println("-----문제6-----");
		// 1. 1~99출력
		// 2. 합을 구한다
		int i=0;
		int sum = 0;
		
		while(i<100) {
			sum += i;
			++i;
		} System.out.println("1~99까지의 합: " + sum);
		
		
		
		
		
//		문제7
		System.out.println("-----문제7-----");
		i = 1;
		while(i<100) {
			++i;
			System.out.println("i: " + i);
			
		}
		do {
			--i;
			System.out.println("i: " + i);
		} while(i>0);
		
		
//		문제8
		System.out.println("-----문제8-----");
		// 1000이하의 자연수 중에서
		// 2의 배수이면서 7의 배수인 숫자를 출력하고,
		// 출력된 숫자들의 합을 구하는 프로그램을
		// while 문을 이용해서 작성
		
		while(i<=1000) {
			i++;
			if(i%2==0 && i%7==0) {
				System.out.println("i: " + i);
				sum += i;
			} 
		}
		System.out.println("2의 배수이면서 7의 배수인 숫자들의 합: " + sum);
		
//		문제9
		// for문을 이용하여 1부터 10까지 곱해서 그 결과를 출력하는 프로그램을 작성
		System.out.println("-----문제9-----");
		
//		문제10
		//for문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성
		System.out.println("-----문제10-----");
		
		i=5;
		for(int j=1; j<10; j++) {
			System.out.println(i + "x" + j + "=" + i*j);
		}
		
		
//		문제11
		System.out.println("-----문제11-----");
		num=0;

		int count=0;

		/*while((num++)<100){

		if(num%5!=0 || num%7!=0)

		continue;

		count++; */
		
		for(num=0; num<100; num++) {
			if(num%5!=0 || num%7!=0) {
				continue;
			}
			count++;

		System.out.println(num);

		}

		System.out.println("count: " + count);

		
		
//		문제12
		// 자연수 1부터 시작해서 
		// (모든 홀수)와 (3의 배수인 짝수)를 더해 나간다.
		// 그리고 그 합인 언제(몇을 더했을 때) 1000이 넘어서는지, -> 탈출의 조건
		// 그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출려하는 프로그램 
		// 프로그램 내부에 while문을 무한 루프로 구성하여 작성
		System.out.println("-----문제12-----");
		
		num = 1;
		sum = 0;
		while(true) {
			
			if(num%2==1 || (num%3==0 && num%2==0)) {
				sum += num;				
			} 
			if(sum>1000) {
				System.out.println("1000이 넘어값니다.");
				System.out.println("num: "  + num + ", sum: " + sum);
				break;
			} 
			num++;
			
		} 
		
		
		
		
		
//		문제13
		// 반복문 중첩
		// 구구단의
		// 짝수 단(2, 4, 8)만 출력하는 프로그램 작성.
		// 단, 2단은 2x2까지, 4*4까지, 8단은 8*8까지 출력
		System.out.println("-----문제13-----");
		
		for(i=2; i<10; i*=2) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + "x" + j + "=" + i*j);		
			}
		}

		
//		문제14
		// 조합을 찾는 프로그램
		// 10자리 A, 1의 자리 B 
		//+10자리 B, 1의 자리 A
		//= 99 
		System.out.println("-----문제14-----");
		n = 0;
		
		System.out.println("	A B");
		System.out.println("	B A");
		System.out.println("+");
		System.out.println("--------");
		System.out.println("    9 9");
		System.out.println("위의 조건이 성립하는 조합은 아래와 같습니다.");
		
		for(n=0; n<10; n++) {
			int a, b;
			a = n;
			b = 9 - n;
			System.out.println("a는 " + a + "일 때, b는 " + b);
					
		} 
		
//		문제15
		System.out.println("-----문제15-----");
		n = 5;
		
		// if문
		if(n==1) {
			System.out.println("현재 인원은 1명 입니다.");
		} else if(n==2) {
			System.out.println("현재 인원은 2명 입니다.");			
		} else if(n==3) {
			System.out.println("현재인원은 3명 입니다.");
		} else {
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		
		
		//sitch문
		switch(n) {
			case 1:
				System.out.println("현재 인원은 1명 입니다.");		
				break;
			case 2: 
				System.out.println("현재 인원은 2명 입니다.");
				break;
			case 3:
				System.out.println("현재 인원은 3명 입니다.");
				break;
			default:
				System.out.println("현재 많은 사람들이 있습니다.");
				break;
		}	
		
//		문제 16
		// 1부터 99까지의 합을 구하는 프로그램 작성
		// while문, for문, do while문을 각각 사용
		
		num = 0;
		sum = 0;
		
		
		// while문
		while(num<100) {
			sum += num;
			num++;
		} System.out.println("1 부터 99까지의 합: " + sum);
		
		
		// for문
		sum = 0;
		for(i=0; i<100; i++) {
			sum += i;
		}  System.out.println("1 부터 99까지의 합: " + sum);
		
		//do while문
		num = 0;
		sum = 0;
		do {
			sum += num;
			num++;
		} while(num<100); {
			
		} System.out.println("1 부터 99까지의 합: " + sum);
	}

}
