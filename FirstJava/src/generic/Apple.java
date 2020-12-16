package generic;

public class Apple {
	
	// 변수 선언
	private int weight;	// 사과의 무게
	
	// 생성자
	Apple(int weight){
		this.weight = weight;
	}
	
	// 메소드
	public void showWeight() {
		System.out.println("사과의 무게 >> "  + weight);
	}

}
