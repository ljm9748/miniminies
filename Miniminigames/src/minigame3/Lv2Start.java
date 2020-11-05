package minigame3;

import java.util.Scanner;
import memberInfo.MemberInfoManager;

public class Lv2Start {
	
	
	MemberInfoManager members = MemberInfoManager.getManager();
	
	
	Over o; //참조변수
	
	public Lv2Start(Over o) {
		this.o=o;
	}
	
	public void playGame() {
		
		
		Scanner sc = new Scanner(System.in);
		
		int answer=0;
		int correct = 0;
		int wrong = 0;
		
		System.out.println("15초안에 입력을 해주세요");
		
		for(int i=0; i<5; i++) {
	
		int A=(int)(Math.random()*10);
		int B=(int)(Math.random()*10);
		int C=(int)(Math.random()*10);
		
		System.out.println((i+1)+"번째 문제 입니다.");
		
			if(i%2==0) {
			System.out.println(10*A+B+"+"+C+"=");
			}
			else {
				System.out.println(10*A+B+"-"+C+"=");
			}
			
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
			else if(i%2==0&&(10*A+B+C)==answer) {
				System.out.println("정답입니다~!");
				correct++;
				System.out.println("정답을 맞춘 횟수 = " + correct);
				System.out.println("틀린 횟수 = " + wrong);
			}
			else if (i%2!=0&&(10*A+B-C)==answer) {
				System.out.println("정답입니다~!");
				correct++;
				System.out.println("정답을 맞춘 횟수 = " + correct);
				System.out.println("틀린 횟수 = " + wrong);
			}
			else if (i%2==0&&(10*A+B+C)!=answer) {
				System.out.println("틀렸습니다!!");
				wrong++;
				System.out.println("정답을 맞춘 횟수 = " + correct);
				System.out.println("틀린 횟수 = " + wrong);
			}
			else if (i%2!=0&&(10*A+B-C)!=answer) {
				System.out.println("틀렸습니다!!");
				wrong++;
				System.out.println("정답을 맞춘 횟수 = " + correct);
				System.out.println("틀린 횟수 = " + wrong);
			}
			
	
		}	//반복문 끝남
		
		o.gameOverCheck=true;
		
		if (wrong + correct < 5&&correct<4) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t    시간초과로 탈락하셨습니다\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			members.updateScore(3, 1);
		}
		else if (wrong >= 2) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println("\n\n\t2개 이상 틀렸네요 당신은 탈락입니다\t\n\n");
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			members.updateScore(3, 1);
		}
		else if (correct >= 4) {
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
			System.out.println("\n\t\t~Clear~\t\t");
			System.out.println("\t스피드 계산 게임 LV2을 통과하셨습니다.\t");
			System.out.println("\t 100포인트가 지급됩니다.\t");
			System.out.println("\t스피드 계산 게임 LV3에 도전해보세요^^.\t\n");
			System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\n");
			members.updatePoint(100);
			members.updateScore(3, 0);
		}

	}
}