package card;

public class NumberMain {

	public static void main(String[] args) {
		
		Number number = new Number(100);
		
		Number number2 = new Number(); // 매개 변수 없이도 호출 가능
		
		
		System.out.println(number.getNumber());
		
		//생성자는 초기화 메소드로 초기화를 목적으로 한다. 클래스의 이름이 동일, 반환 타입 x
	}

}
