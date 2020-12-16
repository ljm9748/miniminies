package ver04;

import java.util.Scanner;

import ver03.Util;

public class PhoneBookMain implements Util {

	public static void main(String[] args) {
		
		/*
		 * // test
		 *  System.out.println("숫자 >> "); 
		 *  int num = Util3.sc.nextInt();
		 * Util3.sc.nextLine(); // 역할 -> 정상적인 흐름을 만들어냄
		 * 
		 * System.out.println("이름 >> "); String name = Util3.sc.nextLine();
		 * 
		 * System.out.println("주소 >> "); String address = Util3.sc.nextLine();
		 */
		
		//인스턴스 생성
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			System.out.println("\n-----메뉴를 입력해주세요.-----");
			System.out.println(" 1.저장");
			System.out.println(" 2.검색");
			System.out.println(" 3.삭제");
			System.out.println(" 4.모든 정보 출력");
			System.out.println(" 5.종료");
			
			System.out.println("\n>> ");
			
			int select = SC.nextInt();
			
			if( !(select>0 && select<6) ) {
				System.out.println("메뉴의 선택이 옳바르지 않습니다. \n 다시 선택해주세요.");
				continue;	// 이후 내용은 생략
			}
			
			switch(select) {
				case 1:
					manager.insertInfo();
					break;
				case 2:
					manager.searchInfor();
					break;
				case 3:
					manager.deleteInfor();
					break;
				case 4:
					manager.showAllInfor();
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
			
			
		}
		
	
		
	}

}
