package animal;

public abstract class Animal {
	
	// 변수 생성
	public String kind;		// 동물의 종류
	
	// 메소드 생성
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 생성
	public abstract void sound();

}
