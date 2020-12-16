package ver04;

public class PhoneInfor { // extends Object 
	
	//변수: 이름, 전화번호, 주소, 이메일 => 캡슐화: 정보 은닉(변수의 직접 접근을 제한 - 변수를 보호)
	// 메소드: 적절한 출력이 가능하도록 정의 
	
	
	/*
	 	• 이름            name              String
		• 전화번호       phoneNumber     String
		• 생년월일       birthday            String 
	 */
	
	// 변수 설정
	private String name;		// 친구의 이름
	private String phoneNumber;	// 전화번호	
	private String address;		// 주소
	private String email;		// 이메일
	
	
	// 생성자: 3개의 데이터를 받아 초기화
	PhoneInfor(String name, String phoneNumber, String address, String email){
		// super(); / Object 클래스의 생성자를 호출
		this.name = name; // this는 자신을 가리킴
		this.phoneNumber = phoneNumber;		
		this.address = address;
		this.email = email;
	}	
	
	// 값을 수정 하기 위해서는 getter(값을 읽어올 때)/setter(값을 설정할 때) 메소드가 필요	
	// 변수를 다른 클래스에서도 사용할 수 있도록 하는 코드	
	public String getName() { // 값을 반환
		return name;
	}

	public void setName(String name) { // 인스턴스 변수 name에 값을 저장 name의 타입과 매개변수 타입이 같아야 함.
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 저장된 데이터의 적절한 출력 메소드
	public void showInfor() { 	// 메소드는 외부에서도 사용할 수 있도록 public을 붙인다.
								// 하위 클래스에서 오버라이딩 하는 목적
		System.out.println("이름 >> " + name);
		System.out.println("전화번호 >> " + phoneNumber);
		System.out.println("주소 >> " + address );
		System.out.println("이메일 >> " + email);			
		
	}
	

}
