package switchclass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	switch: 값이 명확해야 한다. (case 분기)
		 			범위를 지정할 수 없다. < > <= >= 사용불가
		 			부정확한 값은 사용할 수 없다.
		 			실수도 사용할 수 없다.
		 			
		 	형식
		 	switch(변수){
		 		case 값1:
		 			처리1
		 			break; (빠져나간다.)
		 		case 값2:
		 			처리2
		 			break;
		 		case 값3:
		 			처리3
		 			break;
		 		default: (break x / else와 동일하다.)
		 			
		 		
		 	}
		 	//가독성이 좋고 처리 속도가 빠르다.
		 	
		 	
		 */
		
		int number = 1;
		
		switch(number) {
			case 0: // if(number == 0)
				System.out.println("number가 0인 경우");
				break;
			case 1: // else if(number == 1)
				System.out.println("number가 1인 경우"); // =>출력값: number가 1인 경우
				break;
			case 2:
				System.out.println("number가 2인 경우");
				break;	
			case 3:
				System.out.println("number가 3인 경우"); 
				break;
				
//			case 4 > number -> 범위 사용 불가	
			default: 
				System.out.println("number = ?");
		}
		
		char c = 'A';
		
		switch(c) {
			case 'A':
				System.out.println("c == 'A'"); // => 출력값: c == 'A'
				break;
			case 'B':
				break;
		}
		
//		double d = 123.4; -> double은 switch문 불가능
//		switch(d) {
//			case0:
//				break;
//		
//		}
		
		String str = "hello";
		
		switch(str) {
			case "hello":
				System.out.println("str = hello"); // => 출력값: hello
				break;
				
		}
		

	}

}
