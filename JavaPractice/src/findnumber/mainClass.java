package findnumber;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
			숫자 찾기 게임
			
			random number
			범위: 1 ~ 100 -> number(71)			
						
			user 입력: 50
			-> 너무 작습니다
			user 입력: 75
			-> 너무 큽니다
			user 입력: 65
			-> 너무 작습니다
			user 입력: 70
			-> 너무 작습니다

		*/
		
		// 1.변수의 선언
		int r_num, u_num;
		boolean clear;
		String s_num;
		
		clear = false;
		
		// 2.랜덤 수의 산출(1 ~ 100)
		r_num = (int)(Math.random() * 100) + 1;
		System.out.println("r_num:" + r_num);
		
		// ------------------------ loop -> 10회
		boolean b = false;
		int count = 0;
		
		while(count < 10) {
		
			// 3.유저의 입력
			while(true) {	
				b = false;
				System.out.print((count + 1) + "회 숫자입력 = ");
			//	u_num = sc.nextInt();
				s_num = sc.next();		
				// System.out.println( s_num.length() );
				// abc
				for(int i = 0;i < s_num.length(); i++) {
					char c = s_num.charAt(i);
				//	System.out.println("c = "+ c);
					
					/*
					if(c != '0' && c != '1' && c != '2' &&
						c != '3' && c != '4' && c != '5' &&
						c != '6' && c != '7' && c != '8' &&
						c != '9') {
						System.out.println("정상적인 숫자를 입력해 주십시오");
						b = true;
						break;
					}
					*/
					
					int asc = (int)c;
					if(asc < 48 || asc > 57) { // 숫자의 범위
						System.out.println("정상적인 숫자를 입력해 주십시오");
						b = true;
						break;
					}					
				}			
				if(b == false) {	// 문제 없음
					//System.out.println("문제없이 입력함");
					break;
				}	
				
				System.out.println("b = " + b);
			}
			
			// 문자열 -> 숫자
			u_num = Integer.parseInt( s_num );
					
			// 4.판정(크다/작다)
			if(u_num > r_num) {
				System.out.println("너무 큽니다");
			}
			else if(u_num < r_num) {
				System.out.println("너무 작습니다");
			}
			else {	// 숫자를 맞춘경우
				clear = true;
				break;
			}
			
			count++;
		}
		// ------------------------
		
		// 5.결과
		if(clear) {
			System.out.println("Game Clear!");			
		}
		else {
			System.out.println("Game Over~");
		}

	}

}




