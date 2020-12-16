package scanner;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		// 입력 - console(명령 프롬프트)
		
		Scanner scan = new Scanner(System.in); // 입력을 받기 위한 절차
		
		//boolean
		/*boolean b; // true or false
		
		System.out.print("b = ");
		b = scan.nextBoolean();
		
		System.out.println("b = "+b);
		*/
		
		
		// int
		
		/*int i;
		System.out.print("i = " ); 
		i = scan.nextInt();
		System.out.println("i: " + i);
		*/
		
		
		// double 
		
		/*
		double d;
		System.out.print("d = ");
		d = scan.nextDouble();
		System.out.println("d = " + d);
		*/
		
		
		// Stirng
		String str;
		/*System.out.print("str = ");
		str = scan.next();
		System.out.println("str = " + str);*/
		
		/*System.out.print("str = ");
		str = scan.nextLine(); //엔터 값이 여기로 옴. 개행을 안하고 넘어감. enter값을 무시
		System.out.println("str = " + str);*/
		
		System.out.print("str = ");
		str = scan.next(); //엔터 값이 여기로 옴. 개행을 안하고 넘어감.
		System.out.println("str = " + str); 
	
		
		//scan.close();
		
		/* 
		 
		 	머리말 	initialize(초기화) - 메모리 초기화
		 	
		 	중심글	loop(순환) - main
		 	
		 	마무리	release(해방)	 - 메모리 해방 -> 메모리 해방을 안해주면 메모리가 쌓여 유수현상이 나타남. 계속해서 누적되면 down됨.
		 */
		
	}

}
