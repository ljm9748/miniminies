package game04;

import java.util.Scanner;

import game04.Pikachu;

public class Play {
	
	private static PoketMonster poketMon;
	private boolean flag = true;
	
	public void play(PoketMonster p) {
		poketMon = p;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			PoketMonster.showData();
			
			System.out.println("1. 밥 먹이기");
			System.out.println("2. 잠 재우기");
			System.out.println("3. 놀아 주기");
			System.out.println("4. 훈련 시키기");
			System.out.println("5. 게임 종료");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
			
			
			
			
			
			
			}
			
			
			
			
			
		}
	}

}
