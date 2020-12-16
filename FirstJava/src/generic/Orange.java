package generic;

public class Orange {
	
	// 변수 선언
	private int sugarContent; 	// 당분 함량
	
	// 생성자
	Orange(int sugarContent){
		this.sugarContent = sugarContent;		
	}
	
	// 메소드
	public void showSugarContent() {
		System.out.println("오렌지의 당도 >> " + sugarContent);
	}
	
}
