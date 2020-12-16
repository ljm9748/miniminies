package phoneinfor;

public class PhoneInfor {
	
	// 변수 생성
	String name;			// 이름	
	String phoneNumber;		// 전화번호
	String address;			// 주소
	String email;			// 이메일 주소
	
	// 생성자 생성
	PhoneInfor(String name, String phoneNumber, String address, String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
	}
	
	
	// 메소드 생성
	
	void showData() {
		System.out.println("이름 >> " + name);
		System.out.println("전화번호 >> " + phoneNumber);
		System.out.println("주소 >> " + address);
		System.out.println("이메일 주소 >> " + email);
	}
	
	
	
}
