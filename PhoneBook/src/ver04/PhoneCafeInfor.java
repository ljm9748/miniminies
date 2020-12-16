package ver04;

public class PhoneCafeInfor extends PhoneInfor {

	// 동호회 이름, 닉네임
	private String cafeName; // 동호회 이름
	private String nickName; // 닉네임

	// 생성자
	public PhoneCafeInfor(String name, String phoneNumber, String address, String email, String cafeName,
			String nickName) {
		super(name, phoneNumber, address, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	// getter/setter
	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	//오버라이드
	@Override
	public void showInfor() {		
		super.showInfor();
		System.out.println("동호회 이름 >> " + cafeName);
		System.out.println("닉네임 >> " + nickName);
	}

	
	
	

}
