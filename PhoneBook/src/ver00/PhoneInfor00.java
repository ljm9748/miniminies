package ver00;

public class PhoneInfor00 {
	//변수: 이름, 전화번호, 생년월일
		// 메소드: 적절한 출력이 가능하도록 정의 
		//(생년월일 정보는 저장할 수도 있고, 저장하지 않을 수 도 있게끔 생성자 생성)
		
		/*
		 	• 이름            name              String
			• 전화번호       phoneNumber     String
			• 생일     	birthday            String 
		 */
	
//	변수 설정
	String name;			// 친구 이름
	String phoneNumber;		// 친구 전화번호
	String birthday;		// 친구 생일
	String address;			// 친구 주소
	
//	생성자 생성
	// 4개의 값 모두 가지는 경우
	PhoneInfor00(String name, String phoneNumber, String birthday, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.address = address;
	}
	
	// name, phoneNumber, birthday개의 값만 가지는 경우
	PhoneInfor00(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;		
	}
	
	// name, phoneNumber의 값만 가지는 경우
	PhoneInfor00(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	// name의 값만 가지는 경우
	PhoneInfor00(String name){
		this.name = name;
	}
	
//	출력 메소드
	void showData00() {
		//이름		
		if(name == null) {
			System.out.println("이름 >> 입력데이터 없음");
		} else {
			System.out.println("이름 >> " + name);
		}
		
		//전화번호
		if(phoneNumber == null) {
			System.out.println("전화번호 >> 입력데이터 없음");
		} else {
			System.out.println("전화번호 >> " + phoneNumber);
		}
		
		//생일
		if(birthday == null) {
			System.out.println("생일 >> 입력데이터 없음");
		} else {
			System.out.println("생일 >> " + birthday);
		}
		
		//주소
		if(address == null) {
			System.out.println("주소 >> 입력데이터 없음");
		} else {
			System.out.println("주소 >> " + address);
		}
		System.out.println("----------");
	}
	
	
}
