package work;

import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String _name = scan.next();
		
		System.out.print("나이: ");
		int _age = scan.nextInt();
		
		System.out.print("성별(남-false, 여-true): ");
		boolean _woman = scan.nextBoolean();
		
		System.out.print("전화번호: ");
		String _phone = scan.next();
		
		System.out.print("키: ");
		double _height = scan.nextDouble();
		
		System.out.print("주소: ");
		String _address = scan.next();
		
		System.out.println(_name+" "+ _age +" "+ _woman + " " + _phone + " " + _height + " " + _address);
		
	}

}
