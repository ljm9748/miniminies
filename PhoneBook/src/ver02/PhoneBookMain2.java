package ver02;

import java.util.Scanner;

public class PhoneBookMain2 {

	public static void main(String[] args) {
		
		// 사용자에게 데이터를 받는다.
		Scanner s = new Scanner(System.in);
		
		// 프로그램을 종료하기 전까지 반복
		while(true) {
			
		
		
		// 인스터늣 생성을 위해서는 이름, 전화번호, 생일 데이터를 받는다.
		System.out.println("데이터 저장을 위한 데이터를 입력해주세요.");
		System.out.print("이름을 입력해주세요.> ");
		String name = s.nextLine(); // 이름을 받음.
		System.out.print("전화번호를 입력해주세요.> ");
		String phoneNumber = s.nextLine();
		System.out.print("생일을 입력해주세요.> ");
		String birthday = s.nextLine(); // "   "
		
		// 인스턴스 생성
		PhoneInfor2 infor = null;
		
		// trim() -> " 12 3      ".trim() -> "12 3" (왼쪽과 오른쪽 공백을 지워줌 / 가운데 공백은 지워주지 않음.)
		
		// 입력값 없이 enter인 경우 공백 문자열을 반환
		// 문자열의 길이가  0이면 
		//if(birthday.length()==0) {
		if(birthday.trim().isEmpty()) { // length() == 0 -> true
			infor = new PhoneInfor2(name, phoneNumber, null);	
		} else {
			infor = new PhoneInfor2(name, phoneNumber, birthday);
		}
		
		// 메소드 호출
		infor.showInfor();
		
		}
	}

}
