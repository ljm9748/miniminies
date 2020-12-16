package card;

public class Number {
	
	int num;
	
	Number(int number){ // 생성자
		num = number;
		System.out.println("생성자가 실행되었습니다.");
	}
	
	Number(){ // 매개 변수가 없다.
		num = 10;
		System.out.println("생성자가 실행되었습니다.");
	}
	
	int getNumber() {
		return num;
	}
}
