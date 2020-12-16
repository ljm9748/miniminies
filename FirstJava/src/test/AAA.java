package test;

public class AAA {
	
	// public AAA(){} -> 인스턴스 생성으로 인해 자동으로 생성자가 생성됨

	int num;
	
	public static int n = 100; // public이 붙으면 다른 패키지에서 .n으로 사용 가능
	
	// 인스턴스 변수 - 내부에서는 생성자 호출 가능
	// static이 붙으면 참조변수(static AAA)를 하나 만들고 인스턴스를 실행
	//static AAA a = new AAA();
	
	AAA(){ // public이 없으면 다른 패키지에서 사용이 제한됨
		// 내부에서만 사용가능
	}
	
	// setter 메소드 - 값을 설정
	public void setNum(int num) {
		this.num = num;
		
	}
	
	// getter 메소드 - 값을 반환(값을 읽어옴)
	public int getNum() {
		return num;
	}
}
