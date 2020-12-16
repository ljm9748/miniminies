package ver01;

public class PhoneBookMain1 {

	public static void main(String[] args) {
		
		PhoneInfor1 pi1 = new PhoneInfor1("손흥민", "010-1111-1111", "1990-12-10");
		pi1.showInfor(); // 참조변수 pi1이 가리키는 phoneInfor 타입 객체의 메소드
		
		PhoneInfor1 pi2 = new PhoneInfor1("박지성", "010-2222-2222");
		pi2.showInfor();
	}

}
