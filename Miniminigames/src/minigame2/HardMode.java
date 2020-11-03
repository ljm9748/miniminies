package minigame2;

import java.util.Scanner;

public class HardMode extends Player{
	
	/*
	 하드모드는 3번 연속 진행되고 한 번이라도 틀릴시 바로 탈락함.
	 3번 모두 성공하면 포인트를 받을 수 있음!
	 */
	
	// game2Life가 0이되면 game2Continue를 false로 변경해 게임이 종료되도록 함.(라이프개념)
	private boolean game2Continue = true;
	
	// 기본 nomalMode는 Life는 3으로 설정
	// 모두 맞춰야 점수를 받기때문에 한 번만 실패해도 탈락
	private int game2Life = 3;
	
	// nomalMode는 3번을 모두 성공해야 포인트를 받을 수 있음.
	// 성공시 ++victory를 해주어서 3이되면 성공
	private int victory = 0;
	
	// contains를 활용하여 예외처리 함.
	private String drinkBase = "물 우유 커피 바닐라 초코 얼음";
		

	// 게임 랭킹에 사용 될 승,패
	private static int win = 0;
	private static int lose = 0;
	
	public int getWin() {
		return win;
	}
	public int getLose() {
		return lose;
	}

	public void playerMakeDrink() {


		
	// 계속 실행되도록 반복문 
	while(game2Continue) {
		
		// 만약 victory == 3이면 포인트를 얻는다!
		if(victory == 3) {
			manager.updateScore(2, 0);
			System.out.println("대 성공~!! 포인트 100+ 획득^^"); 
			manager.updatePoint(100);// 포인트 200점 추가
			break;
		}
			
		// 음료의 재료를 입력받을 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 고객이 주문하는 것을 출력
		Customer choiceMenu = new Customer();
		choiceMenu.csOrder();
		
		System.out.println("하드모드는 세번 연속 성공해야 포인트를 얻을 수 있습니다.");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("     한  번  틀  리  면  게  임  오  버  입  니  다" );
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("--------------------------------------");
		System.out.println("[[[[[[[[[[[[[[재료저장고]]]]]]]]]]]]]]]]]");
		System.out.println("┏------------------------------------┓ ");
		System.out.println("┃  물  | 우유  | 커피  | 바닐라  | 초코 | 얼음   ┃ ");
		System.out.println("┗------------------------------------┛ ");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
		System.out.println("첫 번째 재료를 입력해주세요([물],[우유],[커피],[바닐라],[초코],[얼음])");
		String var1 = sc.nextLine();
		System.out.println("첫 번째로 넣을 재료는 = " + var1);
		
		// contains를 활용해서 해당하는 재료(drinkBase)가 아니면 else로 빠지게 함.
		if(drinkBase.contains(var1)){
			System.out.println("재료를 넣었습니다^0^");
		} else {
			--game2Life;
			manager.updateScore(2, 1);
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
			
		// 이 과정에서 game2Life가 < 3이면 그대로 게임오버.	
			if(game2Life < 3) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
			

		System.out.println("두 번째 재료를 입력해주세요([물],[우유],[커피],[바닐라],[초코],[얼음])");
		String var2 = sc.nextLine();
		System.out.println("두 번째로 넣을 재료는 = " + var2);
		
		if(drinkBase.contains(var2)){
			System.out.println("재료를 넣었습니다^0^");
		} else {
			--game2Life;
			manager.updateScore(2, 1);
			System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
			
			if(game2Life < 3) {
				game2Continue = false;
				System.out.println("Game Over~~!");
			}
			continue;
		}
		
		
		System.out.println("세 번째 재료를 입력해주세요([물],[우유],[커피],[바닐라],[초코],[얼음])");
		String var3 = sc.nextLine();
		System.out.println("세 번째로 넣을 재료는 = " +var3);
		
		if(drinkBase.contains(var3)){
			System.out.println("재료를 넣었습니다^0^");
		} else {
			--game2Life;
			manager.updateScore(2, 1);
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
			System.out.println("잘 마셨습니다~ ^^ 성공 횟수 : " + victory); 			
		} else {
			--game2Life;
			manager.updateScore(2, 1);
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



