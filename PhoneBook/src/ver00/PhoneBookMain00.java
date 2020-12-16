package ver00;

import java.util.Scanner;

public class PhoneBookMain00 {

	public static void main(String[] args) {
		
		// 사용자에게 데이터를 받는다.
		Scanner sc = new Scanner(System.in);
		
		//문장의 반복
		while(true) {
		
		// 인스턴스 생성을 위해서는 이름, 전화번호, 생일, 주소 데이터를 받는다.
		
		System.out.println("데이터 저장을 위한 데이터를 입력해주세요.");
		
		System.out.println("이름 >> ");
		String name = sc.nextLine();
		
		System.out.println("전화번호 >> ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("생일 >> ");		
		String birthday = sc.nextLine();
		
		System.out.println("주소 >> ");		
		String address = sc.nextLine();
		
		// 삼항연산자 -> 값이 null일 경우 아닐 경우
		name = name.trim().isEmpty()?null:name;
		phoneNumber = phoneNumber.trim().isEmpty()?null:phoneNumber;
		birthday = birthday.trim().isEmpty()?null:birthday;
		address = address.trim().isEmpty()?null:address;
		
		
		// 인스턴스 생성
		/* PhoneInfor2 pi1 = new PhoneInfor2("김자바", "010-111-1111", "2020-01-01", "경기도");
		pi1.showData();
		
		PhoneInfor2 pi2 = new PhoneInfor2("박자바", "010-111-1111", "2020-01-01");
		pi2.showData();
		
		PhoneInfor2 pi3 = new PhoneInfor2("이자바", "010-111-1111");
		pi3.showData();
		
		PhoneInfor2 pi4 = new PhoneInfor2("송자바");
		pi4.showData(); */
		
		PhoneInfor00 infor2 = null;
		
		// 문자열 길이가 0이면
		// if(birthday.length() == 0){
		//trim() -> "12 3     ".trim() -> "12 3" => 왼쪽과 오른쪽 공백을 지워줌
		
		
		// 인스턴스는 하나만 생성 -> 위에서 다 처리를 해줬기 때문에 하나만 들어가도 된다.
		infor2 = new PhoneInfor00(name, phoneNumber, birthday, address);
		
		infor2.showData00();
		
		}
		
	}

}
