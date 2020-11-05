package game04;

import java.util.InputMismatchException;
import java.util.Scanner;
import game04.PoketMonster;
import game04.Electric;
import game04.Fire;
import game04.Water;
import game04.Grass;

public class SelectMenu {
	
	private static PoketMonster poketMon;
	
	private boolean flag = true;
	
	public void play(PoketMonster p) {
		poketMon = p;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			poketMon.showData();
			
			System.out.println("메뉴를 선택하세요");
			System.out.println(Menu.EAT + ". 밥 먹이기");
			System.out.println(Menu.SLEEP + ". 잠 재우기");
			System.out.println(Menu.PLAY + ". 놀아 주기");
			System.out.println(Menu.TRAIN + ". 훈련 시키기");
			System.out.println(Menu.EXIT + ". 게임 종료");
			System.out.println("-> ");
			
			int menu = 0;
			
			try {
				menu = sc.nextInt();
			if(!(menu > 0 && menu < 6)) {
				System.out.println("메뉴 선택이 올바르지 않습니다");
				System.out.println("다시 선택하세요");
			}
			}catch(InputMismatchException e) {
				System.out.println("메뉴 선택이 올바르지 않습니다");
				System.out.println("다시 선택하세요");
				
				continue;	
			}
			
			switch(menu) {
			case Menu.EAT :
				p.eat();
				
				break;
			case Menu.SLEEP :
				p.sleep();
				
				break;
			case Menu.PLAY :
				p.play();
				
				break;
			case Menu.TRAIN :
				p.train();
				
				break;
			case Menu.EXIT :
				System.out.println("게임을 종료합니다");

				System.exit(0);
	
			}
			p.levelUp();
			
			flag = p.finish();
			
			if(flag == false) {
				return;
			}
		}
	}

	
}
