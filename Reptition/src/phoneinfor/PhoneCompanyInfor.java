package phoneinfor;

public class PhoneCompanyInfor extends PhoneInfor {

	// 변수 선언
	private String company;
	
	public PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company = company;
		
	}

	// 메소드
	@Override
	void showData() {		
		super.showData();
		System.out.println("회사명 >> " + company);
	}
	

	

}
