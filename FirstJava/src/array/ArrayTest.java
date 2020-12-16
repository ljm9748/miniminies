package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열의 선언: 자료형[] 배열이름
		// 정수형 배열을 선언
		
		int[] arr = null; // null로 초기화

		
		// 배열의 생성: 변수들의 저장공간을 생성
		// new 자료형[개수]; -> 개수만큼 연속된 변수를 생성하고 묶음으로 만든다.
		arr = new int[3];
		
		// 배열의 참조: 입력(대입), 읽기(참조)
		// 배열이름[index]: 배열의 변수는 순차저으로 위치하기 때문에 index값으로 참조
		// index: 0 ~ 요소의 개수-1 까지의 index를 가진다.
		// 요소의 개수: 배열이름.length 인스턴스 변수에 저장된다.
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println("배열 arr의 요소의 개수: " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " +arr[i]);			
		}
		
		//int sum = arr[0] + arr[2] + arr[2];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("arr 배열 요소들의 합: " + sum);
		
		
		// 생성과 동시에 배열 요소의 초기화
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println("배열 arr2의 요소의 개수: " + arr2.length);
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] = "+arr2[i]);
		}
		
		int[] arr3 = null;
		arr3 = arr2;
		arr3 = arr;
		
//		예제2
		int[] arr4 = {1, 2, 3, 4, 5}; // 원본 데이터, 주소값: 0x100
		int[] ref;
		ref = addAllArray(arr4, 7); // addAllArray(0x100, 7) => 0x100, ref = 0x100
		if(arr4==ref) {
			System.out.println("같은 배열 참조");
		} else {
			System.out.println("다른 배열 참조");
		}
		
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4[" + i + "] = "+arr4[i]);
		}
		System.out.println("------------------------------");
		for(int i=0; i<ref.length; i++) {
			System.out.println("ref[" + i + "] = "+ref[i]);
		}
		
		// 로또 번호 추출 프로그램
		// 정수데이터 1~45까지 숫자를 저장하는 변수 45개 생성 -> int타입의 배열 선언, 생성
		System.out.println("-----로또-----");
		int[] ball = new int[45];
		
		// 각 변수의 1~45까지의 숫자를 중복되지 않게 저장
		for(int i=0; i<ball.length; i++) { // i(0~44) -> index로 사용
			ball[i] = i+1; // 0~44 +1 => 1-45
		}
		//for(int i=0; i<ball.length; i++) {
		//	System.out.println("ball["+i+"]: " + ball[i]);
		//}
		
		// 각 인덱스의 값들을 섞는 처리 index=0의 값과 임의의(1-44) 인덱스의 값을 서로 바꾼다.
		int j = 0; // 임의의 인덱스 번호
		int temp = 0;	// 각 변수의 값을 바꾸기 위한 임시변수
		
		for(int i=0; i<100; i++) {
			// 임의의 index를 구한다 -> 1~44
			j = (int)(Math.random()*44)+1; 
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		System.out.println("6개 번호 추출 ---------------");
		
		// 배열에서 0~5까지의 변수 값을 출력
		for(int i=0; i<6; i++) {
			System.out.print(ball[i] + "\t");
		}
		
		
		
	}
	
	// int타입의 배열을 받고, 증가시킬 정수값을 받아서
	// 각 배열의 요소에 받은 정수값만큼 증가시키고 
	// 전달받은 배열을 반환
	static int[] addAllArray(int[] ar, int addValue) { 
		// int[] ar = 0x100, int addValue = 7
		for(int i=0; i<ar.length; i++) {
			ar[i] = ar[i] + addValue;
		}
		
		return ar; // 0x100을 가지고 있음 주소값을 반환 -> ref = addAllArray(arr4, 7);로 반환
	}
	
	// 
	

}
