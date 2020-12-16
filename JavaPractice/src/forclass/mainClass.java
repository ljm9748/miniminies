package forclass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 		순환문: loop문
		 		조건이 만족하면 반복실행되는 제어문
		 		
		 		for문, foreach문
		 		
		 		for if array list -> 많이 섞어씀.
		 		
		 		형식:
		 		for(변수 선언/초기화(1); 조건문(조건식(2)(5)(8)(11)); 연산식(increment++)(4)(7)(10) ){
		 			 loop 처리(3)(6)(9)
		 		}
		 		(12) -> 3번 순환 후 종료
		 		//foreach
		 		for(변수선언: 배열 또는 목록(리스트){
		 			처리
		 		}
		 */
		
		int n;
		
		for(n = 5; n< 5; n++) {
			System.out.println("forloop");
		}
		System.out.println("n = " + n); // ->n의 수치가 조건에 맞지 않아 빠져나옴.
		System.out.println();
		for(int i = 0; i<10; i++) {
			System.out.println("i = " + i);
			
		}
		System.out.println();
		for(int i=0; i<10; i = i+1) {
			System.out.println("i = " + i);
		}
		System.out.println();
		for(int i=0; i<10; i = i+2) {
			System.out.println("i = " + i);
		}
		System.out.println();
		for(int i=1; i<=100; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println();
		///////////////////////////////////////////
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			
		}
		System.out.println("sum: " + sum);
		
		System.out.println();
		for(int i = 10; i>0; i--) {
			System.out.println("i = " + i);
		}
		
		System.out.println();
		
		int array[]= {12, 34, -23, 45, -37, 67, 89};
		
		//배열의 길이
		System.out.println("array.length: " + array.length); // => 출력값: array.length: 5
		
		System.out.println();
		sum = 0;
//		sum = array[0] + array[1] + array[2] + array[3] + array[4];
		
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
			
		}
		System.out.println("sum: " + sum);
		System.out.println();
		//음수 값을 포함 시키지 마라
		for(int i=0; i<array.length; i++) {
			if(array[i]>0) {
				sum = sum + array[i];
				
			}
			
		} System.out.println("sum: " + sum);
		
		System.out.println();
		//foreach value값만 나온다.
		for(int num:array) { // num = [0] -> num1=[1]
			
			System.out.println("num: " + num);
		} 
		
		
		
		
		
		
		
		
	}

}
