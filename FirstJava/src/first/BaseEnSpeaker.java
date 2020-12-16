package first;

public class BaseEnSpeaker extends Speaker {
	
	private int baseRate;
	
	public void setBaseRate(int base) {
		baseRate = base;
	}
	
	// 오버라이딩
	// -> 상속관계에서 상속받은 메소드를 선언부는 동일하게 하고 처리부를 재구성하는 것
	
	@Override	
	// 어노테이션: 자바의 문법은 맞으나 키워드, 주석은 아니다. 추가적인 의미를 부여한다.
	void showCurrentState() {
		super.showCurrentState(); // super를 사용해서 메소드를 호출
		System.out.println("base size >> " + baseRate);
	}
	
	
	
	

}
