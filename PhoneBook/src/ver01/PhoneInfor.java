package ver01;



public class PhoneInfor {
	
	
	
	String name;		// 이름
	String phoneNumber;	// 전화번호
	String birthday;	// 생일
	
	// 생성자 생성
	PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfor(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	public void showInfor() {
		System.out.println("이름 >> "  +name);
		System.out.println("전화번호 >> " + phoneNumber);
		if(!(birthday==null)) {
			
			System.out.println("생일 >> " + birthday);
		} else {
			System.out.println("생일 >> 입력 데이터 없음." );
		}
	}
}
