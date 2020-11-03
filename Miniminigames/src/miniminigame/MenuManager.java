package miniminigame;

import memberInfo.MemberInfoManager;
import minigame2.Player;
import minigame2.nomalLevel;

public class MenuManager implements Util {
	
	MemberInfoManager member = MemberInfoManager.getManager();
	
	
	// 게임1 실행
	public void gameOne() {
		
	}
	// 게임2 실행 
	public void gameTwo() {
		// 메뉴 선택을 위한 select 변수설정
			int select;
				
				// 프로그램 유지를 위한 루프
			while(true) {
				System.out.println("*****메뉴를 선택해주세요*****");
				System.out.println(" 1. 게임을 시작합니다 (easyMode)");
				System.out.println(" 2. 게임을 시작합니다 (hardMode)");
				System.out.println(" 3. 게임 종료하기");
					
				try {
					// 입력받은 int 타입의 정수를 select에 넣음
					// ++ 숫자가 아닌 입력  & 범위 이상의 숫자 예외처리 해야함.
					select = SC.nextInt();
					SC.nextLine();
					
					// 메뉴 번호외 숫자를 입력했을때 예외처리
					if(!(select>0 && select<4)) {
					System.out.println("메뉴의 선택이 옳바르지 않습니다. \n다시 선택해주세요.");
					}
					
					// 문자나 기타 기호를 입력했을때 예외처리
				} catch (Exception e) {
					System.out.println("메뉴입력이 잘못되었습니다. \n 다시 선택해주세요.");
					SC.nextLine();
					continue;
				}
					
				switch(select) {
				
				// 게임 시작 
				case 1:
					Player easy = new Player();
					easy.playerMakeDrink();
					break;
					
				case 2:
					nomalLevel nomal = new nomalLevel();
					nomal.nomalGame();
					break;
					
				// 게임 종료	
				case 3:
					System.out.println("게임을 종료합니다~ 띠로링~");
					System.exit(0);
					
				
				}
			}
	}
	
	// 게임3 실행
	public void gameThree() {
		
	}
	
	
}
