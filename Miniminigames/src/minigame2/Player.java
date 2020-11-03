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
	
	// contains를 활용하여 예외처리 함.
	String drinkBase = "물 우유 커피 바닐라 초코 없음";
	
	static private int win = 0;
	static private int lose = 0;
	
	public int getWin() {
		return win;
	}


	public int getLose() {
		return lose;
	}

	//플레이어는 음료를 만든다
	public void playerMakeDrink() {
		
	
		
		// 계속 실행되도록 반복문 
		while(game2Continue) {
			
		// 재료를 입력받을 스캐너
		Scanner sc = new Scanner(System.in);
		 
		// 먼저 고객이 주문하는내용을 보여줌.
		Customer choiceMenu = new Customer();
		choiceMenu.csOrder();
		
		System.out.println("************************************");
		System.out.println("                  남은 기회 : "+game2Life       );
		System.out.println("---------------------------------");
		System.out.println(" ┌-----준비된 재료 리스트를 확인하세요----┐");
		System.out.println(" | 물 | 우유 | 커피 | 바닐라 | 초코 | 없음|");
		System.out.println(" └-------------------------------┘");
		System.out.println("************************************");
		
	
		System.out.println("첫 번째 재료를 입력해주세요([물],[우유],[커피],[바닐라],[초코],[없음])");
		String var1 = sc.nextLine();
		System.out.println("첫 번째로 넣을 재료는 = " + var1);
		
		// contains를 활용해서 해당하는 재료(drinkBase)가 아니면 else로 빠지게 함.
		if(drinkBase.contains(var1)){
			System.out.println("재료를 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨 : "+ game2Life);
			
		// 이 과정에서 game2Life가 0이면 그대로 게임오버.	
			if(game2Life==0) {
				++lose;
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
			

		System.out.println("두 번째 재료를 입력해주세요([물],[우유],[커피],[바닐라],[초코],[없음])");
		String var2 = sc.nextLine();
		System.out.println("두 번째로 넣을 재료는 = " + var2);
		
		if(drinkBase.contains(var2)){
			System.out.println("재료를 넣었습니다^0^");
		} else {
		
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨 : "+ game2Life);
			
			if(game2Life==0) {
				++lose;
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		
		System.out.println("세 번째 재료를 입력해주세요([물],[우유],[커피],[바닐라],[초코],[없음])");
		String var3 = sc.nextLine();
		System.out.println("세 번째로 넣을 재료는 = " +var3);
		
		if(drinkBase.contains(var3)){
			System.out.println("재료를 넣었습니다^0^");
		} else {
			--game2Life;
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T 남은목숨 : "+ game2Life);
			
			if(game2Life==0) {
				++lose;
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		// 음료 제공 (비교 및 판단하기)
		// 플레이어가 입력한 var1, var2, var3이 MakeDrink.recipe 에 들어가 음료명(drink)로 반환됨. 
		MakeDrink playerMake = new MakeDrink();
		playerMake.recipe(var1, var2, var3);
		
		// 플레이어가 만든 음료 = recipe에 입력되어 반환된 음료이름 (gtter사용)
		String pDrink = playerMake.getDrink();
		
		// 고객이 주문한 음료
		String cDrink = choiceMenu.lastChoice();
		
		// 고객이 주문한음료 .equals 플레이거가 만든음료  
		if(cDrink.equals(pDrink)) {
			++win;
			System.out.println("잘 마셨습니다~ ^^ 포인트 +50"); // 포인트 100단위로 수정해야함 (1103 10:16)
			break;
			
		// 고객이 주문한 음료와 일치하지 않는다면? =  라이프 차감 + 포인트없음 + 실패	
		} else {
			++lose;
			--game2Life;
			System.out.println("더럽게 맛 없네 다신 안와!!!!!!!! 남은목숨 : " + game2Life);
			
			if(game2Life==0) {
				++lose;
				game2Continue = false;
				System.out.println("Game Over~~!");
			continue;
			}
		}
		
		} // 반복문 끝
		
	}
}


