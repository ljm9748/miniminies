package minigame2;

import java.util.Scanner;

public class Player {

	/*
	 플레이어 : 1. 주문을 확인함
	  	     2. 음료를 만듬	
	  	     3. 손님에게 제공 (비교판단??)
	 */
	
	
	// game2Life가 0이되면 game2Continue를 false로 변경해 게임이 종료되도록 함.(라이프개념)
	boolean game2Continue = true;
	// 기본 Life는 5로 설정
	int game2Life = 5;
	

	//플레이어는 음료를 만든다
	void playerMakeDrink() {
		
		// 계속 실행되도록 반복문 
		while(game2Continue) {
			
		// 음료의 재료를 입력받을 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 음료만들기 메뉴 선택시 보여줄 화면 
		
		// 먼저 고객이 주문하는 것을 표현함.
		Customer choiceMenu = new Customer();
		choiceMenu.csOrder();
		
		System.out.println("**************************");
		System.out.println("                  남은 목숨 : "+game2Life       );
		System.out.println("---------------------------------");
		System.out.println(" ┌-----준비된 재료 리스트를 확인하세요----┐");
		System.out.println(" | 물 | 우유 | 커피 | 바닐라 | 초코 | 없음|");
		System.out.println(" └-------------------------------┘");
		System.out.println("**************************");
		
		// 메인재료(첫 번째 재료 스캐너로 입력받기)
		System.out.println("메인 재료를 하나 선택해 입력해주세요([물] 또는 [우유])");
		String var1 = sc.nextLine();
		System.out.println("첫 번째로 넣을 재료는 = " + var1);
		
		// 메인재료 예외처리 
		// -> 물이나 우유외에 다른내용이 입력되면
		// -> 라이프를 차감하고 다시 선택하도록 함
		// -> 라이프를 차감했을때 라이프가 0이라면 게임오버.
		
		if(var1.equals("물") || var1.equals("우유")){
			System.out.println("메인 재료를 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨 : "+ game2Life);
			
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
			
		// 추가재료 선택하기 (메인재료 예외처리와 동일)
		System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
		String var2 = sc.nextLine();
		System.out.println("두 번째 선택한 재료는 = " + var2);
		
		// 추가재료 예외처리
		if(var2.equals("커피") || var2.equals("바닐라") || var2.equals("초코")||var2.equals("없음")){
			System.out.println("추가 재료 1번을 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨 : "+ game2Life);
			
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		// 추가재료 선택하기2
		System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
		String var3 = sc.nextLine();
		System.out.println("세 번째 선택한 재료는 = " +var3);
		
		// 추가재료 예외처리2
		if(var3.equals("커피") || var3.equals("바닐라") || var3.equals("초코")||var3.equals("없음")){
			System.out.println("추가 2번을 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨 : "+ game2Life);
			
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		// 음료 제공 (비교 및 판단하기)
		
		// 플레이어가 입력한 var1, var2, var3이 recipe에 들어가 음료명(drink) 로 반환됨. 
		MakeDrink playerMake = new MakeDrink();
		playerMake.recipe(var1, var2, var3);
		
		// 플레이어가 만든 음료 = recipe에 입력되어 반환된 음료이름 
		String pDrink = playerMake.drink;
		
		// 고객이 주문한 음료 = csOrder 에서 선택된 메뉴 (return의 값 : menu)
		String cDrink = choiceMenu.lastChoice();
		
		
		// 고객이 주문한음료 .equals 플레이거가 만든음료  
		if(cDrink.equals(pDrink)) {
			System.out.println("잘 마셨습니다~ ^^ 포인트 +100"); // 포인트는 팀원들과 협의 후 적정선으로 int타입으로 추가 (10:45)
			break;
		// 고객이 주문한 음료와 일치하지 않는다면? =  라이프 차감 + 포인트없음 + 실패	
		} else {
			--game2Life;
			System.out.println("더럽게 맛 없네 다신 안와!!!!!!!! 남은목숨 : " + game2Life);
			
			if(game2Life==0) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			continue;
			}
		}
		
		} // 반복문 끝
		
	}
}


