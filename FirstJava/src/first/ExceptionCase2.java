package first;

public class ExceptionCase2 {

	public static void main(String[] args) {
		
		
		// 배열 관련
		try {
		int[] arr = new int[3];			// index -> 0~2  // arr은 지역변수		
		arr[10] = 20; 					// ArrayIndexOutOfBoundsException
		
		arr = new int[-10];				// NegativeArraySizeException
		
		Object obj = new int[10]; 		// ClassCastException
		String str = (String)obj;
		
		str = null;
		int let = str.length();			// NullPointerException
		}  catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());		
		} catch(NegativeArraySizeException e){
			System.out.println(e.getMessage());
		} catch(ClassCastException e) {
			System.out.println(e.getMessage());			
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("메소드가 종료됩니다.");
	}

}
