package work;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		System.out.print(">>name " );
		name = scan.nextLine();
		
		int age;
		System.out.print(">>age ");
		age = scan.nextInt();
		
		boolean woman;
		System.out.print(">>woman ");
		woman = scan.nextBoolean();
		
		String phone;
		System.out.print(">>phone ");
		phone = scan.next();
		
		double height;
		System.out.print(">>height ");
		height = scan.nextDouble();
		
		String address;
		System.out.print(">>address " );
		address = scan.next();
		
		System.out.println();
		System.out.println(">>name " + name);
		System.out.println(">>age " + age);
		System.out.println(">>woman " + woman);
		System.out.println(">>phone " + phone);
		System.out.println(">>height " + height);
		System.out.println(">>address" + address);
		
		scan.close();
		
		
	}

}
