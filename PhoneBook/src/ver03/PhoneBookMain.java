package ver03;

import java.util.Scanner;

public class PhoneBookMain implements Util{

	public static void main(String[] args) {
		
		// PhoneBookManager 인스턴스 생성 -> 배열과 메소드를 사용 // 1 - 인스턴스가 생성
		PhoneBookManager manager = new PhoneBookManager();
		System.out.println("현재 저장된 정보의 개수: " + manager.cnt);
		System.out.println("저장이 가능한 정보의 총 개수: " + manager.phoneBook.length ); // 배열의 사이즈 
		
		//Scanner sc = new Scanner(System.in);
		
		// 흐름 반복하기
		while(true) {
			
			System.out.println("-----전화번호 관리 프로그램-----");
			System.out.println("메뉴를 입력하세요.");
			System.out.println(" 1. 정보 저장");
			System.out.println(" 2. 정보 검색");
			System.out.println(" 3. 정보 삭제");
			System.out.println(" 4. 전체 출력");
			System.out.println(" 5. 프로그램 종료");
			System.out.println("-------------------------");
			
			char insertMenu = SC.nextLine().charAt(0);
			// 공백이 생기면 문자 입력이 잘 안됨.
			
			// 분기
			switch(insertMenu) {
			
			case '1':
				manager.insertMember();
				break;
			case '2':
				manager.searchMember();
				break;
			case '3':
				manager.deleteMember();
				break;
			case '4':
				manager.displayAll();
				break;
			case '5':
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;			
			}
			
			
//			정보 저장 기능 메소드 호출
			//manager.insertMember();  
			
			//System.out.println("현재 저장된 정보의 개수: " + manager.cnt);
			//manager.phoneBook[0].showInfor(); // phoneBook -> phoneIfor타입의 참조변수 -> showInfor 메소드를 호출 가능
		
//			검색 기능 메소드 호출
			//manager.searchMember();
			
		}
		
	}

}
