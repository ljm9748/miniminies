package miniminigame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import memberInfo.MemberInfoManager;

import java.io.IOException;

public class MiniGameMain implements Util, Menu {

	public static void main(String[] args) throws IOException {
		
		
		
		MemberInfoManager member = MemberInfoManager.getManager();
		MenuManager gmanager =  new MenuManager();
		
		String MINI[] = {
				"■■   ■■  ■■■  ■■   ■  ■■■  ■■■■■    ■     ■■   ■■  ■■■■■  ",
				"■ ■ ■ ■   ■   ■ ■  ■   ■   ■       ■  ■   ■ ■ ■ ■  ■      ",
				"■  ■  ■   ■   ■  ■ ■   ■   ■  ■■  ■■■■■■  ■  ■  ■  ■■■■■  ",
				"■  ■  ■   ■   ■    ■   ■   ■   ■  ■    ■  ■  ■  ■  ■      ",
				"■     ■  ■■■  ■    ■  ■■■  ■■■■■  ■    ■  ■     ■  ■■■■■  ",
				" "
	    };
		
		for (int i = 0; i < MINI.length; i++) {
		      // 메세지를 출력
		      System.out.println(MINI[i]);
		} 
		
		member.addInfo();
		member.save();

		while(true) {
			System.out.println("■■■■■■■■■■■■■■■■■ Mini Mini Games START ■■■■■■■■■■■■■■■■■\n");
			System.out.println("\t\t\t"+"메뉴를 선택해주세요\n"); 
			System.out.println("\t\t\t"+Menu.GAMES +". 게임하기\n"); 
			System.out.println("\t\t\t"+Menu.MYPAGE+". 마이페이지\n"); 
			System.out.println("\t\t\t"+Menu.STORE+". 상점\n"); 
			System.out.println("\t\t\t"+Menu.RANKING+". 랭킹보기\n");
			System.out.println("\t\t\t"+Menu.EXIT+". 종료하기\n"); 
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		break;
		}
		
		
		int choice = 0;
		
		try {
			choice = SC.nextInt();
			if(!(choice > 0 && choice < 5)) {
				BadInputException e = new BadInputException(String.valueOf(choice));
				throw e;
			}
		} catch (InputMismatchException | BadInputException e) {
			System.out.println("잘못입력했습니다.");
			SC.nextLine();
		} catch (Exception e1) {
			System.out.println("메뉴를 잘못 입력했습니다. 다시시도 해주세요.");
			SC.nextLine();
		}
		
		
		// 게임 선택지
		switch(choice) {
		case Menu.GAMES:
			
			int choice1 = 0 ;
			
			System.out.println("■■■■■■■ 게임을 선택해주세요 ■■■■■■■");
			System.out.println("1.게임 1");
			System.out.println("2.게임 2");
			System.out.println("3.게임 3");
			System.out.println("게임종료하려면 0을 누르세요");
			
			choice1 = SC.nextInt();
			
			switch(choice1) {
			
			case Menu.GAME_ONE:
				gmanager.gameOne();
				break;
			case Menu.GAME_TWO:	
				gmanager.gameTwo();
				break;
			case Menu.GAME_THREE:	
				gmanager.gameThree();
				break;
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				return;
			}
				break;
		
		// 마이페이지 선택지
		case Menu.MYPAGE:
			
			int choice2 = 0 ;
			
			System.out.println("■■■■■■■ 마이페이지 ■■■■■■■");
			
			member.showMemInfo();
			
			System.out.println("1.회원정보 수정");
			System.out.println("2.회원탈퇴하기");
			System.out.println("3.처음으로 되돌아가기");
			System.out.println("게임종료하려면 0을 누르세요");
			
			choice2 = SC.nextInt();
			
			switch(choice2) {
			
			case Menu.EDIT:
				member.changeName();
				member.changePassword();
				break;
			case Menu.DELET:
				member.deleteInfo();
				break;
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				return;
			}
				break;
		
		// 스토어 선택지
		case Menu.STORE:
			
			int choice3 = 0;
			
			System.out.println("■■■■■■■ 상점입장 ■■■■■■■");
			System.out.println("1.라이프구매");
			System.out.println("2.랜덤박스구매");
			System.out.println("3.포인트충전구매");
			System.out.println("게임종료하려면 0을 누르세요");
			
			choice3 = SC.nextInt();
			
			switch(choice3) {
			
			case Menu.BUY_LIFE:
				break;
			case Menu.BUY_RANDOMBOX:
				break;
			case Menu.BUY_POINT:
				break;
			case Menu.SHOW_SELLER:
				break;
			case Menu.SHOW_BUYER:
				break;
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				return;
			}
				break;
			
		
		// 랭킹보기 선택지
		case Menu.RANKING:
			
			int choice4 = 0;
			
			System.out.println("■■■■■■■ 랭킹 ■■■■■■■");
			
			System.out.println("1.게임별 랭킹보기");
			System.out.println("2.전체 랭킹보기");
			System.out.println("게임종료하려면 0을 누르세요");
			
			choice4 = SC.nextInt();
			
			switch(choice4) {
			
			case Menu.GAME_RANK:
				break;
				
			case Menu.TOTAL_RANK:
				break;
			
			case Menu.EXIT:
				System.out.println("시스템을 종료합니다.");
				return;
			}
			
		// 종료하기
		case Menu.EXIT:
			System.out.println("시스템을 종료합니다.");
			return;
		
			}
		}

	}

