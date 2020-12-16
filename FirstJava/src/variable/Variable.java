package variable;

public class Variable {

	public static void main(String[] args) {
		String regNo = "971111-2222222";
	
		System.out.println();
		
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
//		System.out.println(true + null);
		
		System.out.println();
//		문제 9
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		b = (byte)i;
		ch = (char)b;
		short s = (short)ch;
		float f = l;
		i = ch;
		
		System.out.println();
//		문제 11
//		byte c = 256;
//		char c = "";
		char answer = 'n';
		f = 3.14f;
		double d = 1.4e3f;
		
		

	}

}
