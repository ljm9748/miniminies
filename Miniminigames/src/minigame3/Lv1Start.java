package minigame3;

import java.util.Scanner;
import memberInfo.MemberInfoManager;

public class Lv1Start {

	MemberInfoManager members = MemberInfoManager.getManager();
	
	Over o;
	public Lv1Start(Over o) {
		this.o=o;
	}

	public void playGame() {

		
		Scanner sc = new Scanner(System.in);

		int answer = 0;
		int correct = 0;
		int wrong = 0;
		System.out.println("15초안에 입력을 해주세요");

		for (int i = 0; i < 5; i++) {
			
			int A = (int) (Math.random() * 10);
			int B = (int) (Math.random() * 10);
			int C = (int) (Math.random() * 10);
			System.out.println((i + 1) + "번째 문제 입니다.");
			System.out.println(10 * A + B + "+" + C + "=");
			try {
			answer = sc.nextInt();
			} catch (Exception e){ 
			System.out.println("잘못 입력하셨습니다^^다음 문제로 넘어갑니다");
			sc.nextLine();
			} 

			if (o.timeOverCheck) { 	
			wrong++;
			System.out.println("정답을 맞춘 횟수 = " + correct);
			System.out.println("틀린 횟수 = " + wrong);

				break;
			}
			
			else if (10 * A + B + C == answer) {
				System.out.println("정답");
				correct++;
				System.out.println("정답을 맞춘 횟수 = " + correct);
				System.out.println("틀린 횟수 = " + wrong);
			}

			else {
				System.out.println("틀렸습니다");
				wrong++;
				System.out.println("정답을 맞춘 횟수 = " + correct);
				System.out.println("틀린 횟수 = " + wrong);

			}
	

		}
		o.gameOverCheck=true;

		if (wrong + correct < 5&&correct<3) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t    시간초과로 탈락하셨습니다\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			members.updateScore(3, 1);

		}
		else if (wrong >= 3) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t3개 이상 틀렸네요 당신은 탈락입니다\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			members.updateScore(3, 1);

		}
		else if (correct >= 3) {
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
			System.out.println("\n\t\t~Clear~\t\t");
			System.out.println("\t스피드 계산 게임 LV1을 통과하셨습니다.\t");
			System.out.println("\t 50포인트가 지급됩니다.\t");
			System.out.println("\t스피드 계산 게임 LV2에 도전해보세요^^.\t\n");
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\n");
			members.updatePoint(50);
			members.updateScore(3, 0);
	
		}
		

	}
		
}