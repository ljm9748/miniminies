package exam;

import java.util.Scanner;
// Ctrl + Shift + O -> 자동 import

public class ExamFor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);		
		
//		문제 1 int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		System.out.println("-----문제01-----");
		/*int x = 11;
		if(x>10 && x<20) {
			System.out.println("true");
		} else {
			System.out.println("false");
		} */
		int x = 15;
		boolean chk1 = x>10 && x<20;
		System.out.print("int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식: ");
		System.out.println(chk1);
		
//		문제 2 char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		System.out.println("-----문제02-----");
		/*char ch = 'a';
		if(!(ch ==' ' || ch == '\t')) {
			System.out.println("true");
		} else {
			System.out.println("false");			
		}*/
		
		char ch = 'a';
		boolean chk2 = ch!=' ' || ch!='\t';
		boolean chk22 = !(ch == ' ' && ch == '\t');
		System.out.print("char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식: ");
		System.out.println(chk2);
		System.out.println("char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식: " + chk22);
		
		
//		문제 3 char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식		 
		System.out.println("-----문제03-----");
		/*ch = 'x';
		if(ch=='x' || ch=='X') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}*/
		
		ch = 'x';
		boolean chk3 = ch=='x' || ch=='X';
		System.out.println("char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식: " + chk3);
		
		
//		문제 4 char형 변수 ch가 숫자('0'~'9')일 때, true인 조건식
		System.out.println("-----문제04-----");
		/*ch = 'a';
		if(ch>='0' && ch<='9') {
			System.out.println("true");
		} else {
			System.out.println("false");
		} */
		
		ch = '0';
		boolean chk4 = ch>='0' && ch<='9';
		System.out.println("char형 변수 ch가 숫자('0'~'9')일 때, true인 조건식: " + chk4);
		
		
//		문제 5 char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		System.out.println("-----문제05-----");
		/*ch = 'a';
		if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}*/
		
		ch = 'A';
		boolean chk5 = (ch>='a'&& ch<='z') || (ch>='A' && ch<='Z');
		System.out.println("har형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식: "+ chk5);
		
		
//		문제 6  int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로나눠떨어지지않을 때 true인 조건식
		System.out.println("-----문제06-----");
		/*int year = 400;
		if((year%400==0)||(year%4==0 && year%100!=0)) {
			System.out.println("true");		
		} else {
			System.out.println("false");
		}*/
		int year = 445;
		boolean chk6 = (year%400==0) || (year%4==0 && year%100!=0);
		System.out.println("(year%400==0) || (year%4==0 && year%100!=0): " + chk6);
		
		

//		문제 7 boolean형 변수 powerOn가 false일 때 true인 조건식
		System.out.println("-----문제07-----");
		
		/*boolean powerOn = false;
		if(powerOn = false) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}*/
		
		boolean powerOn = false;
		boolean chk7 = !powerOn;
		System.out.println("boolean형 변수 powerOn가 false일 때 true인 조건식: " + chk7);

//		문제 8 문자열 참조변수 str이 “yes”일 때 true인 조건식
		System.out.println("-----문제08-----");	
		/*String str = "yes";
		if(str == "yes") {
			System.out.println("true");
		} else {
			System.out.println("false");
		}*/
		
		String str = "yes";
		boolean chk8 = str == "yes";		// 참조값 비교
		boolean chk88 = str.equals("yes");	// 저장하는 문자열 비교
		System.out.println("문자열 참조변수 str이 “yes”일 때 true인 조건식: " + chk8);
		System.out.println("문자열 참조변수 str이 “yes”일 때 true인 조건식: " + chk88);
		
//		문제 [2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		System.out.println("-----문제[2]-----");	
		
		int sum = 0; 
		for(int i=1; i<=20; i++) {
			if((i%2!=0) && (i%3!=0)) {
				sum += i;
				System.out.println("i: " + i + ", sum:" +sum);
			} 
		}
		
		
		
		
//		문제[3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		System.out.println("-----문제[3]-----");
		
		sum = 0;
		/*int result = 0;
		for(int i=1; i<10; i++) {
			sum += i;
			result += sum;
		} System.out.println("result: " + result); */
		
		int n = 1;
		int beforeSum = 0;
		for(int i=1; i<=10; i++){
			beforeSum += i;
			sum = sum + (sum + beforeSum);
		}
		System.out.println(sum);
		 
//		문제[4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
		//몇까지 더해야 총합이 100이상이되는지 구하시오.
		System.out.println("-----문제[4]-----");	
		/*
		 * int i = 1; sum = 0; int Hnum = 0; int Jnum = 0; while(i>0) { i++; if(i%2==0)
		 * { Jnum = -i; System.out.println("Jnum:" + Jnum); } else { Hnum = i;
		 * System.out.println("Hnum:" + Hnum); }
		 * 
		 * sum = Hnum + Jnum; if(sum<=100) {
		 * 
		 * System.out.println("sum: " + sum);
		 * 
		 * } }
		 */
		n = 1;
		sum = 0;
		
		while(true) {
			int num = (n%2==0)?-n:n;
			//System.out.println(num);
			sum += num;
			
			if(sum>=100) {
				System.out.println(n + "을 더했을 때 100이상인  " + sum +"이 됩니다.");
				break;
			}			
			n++;
		}
		
