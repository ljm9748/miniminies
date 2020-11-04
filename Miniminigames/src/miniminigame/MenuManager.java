package miniminigame;

import java.util.InputMismatchException;
import java.util.Scanner;

import game01.MiniGame;
import memberInfo.MemberInfoManager;
import minigame2.HardMode;
import minigame2.Player;
import minigame3.BadInputException;
import minigame3.Level1CCGame;
import minigame3.Level2CCGame;
import minigame3.Level3CCGame;


public class MenuManager implements Util {
	
	MemberInfoManager member = MemberInfoManager.getManager();
	
	// 로그인 메뉴
	public void login() {
		
		while(true) {
			System.out.println("\t\t\t"); 
			System.out.println("\t\t\t"+"메뉴를 선택해주세요\n"); 
			System.out.println("\t\t\t"+ Menu.JOIN+". 회원가입 \n");
			System.out.println("\t\t\t"+ Menu.LOGIN+". 로그인  \n"); 
			
			int select = 0;
			
			try {
				select = SC.nextInt();
				if(!(select > 0 && select < 3)) {
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못입력했습니다.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
				SC.nextLine();
				continue;
		}
			switch(select) {
			case Menu.JOIN:
				member.addInfo();
				member.save();
				break;
			case Menu.LOGIN:
				if(member.login()) 
					return;
			}
		}
	}
	
	
	
	// 로그인후 메인 메뉴
	public void run() {
		
		while(true) {
			System.out.println("■■■■■■■■■■■■■■■■■ Mini Mini Games START ■■■■■■■■■■■■■■■■■\n");
			System.out.println("\t\t\t"+"메뉴를 선택해주세요\n"); 
			System.out.println("\t\t\t"+Menu.GAMES +". 게임하기\n"); 
			System.out.println("\t\t\t"+Menu.MYPAGE+". 마이페이지\n"); 
			System.out.println("\t\t\t"+Menu.STORE+". 상점\n"); 
			System.out.println("\t\t\t"+Menu.RANKING+". 랭킹보기\n");
			System.out.println("\t\t\t"+Menu.EXIT+". 종료하기\n"); 
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
		
		int choice = 0;
		
		try {
			choice = SC.nextInt();
			if(!(choice >= 0 && choice < 6)) {
				BadInputException e = new BadInputException(String.valueOf(choice));
				throw e;
			}
		} catch (InputMismatchException | BadInputException e) {
			System.out.println("잘못입력했습니다.");
			SC.nextLine();
			continue;
		} catch (Exception e1) {
			System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
			SC.nextLine();
			continue;
		}
		
		
		// 게임 선택지
		switch(choice) {
		case Menu.GAMES:
			
			int choice1 = 0 ;
			
			System.out.println("■■■■■■■ 게임을 선택해주세요 ■■■■■■■");
			System.out.println(Menu.GAME_ONE+". 게임 1");
			System.out.println(Menu.GAME_TWO+". 게임 2");
			System.out.println(Menu.GAME_THREE+". 게임 3");
			System.out.println("4.처음으로 되돌아가기");
			System.out.println("게임종료하려면 0을 누르세요");
			
			
			try {
				choice1 = SC.nextInt();
				if(!(choice1 < 5)) {
					BadInputException e = new BadInputException(String.valueOf(choice1));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못입력했습니다.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
				SC.nextLine();
				continue;
			}
			
			switch(choice1) {
			
			case Menu.GAME_ONE:
				gameOne();
				break;
			case Menu.GAME_TWO:	
				gameTwo();
				break;
			case Menu.GAME_THREE:	
				gameThree();
				break;
			case 4:	
				run();
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				member.save();
				System.exit(0);
			}
			
		
		// 마이페이지 선택지
		case Menu.MYPAGE:
			
			int choice2 = 0 ;
			
			System.out.println("■■■■■■■■■■■■■ 마이페이지 ■■■■■■■■■■■■■");
			
			member.showInfoUser();
			
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			
			System.out.println(Menu.EDIT+". 회원정보 수정 (이름,비밀번호)");
			System.out.println(Menu.DELET+". 회원탈퇴하기");
			System.out.println("3.처음으로 되돌아가기");
			System.out.println("게임종료하려면 0을 누르세요");
			
			try {
				choice2 = SC.nextInt();
				if(!(choice2 < 4)) {
					BadInputException e = new BadInputException(String.valueOf(choice2));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못입력했습니다.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
				SC.nextLine();
				continue;
			}
			
			switch(choice2) {
			
			case Menu.EDIT:
				member.changeName();
				member.changePassword();
				run(); 
				break;
			case Menu.DELET:
				member.deleteInfo();
				run();
				break;
			case 3:	
				run();
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				member.save();
				System.exit(0);
			}
		
		// 스토어 선택지
		case Menu.STORE:
			
			int choice3 = 0;
			
			System.out.println("■■■■■■■ 상점입장 ■■■■■■■");
			System.out.println(Menu.BUY_LIFE+". 라이프구매");
			System.out.println(Menu.BUY_RANDOMBOX+". 랜덤박스구매");
			System.out.println(Menu.BUY_POINT+". 포인트충전구매");
			System.out.println("4.처음으로 되돌아가기");
			System.out.println("게임종료하려면 0을 누르세요");
			
			try {
				choice3 = SC.nextInt();
				if(!(choice3 < 5)) {
					BadInputException e = new BadInputException(String.valueOf(choice3));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못입력했습니다.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
				SC.nextLine();
				continue;
			}
			
			switch(choice3) {
			
			case Menu.BUY_LIFE:
				break;
			case Menu.BUY_RANDOMBOX:
				break;
			case Menu.BUY_POINT:
				break;
				
			case 4:
				run();
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				member.save();
				System.exit(0);
			}
			
		
		// 랭킹보기 선택지
		case Menu.RANKING:
			
			int choice4 = 0;
			
			System.out.println("■■■■■■■ 랭킹 ■■■■■■■");
			
			System.out.println(Menu.GAME_RANK+".게임별 랭킹보기");
			System.out.println(Menu.TOTAL_RANK+".전체 랭킹보기");
			System.out.println("3. 처음으로 되돌아가기");
			System.out.println("게임종료하려면 0을 누르세요");
			
			try {
				choice4 = SC.nextInt();
				if(!(choice4 < 4)) {
					BadInputException e = new BadInputException(String.valueOf(choice4));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못입력했습니다.");
				SC.nextLine();
				continue;
			} catch (Exception e1) {
				System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
				SC.nextLine();
				continue;
			}
			
			switch(choice4) {
			
			case Menu.GAME_RANK:
				
				break;
			case Menu.TOTAL_RANK:
				break;
			case 3:
				run();
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				member.save();
				System.exit(0);
			}
			
		// 종료하기
		case Menu.EXIT:
			System.out.println("시스템을 종료합니다.");
			return;
		
			}
		}

	}
	
	
	// 게임1 실행
	public void gameOne() {
				//미니미니게임 트리오
				//세 가지 게임을 주어진 기회안에 연속으로 클리어하면 성공!!
				//중간에 실패시 처음 게임으로 되돌아간다
				//첫 번째 게임 : 영화 명대사를 보고 영화 제목 맞추기
				//두 번째 게임 : 사자성어의 앞 두글자를 보고 사자성어 완성하기
				//세 번째 게임 : 참참참
				
				//프로그램 실행시 루프
				while(true) {
					System.out.println("-----미니미니게임 트리오-----");
					System.out.println("1. Game Start!!");
					System.out.println("2. Exit");
					System.out.println("-> ");
					
					int menu = 0;
					
					try {
						menu = SC.nextInt();
					if(!(menu > 0 && menu <3)) {
						System.out.println("메뉴 선택이 올바르지 않습니다");
						System.out.println("다시 선택하세요");
					}
					}catch(InputMismatchException e) {
						System.out.println("메뉴 선택이 올바르지 않습니다");
						System.out.println("다시 선택하세요");
						continue;	
					}
					
					switch(menu) {
					//게임 시작
					case 1 : 
						System.out.println("준비... 시작!!");
						
						MiniGame gs = new MiniGame();
						
						gs.miniGameManager();			
						
						break;
					//게임 종료
					case 2 :
						System.out.println("게임을 종료합니다");
						run();
					}			
				}
				
				
	}
	// 게임2 실행 
	public void gameTwo() {
		// 메뉴 선택을 위한 select 변수설정
				int select;
				
				// 게임 실행 횟수
				int numOfGame = 0;
				
				
				// 프로그램 유지를 위한 루프
			while(true) {
				
				System.out.println("오래하면 엄마한테 혼납니다.게임 실행 횟수 : " + numOfGame);
			
				
				System.out.println("오래하면 엄마한테 혼납니다.게임 실행 횟수 : " + numOfGame);
				
				System.out.println("■■■■■■■■■■■■메뉴를 선택해주세요■■■■■■■■■■■■■■■");
				System.out.println(" 1. 게임을 시작합니다 (easyMode)");
				System.out.println(" 2. 게임을 시작합니다 (hardMode)");
				System.out.println(" 3. 게임 종료하기");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
					
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
					++numOfGame;
					Player easy = new Player();
					easy.playerMakeDrink();
					break;
					
				case 2:
					++numOfGame;
					HardMode hard = new HardMode();
					hard.playerMakeDrink();
					break;
					
				// 게임 종료	
				case 3:
					System.out.println("게임을 종료합니다~ 띠로링~");
					run();
					
				
				}
			}
	}
	
	// 게임3 실행
	public void gameThree() {
		
		int select=0;
		while(true) {
			
		System.out.println("게임 난이도를 선택하세요.");
		System.out.println("1.easy  ★ \n2.normal★★ \n3.hard  ★★★");
		try {
		select= SC.nextInt();
			if(!(select>0 && select<4)) {
				BadInputException e = new BadInputException(String.valueOf(select));
				throw e;
			}
		} catch(InputMismatchException | BadInputException e) {
			System.out.println("숫자만 입력하세요.");
			SC.nextLine();
			continue;
		}
			switch(select) {
			case 1 :	Level1CCGame lv1 = new Level1CCGame();
						lv1.explainGame();
						break;
					
			case 2 :  	Level2CCGame lv2 = new Level2CCGame();
						lv2.explainGame();
						break;
				
			case 3 :	Level3CCGame lv3 = new Level3CCGame();
						lv3.explainGame();
						break;
			
			}
		}
	}
	
	
	
	
	public void rank() {
		
		
		
	
	}
}
