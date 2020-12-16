package friend2;

import java.util.Scanner;

public class FriendInfoHandler2 {
	
//	친구 정보를 저장하는 배열 선언
	private Friend2[] friends2; 	// 외부에서 접근 차단 => 친구의 정보를 저장하는 배열
	int numOfFriends = 0; 		// 저장된 친구의 정보 개수, 배열의 요소 추가 시 인덱스로 사용	
	
	// 생성자로 초기화
	public FriendInfoHandler2(int num) {
		friends2 = new Friend2[num];
		numOfFriends = 0;
	}	
	
	// 배열에 친구 정보를 저장하는 기능 -> 다형성을 이용한 매개변수 정의
	void addFriend2Info(Friend2 f) {
		friends2[numOfFriends++] = f;
	}
	
	// choice -> 1 - 고교친구, 2 - 대학친구
	void addFriend2(int choice) {	
		// 사용자로 부터 기본 정보를 입력 받자: 이름, 전화번호 주소
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정보를 입력하세요. >> ");
		System.out.println("이름 >> ");
		String name = sc.nextLine();
		System.out.println("전화번호 >> ");
		String phoneNumber = sc.nextLine();
		System.out.println("주소 >> ");
		String addr = sc.nextLine();				
	
	// 인스턴스를 생성해서 저장(고교 친구와 대학친구가 다르다.)
		if(choice==1) {
			// 고교 친구 데이터를 받고 -> 인스턴스 생성 
			System.out.println("직업 >> " );
			String job = sc.nextLine();
			
			// 배열에 저장
			addFriend2Info(new HighFriend2(name, phoneNumber, addr, job));
			
		} else if(choice==2) {
			// 대학 친구 데이터를 받고 -> 인스턴스 생성 
			System.out.println("전공 >> ");
			String major = sc.nextLine();
			
			// 배열에 저장
			addFriend2Info(new UnivFriend2(name, phoneNumber, addr, major));
			
		}		
	
	}
	// 전체 정보를 출력하는 메소드 -> showData()
	public void showAllData() {
		System.out.println("\n-----전체 데이터를 출력합니다.-----");
		for(int i=0; i<numOfFriends; i++) {
			friends2[i].showData();
			System.out.println("\n");
		}
	}
	
	// 전체 기본 정보를 출력하는 메소드 -> showBasicInfo()
	public void showAllSimpleData() {
		System.out.println("\n-----간단한 데이터를 출력합니다.-----");
		for(int i=0; i<numOfFriends; i++) {
			friends2[i].showBasicInfor();
			System.out.println("\n");
		}
	}
	
	

}
