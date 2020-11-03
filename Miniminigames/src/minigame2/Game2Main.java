package minigame2;
/*
  	음료를 만들자 miniGame ver0.3
  	제작 : 한우리
  	제작일 : 2020 - 11 - 03
  	
  	설명 : 손님은 음료 4개 중 무작위로 주문한다 {아메리카노, 카페라떼, 카페모카, 바닐라라떼}
  		   플레이어는 주어진 재료 {물, 우유, 커피, 초코, 바닐라} 를 입력한다.
  		  만들어진 음료는 손님이 주문한 음료와 비교하여 포인트를 얻는다!
  		  게임횟수, 승패기능 추가.
  		  
  	추가하고 싶은 기능 : Thread를 이용한 미니게임 시간 제한 기능 -> 추가 예정
  					음료를 만들고 저장하여 한 번에 제공하기 -> 세번을 플레이하는 방식으로 변경 11/03 완료
  					손님이 음료를 여러개 주문하기(난이도 추가) -> 11/03 완료
  					좀 더 간결한 코드로 Ver Up -> 강사님께서 알려주신 contains를 사용해서 삼항연산자를 많이 대체 할 수 있었음. 
  					
  	생각 : 변수, 주석이 왜 중요하다고 강사님께서 말씀하셨는지 알겠다. 코드도 어렵지만 고쳐도 고쳐도 맘에들지 않는다.
  		 contains 를 활용해서 어떻게 삼항연산자를 줄일수있을까 고민했다. 강사님께서 말씀하신 문제를 먼저 알아내고 그것을 보고 "패턴찾기" 방법을 사용하면
  		 수학에 약한 나지만 얼추 규칙은 보였던 것 같다. 오늘시작할 ver0.3은 팀원들과 파일을 합쳐 |승패기능추가(완료)|상점연동|메인메뉴가기|등 다양한 작업을 해볼것이다. 
  		  
 */
import java.util.Scanner;

import memberInfo.MemberInfoManager;

public class Game2Main {


	public static void main(String[] args) {
		
		
		// 메인메뉴 선택을 하기위한 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 메뉴 선택을 위한 select 변수설정
		int select;
		
		// 게임 실행 횟수
		int numOfGame = 0;
		
		// 게임 승패 기록 횟수
		Player easyWinLose = new Player();
		HardMode hardWinLose = new HardMode();
		
		// 프로그램 유지를 위한 루프
	while(true) {
		
		
		System.out.println("오래하면 엄마한테 혼납니다.게임 실행 횟수 : " + numOfGame);
		
		System.out.println("**********메뉴를 선택해주세요**********");
		System.out.println(" 1. 게임을 시작합니다 (easyMode)");
		System.out.println(" 2. 게임을 시작합니다 (hardMode)");
		System.out.println(" 3. 게임 종료하기");
		System.out.println("*********************************");
			
		try {
			// 입력받은 int 타입의 정수를 select에 넣음
			// ++ 숫자가 아닌 입력  & 범위 이상의 숫자 예외처리 해야함.
			select = sc.nextInt();
			sc.nextLine();
			
			// 메뉴 번호외 숫자를 입력했을때 예외처리
			if(!(select>0 && select<4)) {
			System.out.println("메뉴의 선택이 옳바르지 않습니다. \n다시 선택해주세요.");
			}
			
			// 문자나 기타 기호를 입력했을때 예외처리
		} catch (Exception e) {
			System.out.println("메뉴입력이 잘못되었습니다. \n 다시 선택해주세요.");
			sc.nextLine();
			continue;
		}
			
		switch(select) {
		
		// 게임 시작 
		case 1:
			++numOfGame;
			Player easy = new Player();
			easy.playerMakeDrink();
			break;
			
		case 2:
			++numOfGame;
			HardMode hard = new HardMode();
			hard.playerMakeDrink();
			break;
			
		// 게임 종료	
		case 3:
			System.out.println("게임을 종료합니다~ 띠로링~");
			System.exit(0);
			
		
		}
	}
		
		
	}

}
