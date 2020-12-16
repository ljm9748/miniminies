package animal;

public class Cat extends Animal {

	// 생성자 생성
	public Cat() {
		this.kind = "포유류";
	}

	// 메소드
	@Override
	public void sound() {
		System.out.println("야옹");

	}

}
