package phoneinfor;

public class PhoneUnivInfor extends PhoneInfor {

	// 변수 선언
	private String major;
	private String year;

	// 생성자 
	public PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major = major;
		this.year = year;		
	}

	// 메소드
	@Override
	void showData() {		
		super.showData();
		System.out.println("전공 >> " + major);
		System.out.println("학년 >> " + year);
	}
	

	

}
