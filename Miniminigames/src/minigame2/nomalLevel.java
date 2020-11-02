package minigame2;

import java.util.Scanner;

public class nomalLevel {

	MakeDrink playerMake1 = new MakeDrink();
	MakeDrink playerMake2 = new MakeDrink();
	MakeDrink playerMake3 = new MakeDrink();
	
	// 노말모드 손님 3명
	Customer choiceMenu1 = new Customer();
	Customer choiceMenu2 = new Customer();
	Customer choiceMenu3 = new Customer();
	
	private String var1;
	private String var2;
	private String var3;
	private String var4;
	private String var5;
	private String var6;
	private String var7;
	private String var8;
	private String var9;
	
	
	private String drink1;
	private String drink2;
	private String drink3;
	
	private boolean game2Continue = true;
	private int game2Life = 5;
			
		
	Scanner sc = new Scanner(System.in);
	
	void nomalGame() {
			while(game2Continue) {
		
			// 노말모드 손님 3명
			choiceMenu1.csOrder();
			choiceMenu2.csOrder();
			choiceMenu3.csOrder();	
			
			System.out.println("*********************************");
			System.out.println("                  남은 목숨 : ");
			System.out.println("---------------------------------");
			System.out.println(" ┌-----준비된 재료 리스트를 확인하세요----┐");
			System.out.println(" | 물 | 우유 | 커피 | 바닐라 | 초코 | 없음|");
			System.out.println(" └-------------------------------┘");
			System.out.println("*********************************");
		
			System.out.println("메인 재료를 하나 선택해 입력해주세요([물] 또는 [우유])");
			var1 = sc.nextLine();
			System.out.println("첫 번째로 넣을 재료는 = " + var1);
			
			if(var1.equals("물") || var1.equals("우유")){
				System.out.println("메인 재료를 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");	
				continue;
			}
			
			System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
			var2 = sc.nextLine();
			System.out.println("두 번째 선택한 재료는 = " + var2);
			
			if(var2.equals("커피") || var2.equals("바닐라") || var2.equals("초코")||var2.equals("없음")){
				System.out.println("추가 재료 1번을 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
				continue;
			}
			
			System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
			var3 = sc.nextLine();
			System.out.println("세 번째 선택한 재료는 = " +var3);
			
			if(var3.equals("커피") || var3.equals("바닐라") || var3.equals("초코")||var3.equals("없음")){
				System.out.println("추가 2번을 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
				continue;
			}
			
			playerMake1.recipe(var1, var2, var3);
			drink1 = playerMake1.getDrink();
			
			
			System.out.println("메인 재료를 하나 선택해 입력해주세요([물] 또는 [우유])");
			var4 = sc.nextLine();
			System.out.println("첫 번째로 넣을 재료는 = " + var4);
			
			if(var4.equals("물") || var4.equals("우유")){
				System.out.println("메인 재료를 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");	
				continue;
			}
			
			System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
			var5 = sc.nextLine();
			System.out.println("두 번째 선택한 재료는 = " + var5);
			
			if(var5.equals("커피") || var5.equals("바닐라") || var5.equals("초코")||var2.equals("없음")){
				System.out.println("추가 재료 1번을 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
				continue;
			}
			
			System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
			var6 = sc.nextLine();
			System.out.println("세 번째 선택한 재료는 = " +var6);
			
			if(var6.equals("커피") || var6.equals("바닐라") || var6.equals("초코")||var6.equals("없음")){
				System.out.println("추가 2번을 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
				continue;
			}
			
			playerMake2.recipe(var4, var5, var6);
			drink2 = playerMake2.getDrink();
			
			System.out.println("메인 재료를 하나 선택해 입력해주세요([물] 또는 [우유])");
			var7 = sc.nextLine();
			System.out.println("첫 번째로 넣을 재료는 = " + var7);
			
			if(var7.equals("물") || var7.equals("우유")){
				System.out.println("메인 재료를 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");	
				continue;
			}
			
			System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
			var8 = sc.nextLine();
			System.out.println("두 번째 선택한 재료는 = " + var8);
			
			if(var8.equals("커피") || var8.equals("바닐라") || var8.equals("초코")|| var8.equals("없음")){
				System.out.println("추가 재료 1번을 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
				continue;
			}
			
			System.out.println("추가재료를 입력해주세요([커피],[바닐라],[초코],[없음])");
			var9 = sc.nextLine();
			System.out.println("세 번째 선택한 재료는 = " +var9);
			
			if(var9.equals("커피") || var9.equals("바닐라") || var9.equals("초코")|| var9.equals("없음")){
				System.out.println("추가 2번을 넣었습니다^0^");
			} else {
				System.out.println("정해진 재료만 넣을 수 있습니다 T.T");
				continue;
			}
			
			playerMake3.recipe(var7, var8, var9);
			drink3 = playerMake3.getDrink();
			
			
			System.out.println(drink1);
			System.out.println(drink2);
			System.out.println(drink3);
			
			String pDrink1 = playerMake1.getDrink();
			String pDrink2 = playerMake2.getDrink();
			String pDrink3 = playerMake3.getDrink();
			
			String cDrink1 = choiceMenu1.lastChoice();
			String cDrink2 = choiceMenu2.lastChoice();
			String cDrink3 = choiceMenu3.lastChoice();
			
			
			int victory = 0; // 성공
			int fail = 0; // 실패
			
			int win; //승리 회수를 위해
			int lose; // 패배 회수를 위해
			
			if(cDrink1.equals(pDrink1)) {
				++victory;
				System.out.println("잘 마셨습니다~ ^^ 성공");
				
			} else {
				--game2Life;
				++fail;
				System.out.println("더럽게 맛 없네 다신 안와!!!!!!!!");
			}	
				if(game2Life==0) {
					game2Continue = false;
					System.out.println("Game Over~~!");
				}
				
				
			if(cDrink2.equals(pDrink2)) {
				++victory;
				System.out.println("잘 마셨습니다~ ^^ 성공");
				
			} else {
				--game2Life;
				++fail;
				System.out.println("더럽게 맛 없네 다신 안와!!!!!!!!");
			}	
				if(game2Life==0) {
					game2Continue = false;
					System.out.println("Game Over~~!");
				}
				
			if(cDrink3.equals(pDrink3)) {
				++victory;
				System.out.println("잘 마셨습니다~ ^^ 성공");
				
			} else {
				--game2Life;
				++fail;
				System.out.println("더럽게 맛 없네 다신 안와!!!!!!!!");
			}	
				if(game2Life==0) {
					game2Continue = false;
					System.out.println("Game Over~~!");
				}
				
			if(victory==3) {
				System.out.println("음료만들기에 성공했습니다!^^ 포인트 +200");
				break;
				
			} else {
				System.out.println("고객이 화가났습니다.");
				game2Continue = false;
				System.out.println("Game Over~~!");
				return;
			}
		}
			
	}				
}
		
