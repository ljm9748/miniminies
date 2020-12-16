package work;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("x = ");
		x = scan.nextInt();
		System.out.print("y = ");
		y = scan.nextInt();
		
		int temp; // buffer(저장공간) temp -> template(형태)
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("출력: ");
		System.out.println("x = " + x + ", y = " + y);
		
		scan.close();

	}

}
