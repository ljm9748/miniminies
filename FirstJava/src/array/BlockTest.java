package array;

public class BlockTest {
	
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1; // 1 ~ 10사이의 정수			
		}
		System.out.println("배열의 요소 초기화 작업 완료");
	}
	
	// 클래스 초기화 블록: 코드가 로드될 때 블록의 코드가 실행
	
	static {
		System.out.println("static { 123 }");
	}
	
	// 인스턴스 초기화 블록(초기화 블록): 인스턴스가 생성될 때 블록의 코드가 실행 - 생성자보다 우선한다.(빨리 실행된다.)
	{
			System.out.println("{ }");	
	}
	
	// 생성자
	BlockTest(){
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest 인스턴스 생성");
		BlockTest bt1 = new BlockTest();
		
		System.out.println("BlockTest 인스턴스 생성2");
		BlockTest bt2 = new BlockTest();
		
		for(int i=0; i<arr.length; i++) { // 배열의 index는 0부터 시작 하기 때문에 i도 0부터 시작
			System.out.println("arr["+ i + "]:" + arr[i]);
		}
		
	}

}
