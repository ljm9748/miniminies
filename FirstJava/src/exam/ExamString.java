package exam;

public class ExamString {

	public static void main(String[] args) {
//		문제01		
		/* 	다음 형태로 String 인스턴스를 생성.
		 	String str = “ABCDEFGHIJKLMN”;
		 	그리고 이 문자열을 역순으로 다시 출력하는 프로그램을 작성.*/
		
		String str = "ABCDEFGHIJKLMN";
		int numOfStr = str.length();
		int index = numOfStr-1;			// 배열이나 문자열의 위치 index는 0~n-1
		
		String result = "";
		StringBuffer sb = new StringBuffer();
		
		// String 클래스의 charAt() 메서드를 이용해서 역순으로 출력
		for(int i=index; i>=0; i--) {
		//	result += str.charAt(i);		// result = result + String; -> String
			sb.append(str.charAt(i));		// 인스턴스를 만드는 연산을 하지 않음. 메모리 생성 소멸 과정이 사라짐
		}									
		
		System.out.println(str);
		//System.out.println(result);
		System.out.println(new String(sb));
		
		System.out.println("----------");
		
		// StringBuffer 클래스 이용
		sb = new StringBuffer(str); //.reverse();		// StringBuffer 안에 "ABCDEFGHIJKLMN"이 저장된다.
		System.out.println(new String(sb));
				
		sb = sb.reverse();				//
		
		System.out.println(new String(sb));
		
		
//		문제02
		 /*	문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
		 	String str = “990929-1010123”
		 	이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성. */
		System.out.println("-----문제02-----");
		
		str = "990929-1010123";	// - 을 빼자
		sb  = new StringBuffer();	// 16개 문자를 저장할 수 있는 공간을 만든다.
		
		System.out.println(str);
		
		// String charAt() 이용
		for(int i=0; i<str.length(); i++) {
			// '-'를 찾아 아닌 경우 or '0'~'9'를 찾는 경우 => 문자열을 추가
			char c = str.charAt(i);
			if(c>='0' && c<='9') {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
		
		System.out.println("-----(2)-----");
		
		// String replace() 메소드 - 인스턴스 메소드
		result = str.replace("-", "");
 
		System.out.println(result);
	}	

}
