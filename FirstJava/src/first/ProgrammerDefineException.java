package first;

import java.util.Scanner;

public class ProgrammerDefineException {

	public static void main(String[] args) throws AgeInputException {
		
		 System.out.println("나이를 입력하세요.");
		 
		 
//		 try {
			 int age = readAge(); // 같은 static이라 호출 가능
			 System.out.println("나이는 " + age + "입니다.");
//		 } catch(AgeInputException e) {
//			 System.out.println(e); 		// e.toString()
//			 System.out.println(e.getMessage());
//			 e.printStackTrace();
//		 }
		 
		 System.out.println("프로그램을 종료합니다.");

	}
	
	public static int readAge() throws AgeInputException { // throws -> 예외는 하나지만 여러 개를 던질 수 있다.
		// throws AgeInputException
		// readAge() 메소드 내에서 발생하는 예외 중에 
		// AgeInputException 타입의 예외가 발생하면
		// readAge() 메소드를 호출한 쪽으로 예외 참조값을 전달하겠다.
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		// 논리적인 오류 예외 발생 
		if(age<0) {
			AgeInputException ae = new AgeInputException(age);
			throw ae;
		}
		
		return age;
	}

}





