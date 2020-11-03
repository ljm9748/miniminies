package game01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniGameMain {

	public static void main(String[] args) {
		
		//미니미니게임 트리오
		//세 가지 게임을 주어진 기회안에 연속으로 클리어하면 성공!!
		//중간에 실패시 처음 게임으로 되돌아간다
		//첫 번째 게임 : 영화 명대사를 보고 영화 제목 맞추기
		//두 번째 게임 : 사자성어의 앞 두글자를 보고 사자성어 완성하기
		//세 번째 게임 : 참참참
		
		//프로그램 실행시 루프
		while(true) {
			System.out.println("-----미니미니게임 트리오-----");
			System.out.println(Menu.START + ". Game Start!!");
			System.out.println(Menu.EXIT + ". Exit");
			System.out.println("-> ");
			
			Scanner sc = new Scanner(System.in);
			
			int menu = 0;
			
			try {
				menu = sc.nextInt();
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
			case Menu.START : 
				System.out.println("준비... 시작!!");
				
				MiniGame gs = new MiniGame();
				
				gs.miniGameManager();			
				
				break;
			//게임 종료
			case Menu.EXIT :
				System.out.println("게임을 종료합니다");
				
				System.exit(0);
			}			
		}
		
		
	}

}
