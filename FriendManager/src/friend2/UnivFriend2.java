package friend2;

public class UnivFriend2 extends Friend2 {

	private String major;
	
	public UnivFriend2(String name, String phoneNumber, String addr, String major) {
		super(name, phoneNumber, addr);	
		this.major = major;
	}

	@Override
	public void showData() {		
		super.showData();
		System.out.println("전공 >> " + major);
	}

	@Override
	public void showBasicInfor() {		
		System.out.println("이름 >> " + getName());
		System.out.println("전화 번호 >> " + getPhoneNumber());
		System.out.println("주소 >> " + getAddr());
	}
	
	
	

}
