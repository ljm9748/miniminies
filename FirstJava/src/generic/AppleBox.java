package generic;

public class AppleBox {

	// 변수 선언
	Apple apple;
	
	
	public void store(Apple apple) {
		this.apple = apple;
	}
	
	// 반환
	public Apple pullOut() {
		return apple;
	}
	
}
