package minigame2;

import java.util.Scanner;

public class hardMode {
	
	/*
	 하드모드는 3번 연속 진행되고 한 번이라도 틀릴시 바로 탈락함.
	 3번 모두 성공하면 포인트를 받을 수 있음!
	 */
	
	// game2Life가 0이되면 game2Continue를 false로 변경해 게임이 종료되도록 함.(라이프개념)
	boolean game2Continue = true;
	
	// 기본 nomalMode는 Life는 3으로 설정
	// 모두 맞춰야 점수를 받기때문에 한 번만 실패해도 탈락
	int game2Life = 3;
	
	// nomalMode는 3번을 모두 성공해야 포인트를 받을 수 있음.
	int victory = 0;
	
	//플레이어는 음료를 만든다
	void playerMakeDrink() {
		
	// 계속 실행되도록 반복문 
	while(game2Continue) {
		
		// 만약 victory == 3이면 포인트를 얻는다! -> 게임종료(성공)
		if(victory == 3) {
			System.out.println("대 성공~!! point+200");
			break;
		}
			
		// 음료의 재료를 입력받을 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 먼저 고객이 주문하는 것을 표현함.
		Customer choiceMenu = new Customer();
		choiceMenu.csOrder();
		
		System.out.println("**************************");
		System.out.println(" 한  번  틀  리  면  게  임  오  버  입  니  다" );
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
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
			
			if(game2Life < 3 ){
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
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T ");
			
			if(game2Life < 3) {
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
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
			
			if(game2Life < 3) {
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
		String pDrink = playerMake.getDrink();
		
		// 고객이 주문한 음료 = csOrder 에서 선택된 메뉴 (return의 값 : menu)
		String cDrink = choiceMenu.lastChoice();
		
		
		// 고객이 주문한음료 .equals 플레이어가 만든음료
		if(cDrink.equals(pDrink)) {
			++victory;
			System.out.println("잘 마셨습니다~ ^^ 성공 회수 : " + victory); 			
		} else {
			--game2Life;
			System.out.println("더럽게 맛 없네 다신 안와!!!!!!!!");
			
			if(game2Life < 3) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			continue;
			}
			
		}
		
		}
	
	}	
		
}	



