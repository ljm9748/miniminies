package first;

public class AgeInputException extends Exception {
	
	private int age;	
		
	// 생성자 -> 초기화
	public AgeInputException(int age) {
		super("유효하지 않은 나이가 입력되었습니다.");		//	exceptino클래스가 string을 가지고 있는...
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeInputException [age=" + age + ", getMessage()=" + getMessage() + "]";
	}
	
	
	

}
