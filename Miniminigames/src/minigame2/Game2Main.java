package minigame2;
/*
  	음료를 만들자 miniGame ver0.2
  	제작 : 한우리
  	제작일 : 2020 - 11 - 02
  	설명 : 손님은 음료 4개 중 무작위로 주문한다 {아메리카노, 카페라떼, 카페모카, 바닐라라떼}
  		   플레이어는 주어진 재료 {물, 우유, 커피, 초코, 바닐라} 를 입력한다.
  		  만들어진 음료는 손님이 주문한 음료와 비교하여 포인트를 얻는다!
  		  
  	추가하고 싶은 기능 : Thread를 이용한 미니게임 시간 제한 기능
  					음료를 만들고 저장하여 한 번에 제공하기
  					손님이 음료를 여러개 주문하기(난이도 추가)
  					좀 더 간결한 코드로 Ver Up
  					
  	생각 : 별 생각없이 변수명을 적었더니 가독성이 너무 떨어져서 변수를 수정하는 작업을 먼저 가짐. -> 완료 그러나 아직 부족함
  	
  		  주석을 달아 다시 확인 할 수 있는 코드를 만듬. -> 완료
  		  
  		  주문을 받는 부분(랜덤)과 음료를 만드는 부분을 나누었더니 음료를 만들면서 주문과 비교하는 과정에서 새로운 Random값으로 바뀌어버려서 
  		 비교를 하는데 오류가생김 .. -> 해결 -> Customer 클래스에 적어두었음
  		  
 */
import java.util.Scanner;

public class Game2Main {

	public static void main(String[] args) {
		
		// 메인메뉴 선택을 하기위한 스캐너
		Scanner sc = new Scanner(System.in);
		
		// 메뉴 선택을 위한 select 변수설정
		int select;
		
		
		// 프로그램 유지를 위한 루프
	while(true) {
		System.out.println("*****메뉴를 선택해주세요*****");
		System.out.println(" 1. 게임을 시작합니다.");
		System.out.println(" 2. 게임 종료하기 .");
			
		try {
			// 입력받은 int 타입의 정수를 select에 넣음
			// ++ 숫자가 아닌 입력  & 범위 이상의 숫자 예외처리 해야함.
			select = sc.nextInt();
			sc.nextLine();
			
			// 메뉴 번호외 숫자를 입력했을때 예외처리
			if(!(select>0 && select<3)) {
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
			Player p1 = new Player();
			p1.playerMakeDrink();
			break;
			
		// 게임 종료	
		case 2:
			System.out.println("게임을 종료합니다~ 띠로링~");
			System.exit(0);
		}
	}
		
		
	}

}
