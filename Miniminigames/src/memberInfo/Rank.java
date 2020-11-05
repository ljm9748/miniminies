package memberInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;
import minigame3.BadInputException;
import miniminigame.Menu;


public class Rank implements Util{
	
	MemberInfoManager manager = MemberInfoManager.getManager();
	//1번게임
	//ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	
	//ArrayList<Integer> tmp = new ArrayList<Integer>();
	//static ArrayList<Person> list = new ArrayList<Person>();
	static ArrayList<Person> list = null;
		
	
	ArrayList<MemberInfo> member = (ArrayList<MemberInfo>) manager.getMembers();
	
	
/*
			
	public static void main(String[] args) {
	
		
		//for (int i = 0; i < list.size(); i++) {
		list.add(new Person("hi1", 2, 3, 1,4,5,6,7,8,9,10,11,12));
		list.add(new Person("hi2", 3, 3, 1,4,5,6,7,8,9,10,11,12));
		list.add(new Person("hi3", 1, 3, 1,4,5,6,7,8,9,10,11,12));
		list.add(new Person("hi4", 5, 3, 1,4,5,6,7,8,9,10,11,12));
		list.add(new Person("hi5", 7, 3, 1,4,5,6,7,8,9,10,11,12));
			//list.add();

			Collections.sort(list, (p1,p2)->p1.g1win-p2.g1win);

		}
				*/
	public void sortScore(){	
		list= new ArrayList<Person>();
		for(int i=0; i <member.size(); i++) {
				list.add(new Person(
				//p.name= member.get(i).getName();
				member.get(i).getName(),
				member.get(i).getScore(1, 0)
				, member.get(i).getScore(1, 1)
				,member.get(i).getScore(1, 0)+member.get(i).getScore(1, 1)
				, member.get(i).getScore(2, 0)
				, member.get(i).getScore(2, 1)
				,member.get(i).getScore(2, 0)+member.get(i).getScore(2, 1)
				, member.get(i).getScore(3, 0)
				, member.get(i).getScore(3, 1)
				,member.get(i).getScore(3, 0)+member.get(i).getScore(3, 1)
				, member.get(i).getScore(1, 0)+member.get(i).getScore(2, 0)+member.get(i).getScore(3, 0)
				, member.get(i).getScore(1, 1)+member.get(i).getScore(2, 1)+member.get(i).getScore(3, 1)
				,member.get(i).getScore(1, 0)+member.get(i).getScore(2, 0)+member.get(i).getScore(3, 0)+member.get(i).getScore(1, 1)+member.get(i).getScore(2, 1)+member.get(i).getScore(3, 1)
				)
						);
			}
		
		/*
	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).name);
		}
		*/

			
	}
	public void showRank(int gamenum) {
			
		switch(gamenum) {
		case 1:
			Collections.sort(list, (p1,p2)->p2.g1win-p1.g1win);
			System.out.println(gamenum+"번 게임의 랭킹을 공개합니다!!");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d등: %s (%d승 %d패)", i+1, list.get(i).name, list.get(i).g1win, list.get(i).g1lose);
				if (list.get(i).g1total != 0) {
					float tmp = (float)list.get(i).g1win/list.get(i).g1total *100;
					System.out.printf(" => 승률 약 %.2f%%",tmp);
				}
				System.out.println();
			}
			break;
		case 2:
			Collections.sort(list, (p1,p2)->p2.g2win-p1.g2win);
			System.out.println(gamenum+"번 게임의 랭킹을 공개합니다!!");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d등: %s (%d승 %d패)", i+1, list.get(i).name, list.get(i).g2win, list.get(i).g2lose);
				if (list.get(i).g2total != 0) {
					float tmp = (float)list.get(i).g2win/list.get(i).g2total *100;
					System.out.printf(" => 승률 약 %.2f%%",tmp);
				}
				System.out.println();
			}
			break;
		case 3:
			Collections.sort(list, (p1,p2)->p2.g3win-p1.g3win);
			System.out.println(gamenum+"번 게임의 랭킹을 공개합니다!!");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d등: %s (%d승 %d패)", i+1, list.get(i).name, list.get(i).g3win, list.get(i).g3lose);
				if (list.get(i).g2total != 0) {
					float tmp = (float)list.get(i).g3win/list.get(i).g3total *100;
					System.out.printf(" => 승률 약 %.2f%%",tmp);
				}
				System.out.println();
			}
			break;
		case 4:
			Collections.sort(list, (p1,p2)->p2.win-p1.win);
			System.out.println("전체 게임의 랭킹을 공개합니다!!");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d등: %s (%d승 %d패)", i+1, list.get(i).name, list.get(i).win, list.get(i).lose);
				if (list.get(i).total != 0) {
					float tmp = (float)list.get(i).win/list.get(i).total *100;
					System.out.printf(" => 승률 약 %.2f%%",tmp);
				}
				System.out.println();
			}
			break;
		default:
			//Collections.sort(list, (p1,p2)->p2.win-p1.win);
			break;

		}
		

		
	}
	public void askgame() {
			
		while(true) {
		int choice4 = 0;
		
		System.out.println("■■■■■■■ 게임선택 ■■■■■■■");
		
		System.out.println("1. 1번게임 랭킹보기");
		System.out.println("2. 2번게임 랭킹보기");
		System.out.println("3. 3번게임 랭킹보기");
		System.out.println("4. 처음으로 되돌아가기");
		
		try {
			choice4 = SC.nextInt();
			if(!(choice4 < 5 && choice4>0)) {
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
		SC.nextLine();
		
		switch(choice4) {
		
		case 1: case 2: case 3: 
			showRank(choice4);
		case 4:
			return;
		default:
			break;

		}
	}
		


}

class Person {

	
	String name;
	
	int g1win;
	int g1lose;
	int g1total;
	
	int g2win;
	int g2lose;
	int g2total;
	
	int g3win;
	int g3lose;
	int g3total;
	
	int win;
	int lose;
	int total;
	
	public Person(String name, int g1win, int g1lose, int g1total, int g2win, int g2lose, int g2total, int g3win,
			int g3lose, int g3total, int win, int lose, int total) {
		super();
		this.name = name;
		this.g1win = g1win;
		this.g1lose = g1lose;
		this.g1total = g1total;
		this.g2win = g2win;
		this.g2lose = g2lose;
		this.g2total = g2total;
		this.g3win = g3win;
		this.g3lose = g3lose;
		this.g3total = g3total;
		this.win = win;
		this.lose = lose;
		this.total = total;
	}
}
}
