package miniminigame;

import java.util.InputMismatchException;
import java.util.Scanner;

import game01.MiniGame;
import memberInfo.MemberInfoManager;
import memberInfo.TimerForLife;
import minigame2.HardMode;
import minigame2.Player;
import minigame3.BadInputException;
import minigame3.Level1CCGame;
import minigame3.Level2CCGame;
import minigame3.Level3CCGame;
import store.LifeBuyer;
import store.LifeSeller;
import store.PointBuyer;
import store.PointSeller;
import store.RandomBoxBuyer;
import store.RandomBoxSeller;
import store.Seller;
import store.Buyer;


public class MenuManager implements Util {
	
	MemberInfoManager member = MemberInfoManager.getManager();
	TimerForLife tfl = TimerForLife.getTimer();
	

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
				tfl.startAddLife();
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
				tfl.startAddLife();
				member.save();
				System.exit(0);
			}
		
		// 스토어 선택지
		case Menu.STORE:
			
			store();
			

		
		// 랭킹보기 선택지 (따로구현)
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
				tfl.startAddLife();
				member.save();
				System.exit(0);
			}
			
		// 종료하기
		case Menu.EXIT:
			tfl.startAddLife();
			member.save();
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
					member.useLife();
					++numOfGame;
					Player easy = new Player();
					easy.playerMakeDrink();
					break;
					
				case 2:
					member.useLife();
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
		System.out.println("1.easy  ★ \n2.normal★★ \n3.hard  ★★★ \n 4.go back");
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
						
			case 4:		System.out.println("게임을 종료합니다~ 띠로링~");
						run();
			
			}
		}
	}
	
	
	
		
	public void store() {
		
		Seller seller = new Seller();
		Buyer buyer = new Buyer();
		
		while (true) {

			System.out.println("\n****메뉴를 입력하세요*****");
			System.out.println("1. 라이프 충전");
			System.out.println("2. 랜덤박스 구매");
			System.out.println("3. 포인트 충전");
			System.out.println("4. 판매자의 현재 판매 지표");
			System.out.println("5. 구매자의 현재 구매 지표");
			System.out.println("6. 처음으로 되돌아가기");
			System.out.println("0. 게임종료하려면 0을 누르세요");
		
		int inputNum = 0;
		int select = 0;

		// 예외 처리
		try {
			select = SC.nextInt();
			if (!(select > 0 && select < 6)) {

			}
		} catch (InputMismatchException e) {
			System.out.println("메뉴 입력이 잘못되었습니다. 다시 선택해주세요.");
			SC.nextLine();
			continue;
		}

		switch (select) {
//		라이프 구매
		case Menu.BUY_LIFE: 				
			
			System.out.println("보유하고 있는 포인트를 입력해주세요.");

			try {
				inputNum = SC.nextInt();
				if (inputNum < 0) {

				}
			} catch (InputMismatchException e1) {
				System.out.println("메뉴 입력이 잘못되었습니다. 다시 선택해주세요.");
				SC.nextLine();
				continue;
			}
			// LifeSeller 타입의 참조변수 선언
			LifeSeller lifeseller = null;
			// LifeSeller의 객체 생성
			// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는 것.

			// 셀러1
			lifeseller = new LifeSeller(0); // 객체 생성 후 객체의 주소값을 반환
			// myPoint(보유 포인트), numLife(보유 라이프), price(라이프 가격)

			// LifeBuyer 타입의 참조변수 선언과 초기화
			LifeBuyer lifebuyer = new LifeBuyer( inputNum, 0); // 인스턴스 생성
			// 현재잔액 포인트, 라이프 개수

			// 라이프 구매: seller 1에게 원하는 값 지급
			// 예외처리
			
			if (inputNum < 100) {
				System.out.println("잔액이 부족합니다. 포인트를 충전 후 다시 구매해주세요. 메뉴로 돌아갑니다.");
				continue;
			} else {
				int givePoint = inputNum;
				System.out.println("구매할 라이프의 개수를 입력하세요.");
				givePoint = SC.nextInt();
				lifebuyer.buyLife(lifeseller, givePoint * 100);
				

				if (lifebuyer.getMyPoint() < 0) {
					System.out.println("한도를 초과했습니다. 메뉴로 돌아갑니다..");
					continue;
				} else {
				//	System.out.println("\n# 라이프 판매자의 현재 지표\n");
				//	lifeseller.showSaleLifeResult();

					System.out.println("\n----------------------------------");

					System.out.println("\n# 라이프 구매 결과\n");
					lifebuyer.showBuyLifeResult();

					break;
				}
				
			}
			// 보유 금액을 연동하고 싶습니다.

//		랜덤박스 구매
		case Menu.BUY_RANDOMBOX: 
			
			member.showpoint();
			
//			System.out.println("보유하고 있는 포인트를 입력해주세요.");
//			
//			try {
//				inputNum = SC.nextInt();
//				if (inputNum < 0) {
//
//				}
//			} catch (InputMismatchException e1) {
//				System.out.println("메뉴 입력이 잘못되었습니다. 다시 선택해주세요.");
//				SC.nextLine();
//				continue;
//			}

			// RandomBoxSeller 타입의 참조변수 선언
			RandomBoxSeller randomboxseller = null;
			// LifeSeller의 객체 생성
			// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는 것.

			// 랜덤박스 셀러
			randomboxseller = new RandomBoxSeller(0, 0); // 객체 생성 후 객체의 주소값을 반환
			// point, givePoint, price

			// RandomBoxBuyer 타입의 참조변수 선언과 초기화
			RandomBoxBuyer randomboxbuyer = new RandomBoxBuyer( inputNum, 0); // 보유 포인트 값 가져오기
			// myPoint(보유 포인트), getPoint(랜덤박스를 통해 얻은 포인트)

			// 랜덤박스 구매: randomboxseller에게 원하는 값 지급
			int givePoint = 0;
			System.out.println("100p를 결제하세요. (랜덤박스는 1회당 1개씩 구매 가능합니다.)");
			//
			givePoint = SC.nextInt();

			if (givePoint % 100 == 0) {
				randomboxbuyer.buyRandomBox(randomboxseller, givePoint);
			
			} else {
				System.out.println("100원 단위로 입력해주세요. \n메뉴로 돌아갑니다.");

			}

			//System.out.println("\n# 랜덤박스 판매자의 현재 지표\n");
			//randomboxseller.showSaleRandomBoxResult();

			System.out.println("----------------------------------");

			System.out.println("\n# 랜덤박스 구매 결과\n");
			randomboxbuyer.showBuyRandomBoxResult();

			break;

//		포인트 구매	
		case Menu.BUY_POINT: 
			
			SC.nextLine();
					
			System.out.println("보유하고 있는 돈을 입력해주세요.");
			try {
				inputNum = SC.nextInt();
				if (inputNum < 0) {

				}
			} catch (InputMismatchException e1) {
				System.out.println("메뉴 입력이 잘못되었습니다. 다시 선택해주세요.");
				SC.nextLine();
				continue;
			}

			if (inputNum < 100) {
				System.out.println("금액이 부족합니다. (최소 100원 부터 충전 가능.) \n메뉴로 돌아갑니다.");
				continue;
			} else {
				// PointSeller 타입의 참조변수 선언
				PointSeller pointseller = null;

				// 포인트 셀러
				pointseller = new PointSeller(0, 0); // 객체 생성 후 객체의 주소값을 반환
				// getPoint, myMoney

				// RandomBoxBuyer 타입의 참조변수 선언과 초기화
				PointBuyer pointbuyer = new PointBuyer(inputNum, 0, 0); // 포인트 가져오기
				// myMoney(보유 금액), myPoint, givePoint

				// 포인트 구매: pointseller에게 원하는 값 지급
				int giveMoney = 0;
				int inputPoint = 0;
				inputPoint = giveMoney/10;

				System.out.println("결제할 금액을 입력해주세요. (포인트는 10p당 100원 입니다.)");
				giveMoney = SC.nextInt();

				// 100원 단위로 입력할 수 있도록 안내
				if (giveMoney % 100 == 0) {
					pointbuyer.buyPoint(pointseller, giveMoney);
					member.updatePoint(giveMoney/10);
				} else {
					System.out.println("100원 단위로 입력해주세요. \n메뉴로 돌아갑니다.");
				}

				// 보유한 돈<충전하고자 하는 금액일 경우
				if (pointbuyer.getMyMoney() < 0) {
					System.out.println("한도를 초과했습니다. 메뉴로 돌아갑니다.");
				} else {
				//	System.out.println("\n# 포인트 판매자의 현재 지표\n");
				//	pointseller.showSalePointResult();

					System.out.println("----------------------------------");

					System.out.println("\n# 포인트 구매 결과\n");
					pointbuyer.showBuyPointResult();

					break;
				}
			} // case3: if-else
			
		case Menu.SHOW_SELLER:
			seller.showSellerResult();
		case Menu.SHOW_BUYER:
			buyer.showBuyerResult();
		case 6:
			run();
		case Menu.EXIT:
			System.out.println("시스템을 종료합니다.");
			member.save();
			System.exit(0);

		} // switch
	} // while
		
		
	}
	
	
	
	public void rank() {
		
		
		
	
	}
}
