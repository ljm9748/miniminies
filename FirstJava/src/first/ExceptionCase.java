package first;

public class ExceptionCase {

	public static void main(String[] args) {
		
		
		// 배열 관련
		try {
		int[] arr = new int[3];		// index -> 0~2  // arr은 지역변수
		arr[10] = 20; 		// ArrayIndexOutOfBoundsException
		
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
		int[] arr = new int[-10];	// NegativeArraySizeException
		
		} catch(NegativeArraySizeException e){
			System.out.println(e.getMessage());
		}
		
		// 캐스팅 변환 관련
		
		try {
		Object obj = new int[10]; 		// ClassCastException
		String str = (String)obj;
		} catch(ClassCastException e) {
			System.out.println(e.getMessage());			
		}
		
		// nullPointer
		try {
		String str = null;		// NullPointerException
		int len = str.length();
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("메소드가 종료됩니다.");
	}

}
