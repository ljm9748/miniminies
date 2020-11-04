package minigame3;

import java.util.InputMismatchException;
import java.util.Scanner;

import memberInfo.MemberInfoManager;

public class CCGMain {
	
//	MemberInfoManager members = MemberInfoManager.getManager();
	
	
	public static void main(String[] args) {



		
		int select=0;
		while(true) {

		Scanner sc = new Scanner(System.in);
		System.out.println("============================================================");
		System.out.println("\n \t  안녕하세요? 스피드 계산 게임에 입장하신 것을 환영합니다.\n        ");
		System.out.println("============================================================\n");
		System.out.println("게임 난이도를 선택하세요.");
		System.out.println("1.easy  ★ \n2.normal★★ \n3.hard  ★★★\n4.게임종료");
		try {
		select=sc.nextInt();
			if(!(select>0 && select<5)) {
				BadInputException e = new BadInputException(String.valueOf(select));
				throw e;
			}
		} catch(InputMismatchException | BadInputException e) {
			System.out.println("숫자만 입력하세요.");
			sc.nextLine();
			continue;
		}
			switch(select) {
			case 1 :	CCGame lv1 = new Level1CCGame();
						lv1.explainGame();
						break;
					
			case 2 :  	CCGame lv2 = new Level2CCGame();
						lv2.explainGame();
						break;
				
			case 3 :	CCGame lv3 = new Level3CCGame();
						lv3.explainGame();
						break;
			case 4 :	System.out.println("게임을 종료합니다.");
						//run();			
			
		}
	}
}
}
