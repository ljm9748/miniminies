package work2;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 	편의점에서 계산을 했을 경우
		 	
		 	지불해야 할 금액: 3,240원
		 	지불한 금액: 	10,000원
		 	
		 	거스름돈: 5천원권 몇장 1천원권 몇장? 500원 몇 개? 100원 몇 개? 50원 몇 개? 10원 몇 개?
		 	
		 	
		 	구하면 입력받는 걸로 변경
		 */
		int mymoney = 10000; //내 
		int price1 = 3240; // 지불해ㅑㅇ 될 금액
		int changemoney;		// 거스름돈
		
		System.out.print("지불해야 할 금액은? ");
		int price2 = sc.nextInt();
				
		changemoney = mymoney-price2;
		System.out.println("거스름돈: "+changemoney+"원");
		
		int m5000, m1000, m500, m100, m50, m10;
		m5000 = changemoney/5000;
		m1000 = (changemoney%5000)/1000;
		m500 = (changemoney%1000)/500;
		m100 = (changemoney%500)/100;
		m50 = (changemoney%100)/50;
		m10 = (changemoney%50)/10;
		
		
		System.out.println("5천원은 " + m5000 + "장");
		System.out.println("1천원은 " + m1000 + "장");
		System.out.println("5백원은 " + m500 + "개");
		System.out.println("1백원은 " + m100 + "개");
		System.out.println("5십원은 " + m50 + "개");
		System.out.println("1십원은 " + m10 + "개");
		
		
		
		

	}

}
