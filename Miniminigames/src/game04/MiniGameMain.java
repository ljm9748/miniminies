package game04;

import java.util.InputMismatchException;
import java.util.Scanner;
import game04.PoketMonster;
import game04.Electric;
import game04.Fire;
import game04.Water;
import game04.Grass;
import memberInfo.MemberInfoManager;

public class MiniGameMain {
	
	MemberInfoManager members = MemberInfoManager.getManager();
	SelectMenu select = new SelectMenu();
	
	public PoketMonster selectPoketMonster() {
		Scanner sc = new Scanner(System.in);
		
		PoketMonster returnValue = null;
		
		boolean play=true;
		
		while(play) {
		System.out.println("====포켓몬 다마고치====");
		System.out.println("|| 포켓몬을 선택하세요 ||");
		System.out.println("===== " + Menu.ELECTRIC + ". 피카츄 =====");
		System.out.println("===== " + Menu.FIRE + ". 파이리 =====");
		System.out.println("===== " + Menu.WATER + ". 꼬부기 =====");
		System.out.println("===== " + Menu.GRASS + ". 이상해씨 =====");
		System.out.println("-> ");
			
		int choice = 0;
		
		try {
			choice = sc.nextInt();
		if(!(choice > 0 && choice < 5)) {
			System.out.println("메뉴 선택이 올바르지 않습니다");
			System.out.println("다시 선택하세요");
			continue;
		}
		}catch(InputMismatchException e) {
			System.out.println("메뉴 선택이 올바르지 않습니다");
			System.out.println("다시 선택하세요");
			continue;
		}
		
		switch(choice) {
		case Menu.ELECTRIC : 
			returnValue = new Electric();
			
			select.play(returnValue);
			
			members.useLife();
			
			break;
		case Menu.FIRE : 
			returnValue = new Fire();
			
			select.play(returnValue);
			
			members.useLife();
			
			break;
		case Menu.WATER : 
			returnValue = new Water();
			
			select.play(returnValue);
			
			members.useLife();
			
			break;
		case Menu.GRASS :
			returnValue = new Grass();
			
			select.play(returnValue);
			
			members.useLife();
			
			break;			
			}
		}
		play=false;
		return returnValue;

	}
}
