package generic;

public class OrangeBox {

	// 변수 선언
	Orange orange;
	
	// 생성자
	public void store(Orange orange) {
		this.orange = orange;		
	}
	
	// 메소드
	public Orange pullOut() {
		return orange;
	}
	
	
}
