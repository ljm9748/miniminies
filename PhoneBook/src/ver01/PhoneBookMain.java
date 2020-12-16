package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		PhoneInfor p1 = new PhoneInfor("정수인", "010-1111-1111", "1997-11-11");
		PhoneInfor p2 = new PhoneInfor("알리", "010-2222-2222");
		
		p1.showInfor();
		p2.showInfor();
		
		
		
		
	}

}