//		문제 [5] for -> while
		System.out.println("-----문제[5]-----");
		
		/*for(int i=0; i<=10; i++) {

			for(int j=0; j<=i; j++)

			System.out.print("*");

			System.out.println();

			} */
		
		int i =0;
		
		while(i<=10) {
			int j = 0;	
			System.out.print(" ");
			while(j<=i) {
				System.out.println("*");
				
				j++;
			}i++; 
			
		}
		
		
		
//		문제 [6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을작성하시오.
		// 1 ~ 6 -> 반복의 범위
		// dice1 + dice2 = 6 -? dice2 = 6-dice1
		System.out.println("-----문제[6]-----");
		
		sum = 0;
		for(i=1; i<6; i++) {
			System.out.print("첫번째 주사위가 " + i + "일 때");
			System.out.println("두번째 주사위는 " + (6-i) + "여야 한다.");
		}
		
//		문제 [7] 
		System.out.println("-----문제[7]-----");
		
		int value = (int)(Math.random()*6)+1;
		System.out.println("value: " + value);
		
//		문제[8] 방정식 2x+4y=10의 모든 해를 구하시오 => x+2y=5
		// 단, x와 y는 정수이고
		// 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		System.out.println("-----문제[8]-----");
		
		for(x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2*x + 4*y == 10) {
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}
		
//		문제[9]
		// 숫자로 이루어진 
		// charAt(inti) -> "12345" => index: 01234
		System.out.println("-----문제[9]-----");
		
		str = "12345";
		int cNum = Integer.parseInt(str);		// -> 문자열을 -> int형으로 바꿔줌
		sum = 0;
		
		for(i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
			sum += str.charAt(i)-'0';	// 자동 형변환 됐음 -> 49-48, 50-48, 51-48, 
		} 
		System.out.println("sum: " + sum);
		
//		문제[10]
		//int타입의 변수 num이 있을 때,
		// 각 자리의 합을 더한 결과를 출력하느 ㄴ코드를 완성하라.
		// 만일 num의 값이 12345라면,
		// '1+2+3+4+5'의 결과인 15
		
		// 자리수 구하기 
		// num%10 -> 1의 자리수
		// num/10 -> 10의 자리수 -> 1의 자리수가 된다.
		// 반복의 조건: num>0
		System.out.println("-----문제[10]-----");
		
		int num = 12345;
		sum = 0;
		
		while(num>0) {
			System.out.println("num: " + num);
			sum = sum + (num%10);
			num = num/10;
		}
		System.out.println("sum: " + sum);
		
//		문제[11] -> 정처기
		System.out.println("-----문제[11]-----");
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		for(i=0; i<8; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			
			num1 = num2;
			num2 = num3;
		}
		
//		문제[13]
		System.out.println("\n----- 문제[13]-----");
		
		str = "12o34";
		ch = ' ';
		
		boolean isNumber = true;
		
		// 반복문과 charAt(inti)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for(i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			} 
			if(isNumber) {
				System.out.println(value + "는 숫자입니다.");
			} else {
				System.out.println(value + "는 숫자가 아닙니다.");
			}
		}
//		문제 [14]
		// 다음은 숫자 맞추기 게임을 작성한 것이다.
		// 1거ㅣ 100 사이의 값을 반복적으로  입력해서 -> 사용자의 입력값
		// 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
		// 사용자가 값을 입력하면,
		// 컴퓨터는 자신이 생각한 값과 비교해ㅓㅅ 결과를 알려준다. => 비교 연선 출력
		// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고
		// 몇 번만에 숫자를 맞췄는지 알려준다.
		// (1) ~ (2) 에 알맞은 코드를 넣어 완성하시오.
		
		// 1~100 까지의 임의의 값을 얻어서 answer에 저장한다. 
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자 입력을 저장할 공간 
		int count = 0; // 시도 횟수를 세기 위한 변수
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요: ");
			input = s.nextInt();
			
			// 사용자가 입력한 값을 answer와 비교해서 결과를 출력
			// 큰수다!, 작은 수다!, 정답!
			if(answer>input) {
				System.out.println(input + "보다 크다.");
			} else if(answer<input) {
				System.out.println(input + "보다 작다.");
			} else {
				System.out.println("정답!");
				System.out.println(count + "회 만에 맞췄습니다. 게임을 종료합니다.");
				break;
			}
			
		} while(true); // 무한 반복문
				
		
//		문제[15]
		// 회문수를 구하는 프로그램이다.
		// 회문수란(palindrome)?
		// 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.
		// 예를 들면 '12321' 이나 '13531'
		System.out.println("-----문제[15]-----");
		
		int number = 9137319;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		while(tmp!=0) {
			result = result*10+(tmp%10);
			// 1 -> 1*10 + 2 -> (12)*10 + 3 -> 123*10+2 -> 1232*10+1
			tmp = tmp/10; // 12321-> 1232 -> 123-> 12-> 1-> 0
		}
		
		if(number == result) {
			System.out.println(number + "는 회문수 입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
		
	
		
		
		
		
	}

}
