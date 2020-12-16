package array;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "My String";  // 0x100
		String str2 = "My String"; //My String -> 0x100의 데이터를 참조
		String str3 = "Your String";
		String str4 = new String("My String"); // 같은 문자열이나 참조값이 다름.
		
		// 참조변수 값의 동등 비교: 같은 인스턴스를 참조한다.
		if(str1==str2) {
			System.out.println("같은 인스턴스를 참조합니다.");
		} else {
			System.out.println("다른 인스턴스를 참조합니다.");
		}
		
		if(str1==str3) {
			System.out.println("같은 인스턴스를 참조합니다.");
		} else {
			System.out.println("다른 인스턴스를 참조합니다.");
		}
		
		if(str1==str4) {
			System.out.println("같은 인스턴스를 참조합니다.");
		} else {
			System.out.println("다른 인스턴스를 참조합니다.");
		}
		
		System.out.println(str1.equals(str4));
		
		
		
	}

}
