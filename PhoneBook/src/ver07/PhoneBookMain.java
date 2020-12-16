package ver07;

import java.util.InputMismatchException;

import ver03.Util;

// 20.10.27 Menu 구현
public class PhoneBookMain implements Util, Menu {

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
		//PhoneBookManager4 manager = new PhoneBookManager4(100);
		//20.10.21 수정
		// 참조값을 인스턴스 통해서 받음. 
		// 싱글톤 처리 -> new 연산자를 사용하지 않고 처리
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		
		// 20.10.27 Menu를 구현함으로써 코드를 간단화
		while(true) {
			System.out.println("\n-----메뉴를 입력해주세요.-----");
			System.out.println(INSERT + ".저장");
			System.out.println(SERACH + ".검색");
			System.out.println(DELETE + ".삭제");
			System.out.println(DISPLAY_ALL + ".모든 정보 출력");
			System.out.println(SAVE + ".모든 정보 저장(file 저장)");
			System.out.println(Menu.EXIT + ".종료");
			
			System.out.println("\n>> ");
			
			
			int select = 0;
			
			//20.10.26 예외 처리 추가
			try {
				select = SC.nextInt();			
			
				if( !(select>0 && select<10) ) {
				
					//System.out.println("메뉴의 선택이 옳바르지 않습니다. \n 다시 선택해주세요.");
					// continue;	// 이후 내용은 생략
					
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch(InputMismatchException | BadInputException e) {
				System.out.println("메뉴 입력이 잘못되었습니다.");
				SC.nextLine();
				continue;
			} catch(Exception e1) {
				System.out.println("메뉴 입력이 잘못되었습니다.");
				SC.nextLine();
				continue;
				
			}
			
			
			switch(select) {
				case INSERT:
					manager.insertInfo();
					break;
				case SERACH:
					manager.searchInfor();
					break;
				case DELETE:
					manager.deleteInfor();
					break;
				case DISPLAY_ALL:
					manager.showAllInfor();
					break;
				// 20.10.27 추가
				case SAVE:
					manager.save();
					break;
				case Menu.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
			
			
		}
		
	
		
	}

}
