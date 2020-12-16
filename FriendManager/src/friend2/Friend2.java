package friend2;

public class Friend2 {
	
	String name;
	String phoneNumber;
	String addr;
	
	// 생성자 생성
	public Friend2(String name, String phoneNumber, String addr) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.addr = addr;
	}
	
	// 다른 클래스에서도 사용할 수 있도록 하는 코드
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddr() {
		return addr;
	}
	
	
	// 메소드 생성
	public void showData() {
		System.out.println("이름 >> " + name);
		System.out.println("전화번호 >> " + phoneNumber);
		System.out.println("주소 >> " + addr);
	}
	
	public void showBasicInfor() {
		
	}
	


}
