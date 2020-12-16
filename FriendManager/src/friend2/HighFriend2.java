package friend2;

public class HighFriend2 extends Friend2 {

	private String job;
	
	public HighFriend2(String name, String phoneNumber, String addr, String job) {
		super(name, phoneNumber, addr);
		this.job = job;		
	}

	@Override
	public void showData() {		
		super.showData();
		System.out.println("직업 >> " + job);
	}

	@Override
	public void showBasicInfor() {		
		//super.showBasicInfor(); -> 상위 클래스에 코드가 입력되어 있지 않아 생략 가능
		System.out.println("이름 >> " + getName());
		System.out.println("전화 번호 >> " + getPhoneNumber());
		System.out.println("주소 >> " + getAddr());
	}
	
	

}
