package friend2;

import java.util.Scanner;

public class FriendInfoMain2 {

	public static void main(String[] args) {
		
		// 출력 클래스 인스턴스 생성
		FriendInfoHandler2 handler = new FriendInfoHandler2(10); // 왜 int값이 들어갈까?
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 반복문
		while(true) {
		
		// 출력문
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교 친구 정보를 저장");
			System.out.println("2. 대학 친구 정보를 저장");
			System.out.println("3. 전체 정보를 출력");
			System.out.println("4. 기본 정보를 출력");
			System.out.println("5. 프로그램 종료");
			System.out.println("선택하세요 >> ");
			
		// choice 변수 생성
			int choice = sc.nextInt();
		
		// switch문
			switch(choice) {
				case 1: case 2:
					handler.addFriend2(choice);					
					break;
				case 3:
					handler.showAllData();
					break;					
				case 4:
					handler.showAllSimpleData();
					break;					
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return; // 메소드를 종료 -> 메인메소드 안에서 돌고 있으므로 메인 메소드를 종료
				
			
		}
		
		
		}
	}

}
