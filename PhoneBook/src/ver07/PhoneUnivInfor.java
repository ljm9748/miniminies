package ver07;

import java.io.Serializable;

public class PhoneUnivInfor extends PhoneInfor implements Serializable { // 상속은 하나만 가능 
	// Infor에서 Serializable을 상속받고 있기 때문에 PhoneInfor도 함께 상속받고 PhoneUnivInfor도 구현을 할 수 있다.
	
	// 대학 친구: 전공, 학년 추가
	private String major;
	private int grade;

	public PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, int grade) {
		// 상위 클래스의 생성자 호출: 상위클래스의 멤버 변수 초기화
		super(name, phoneNumber, address, email);
		// 새로 추가된 멤버 변수 초기화
		this.major = major;
		this.grade = grade;

	}
	
	// getter/setter
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("전공 >> " + major);
		System.out.println("학년 >> " + grade);
	}

	// 20.10.21 추가
	@Override
	public void showBasicInfor() {
		super.showInfor();
		
	}

}
