package array;

public class ArrayCopyTest {

	public static void main(String[] args) {
		
		// 사용할 원본 배열 생성
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] number =  {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		System.out.println(abc);
		System.out.println(new String(number));
		
		// abc 배열과 number 배열을 연결해서 사용할 배열 생성
		char[] result = new char[abc.length+number.length]; // => 14개
		
		// Array Copy
		System.out.println("-----Array Copy-----");
		System.arraycopy(abc, 0, result, 0, abc.length);		
		System.out.println(result);
		System.arraycopy(number, 0, result, abc.length, number.length);
		System.out.println("-----number 추가------");
		System.out.println(result);
		
		// abc를 number에 0인덱스 부터 복사
		System.out.println("-----abc -> number-----");
		System.arraycopy(abc, 0, number, 0, abc.length);
		System.out.println("nuber : " + new String(number)); // char -> String
		
		// number의 인덱스 6 부터 (abc의 인덱스 0 부터 3개)를 복사
		
		System.out.println("-----number의 인덱스 6 부터 (abc의 인덱스 0 부터 3개)-----");
		System.arraycopy(abc, 0, number, 6, 3);
		System.out.println("nuber : " + new String(number)); // char -> String
		
		
		
		
		
		
		
	}

}
