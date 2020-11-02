package minigame2;

import java.util.Scanner;

public class MakeDrink {
	
	// 입력을 받기위한 스캐너
	Scanner sc = new Scanner(System.in);
	
	// 만든 음료의 값을 반환받을 String타입의 drink초기화
	String drink;

	// 재료 3개를 입력받아 음료를 제조함 만약 레시피에 없는 음료일시 else로(실패) 처리
	String recipe (String var1, String var2, String var3) {
		
		// 아메리카노 (물 + 커피 + 없음) | (물 + 없음 + 커피)
		if(var1.equals("물") && var2.equals("커피") && var3.equals("없음")) {
			System.out.println("**************************");
			System.out.println("아메리카노 완성");
			System.out.println("**************************");
			drink = "아메리카노";
		} else if (var1.equals("물") && var2.equals("없음") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("아메리카노 완성");
			System.out.println("**************************");
			drink = "아메리카노";
			
		// 카페라떼 (우유 + 커피 + 없음) | (우유 + 없음 + 커피)	
		} else if (var1.equals("우유") && var2.equals("커피") && var3.equals("없음")){
			System.out.println("**************************");
			System.out.println("카페 라떼 완성");
			System.out.println("**************************");
			drink = "카페라떼";
		} else if (var1.equals("우유") && var2.equals("없음") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("카페 라떼 완성");
			System.out.println("**************************");
			drink = "카페라떼";

		// 바닐라 라떼 (우유 + 바닐라 + 커피) | (우유 + 커피 + 바닐라) 	
		} else if (var1.equals("우유") && var2.equals("바닐라") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("바닐라 라떼 완성");
			System.out.println("**************************");
			drink = "바닐라라떼";
		} else if (var1.equals("우유") && var2.equals("커피") && var3.equals("바닐라")){
			System.out.println("**************************");
			System.out.println("바닐라 라떼 완성");
			System.out.println("**************************");
			drink = "바닐라라떼";
			
		// 카페 모카 (우유 + 초코 + 커피) | (우유 + 커피 + 초코)
		} else if (var1.equals("우유") && var2.equals("초코") && var3.equals("커피")){
			System.out.println("**************************");
			System.out.println("카페 모카 완성");
			System.out.println("**************************");
			drink = "카페모카";
		} else if (var1.equals("우유") && var2.equals("커피") && var3.equals("초코")){
			System.out.println("**************************");
			System.out.println("카페 모카 완성");
			System.out.println("**************************");
			drink = "카페모카";
			
		// 음료 제조 실패
		} else 
			System.out.println("음료 제조에 실패했습니다~~T.T");
		
		// 만든 음료를 String타입의 drink로 반환
		return drink;
	}

	
	
}
