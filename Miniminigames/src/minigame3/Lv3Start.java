package minigame3;

import java.util.Scanner;

public class Lv3Start {
	
	Over o;
	public Lv3Start(Over o) {
		this.o=o;
	}
	
	public void playGame() {

	
		Scanner sc = new Scanner(System.in);
		
		int answer=0;
		int win = 0;
		int lose = 0;
		
		System.out.println("15초안에 입력을 해주세요");
	
		for(int i=0; i<5; i++) {
	
			int A=(int)(Math.random()*10);
			int B=(int)(Math.random()*10);
			int C=(int)(Math.random()*10);
			int D=(int)(Math.random()*10);
			System.out.println((i+1)+"번째 문제 입니다.");
		
			
			if(i==3) {
			System.out.println((10*A+B)+"+"+(10*C+D)+"=");
			}
			else if (i%2==0) {
				System.out.println((10*A+B)+"x"+C+"=");
			}
			else if (i!=3&&i%2!=0){ 
				System.out.println((10*A+B)+"-"+(10*C+D)+"=");
			}
			answer = sc.nextInt();
			
			//정답여부 확인
			if(i==3&&(10*A+B)+(10*C+D)==answer) {
				System.out.println("정답입니다~!");
				win++;
				System.out.println("정답을 맞춘 횟수 = "+win);
			}
			else if (i%2==0&&((10*A+B)*C)==answer) {
				System.out.println("정답입니다~!");
				win++;
				System.out.println("정답을 맞춘 횟수 = "+win);
			}
			else if (i%2!=0&&i!=3&&((10*A+B)-(10*C+D))==answer) {
				System.out.println("정답입니다~!");
				win++;
				System.out.println("정답을 맞춘 횟수 = "+win);
			}
			
			else {System.out.println("틀렸습니다~!");
				lose++;
				System.out.println("틀린 횟수="+lose);
			}
			
			
			if (o.timeOverCheck) {
				break;
			}

		
			} //반복문 끝남
			
			o.gameOverCheck=true;
			
			if (lose + win < 5&&win<3) {
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("\n\n\t    시간초과로 탈락하셨습니다\t\n\n");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			}
			else if (lose >= 3) {
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("\n\n\t3개 이상 틀렸네요 당신은 탈락입니다\t\n\n");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");

			}
			else if (win >= 3) {
				System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
				System.out.println("\n\t\t~Clear~\t\t");
				System.out.println("\t스피드 계산 게임 LV3을 통과하셨습니다.\t");
				System.out.println("\t    ~당신은 계산의 달인입니다~\t\n");
				System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO\n");
			}

		}
	}