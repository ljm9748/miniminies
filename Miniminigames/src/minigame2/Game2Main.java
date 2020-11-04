package minigame2;
/*
  	음료를 만들자 miniGame ver0.4
  	제작 : 한우리
  	제작일 : 2020 - 11 - 04
  	
  	설명 : 손님은 음료 4개 중 무작위로 주문한다 {아메리카노, 카페라떼, 카페모카, 바닐라라떼}
  		   플레이어는 주어진 재료 {물, 우유, 커피, 초코, 바닐라} 를 입력한다.
  		  만들어진 음료는 손님이 주문한 음료와 비교하여 포인트를 얻는다!
  		  게임횟수, 승패기능 추가.
  		  
  	추가하고 싶은 기능 : Thread를 이용한 미니게임 시간 제한 기능 -> 추가 예정
  					abstract사용해보기
  					
  	생각 : 오늘도 변수수정을 했다 처음부터 잘 정했으면 이렇게 자주 고치치 않았을텐데~~~ 
  		  
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
		
		
		
		// 프로그램 유지를 위한 루프
	while(true) {
		
		
		System.out.println("게임 실행 횟수 : " + numOfGame);
		
		System.out.println("■■■■■■■■■■■ 메뉴를 선택해주세요 ■■■■■■■■■■■■");
		System.out.println(" 1. 게임을 시작합니다 (easyMode)");
		System.out.println(" 2. 게임을 시작합니다 (hardMode)");
		System.out.println(" 3. 게임 종료하기");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			
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
