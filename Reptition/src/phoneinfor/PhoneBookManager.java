package phoneinfor;

import java.util.Scanner;

public class PhoneBookManager {
	
	// 배열: 전화번호 정보(이름, 전화번호, 생일)를 저장하는 목적
	
	// 사용자로 부터 데이터를 받는다.
	Scanner sc = new Scanner(System.in);
	
	// 정보 저장을 위한 배열 선언
	private PhoneInfor[] phoneBook;
	private int cnt = 0; // 저장된 정보의 개수, 배열의 요소 추가 시 인덱스로 사용
	
	
	//다른 클래스에서도 사용할 수 있도록 만들어주는 코드
	public int getCnt() {
		return cnt;
	}
	
	// 생성자(초기화)
	public PhoneBookManager(int num){
		phoneBook = new PhoneInfor[num];
		cnt = 0;		
	}
	
	// 배열에 친구 정보를 저장하는 기능
	void insertMemberInfor(PhoneInfor p) {
		phoneBook[cnt++] = p;
	}
	
	// 기능 >> 1.2.저장, 3.검색, 4.삭제, 5.전체 출력, 6.프로그램 종료
	
//	1.2.저장 기능
	// 사용자로부터 데이터를 받아 ->
	// 인스턴스를 생성 ->
	// 배열에 저장
	
	void insertMember(int choice) {
		System.out.println("정보를 입력 >> ");
		System.out.println("이름 >> ");
		String name = sc.nextLine();
		
		System.out.println("전화번호 >> ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("주소 >> ");
		String address = sc.nextLine();
		
		System.out.println("이메일 주소 >> ");
		String email = sc.nextLine();
		
		// 조건문
		if(choice==1) {
			System.out.println("전공 >> ");
			String major = sc.nextLine();
			
			System.out.println("학년 >> ");
			String year = sc.nextLine();
			
			// 배열 저장
			insertMemberInfor(new PhoneUnivInfor(name, phoneNumber, address, email, major, year));
			
		} else {
			System.out.println("회사명 >> ");
			String company = sc.nextLine();
			// 배열 저장
			insertMemberInfor(new PhoneCompanyInfor(name, phoneNumber, address, email, company));
		}
		
		
	}
	
//	3.검색 기능
	// 배열에서 찾는다 -> 인덱스를 먼저 찾아야 한다.
	// 검색하고자 하는 이름을 사용자로부터 받고
	// 배열의 요소 (참조 값 -> 인스턴스 참조) PhoneInfor.name 변수의 값과 검색 이름을 비교 (동등비교)
	// 해당 인덱스를 찾을 수 있다.
	// 검색된 인덱스로 정보 출력
	
	// 메소드
	void searchMember() {
		if(cnt==0 ) {
			System.out.println("저장된 데이터가 없습니다. 다시 메뉴로 이동합니다.");
		}
		
		// 찾고자 하는 이름을 받는다.
		System.out.println("정보 검색을 시작합니다.");
		
		System.out.println("찾고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		// 이름을 요소 인덱스 검색
		int index = searchIndex(name);
	}

	int searchIndex(String name) {
		
		return 0;
	}
			
	
	
			
			
			
			
			
			
}
