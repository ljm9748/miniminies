package exam;

public class Square1 {

	// 변수: 사각형의 밑변, 사각형의 높이
	int width;		// 사각형의 밑변
	int height;		// 사각형의 높이
	
	// 메소드: 1. 사각형의 변수(밑변과 높이)를 변경할 수 있는 메소드, 2. 사각형의 넓이를 구하고 반환하는 메소드를 구해라
	// 1. 사각형의 변수(밑변과 높이)를 변경할 수 있는 메소드 -> return 값이 없음
	void setData(int w, int h) {
		width = w;
		height = h;
	}
	// 2. 사각형의 넓이를 구하고 반환하는 메소드를 구해라
	int area() {
		int result = 0; // return 값을 가지는 변수? 는 무조건 초기화를 해야 한다.
		result = width*height;
		return result;
	}
	
	// 실행 블록
	public static void main(String[] args) {
		// 인스턴스 생성 -> width, height 변수 생성, setData, area 메소드 생성
		Square1 s = new Square1(); 
		// 변수 값 설정
		s.setData(10, 10);
		// 넓이를 구하고 값을 출력
		int result = 0;
		result = s.area();
		System.out.println("사각형의 넓이는 " + result + "이다.");
	}
}
