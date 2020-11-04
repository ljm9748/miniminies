package minigame3;

import java.util.InputMismatchException;
import memberInfo.MemberInfoManager;
import java.util.Scanner;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Level1CCGame  extends CCGame{
	MemberInfoManager members = MemberInfoManager.getManager();
	
	@Override
	public void explainGame() {
		
		int select=0;
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 안녕하세요? 스피드 계산 게임에 입장하신 것을 환영합니다. =========");
		System.out.println("                Easy레벨의 게임설명은 다음과 같습니다.              ");
		System.out.println("              Easy레벨은 두 자릿수와 한 자릿수를 덧셈합니다.         ");
		System.out.println("         예를 들어, 12+3= 라는 문제가 나오면 '15'를 입력하시면 됩니다.    ");
		System.out.println("         총 5문제 중에 3문제를 맞추면 통과! 3문제 이상을 틀리면 탈락합니다!   ");
		System.out.println("============================================================");
		System.out.println("메인메뉴로 돌아간다-1 시작한다-2");
		
		try {
		select= sc.nextInt();
		if(!(select>0 && select<3)) {
			BadInputException e = new BadInputException(String.valueOf(select));
			throw e;
			}
		} catch(InputMismatchException | BadInputException e) {
			System.out.println("숫자만 입력하세요.");
			sc.nextLine();
			continue;
		}
		
		switch(select) {
		case 1 : return;
		case 2 :
			members.useLife();
			System.out.println("게임을 시작합니다.");
		
				Over o = new Over();
				Lv1Start lv1 = new Lv1Start(o);
				CountDownThread cdt = null;
				cdt = new CountDownThread(o);
				cdt.start();
				lv1.playGame();
			
				
		}
		}
	}
		
		
}