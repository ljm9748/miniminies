package basic;

public class Wrapper2 {
	public static void main(String[] args) {
		
		// Wrapper = Integer
		Integer iValue = 10;	// AUTO BOXING -> 자동으로 wrapper객체로 만들어줌
		// 1. Integer iValue = new Integer(10);
		// 2. Integer iValue = Integer.valueOf(10); 
		
		Double dValue = 3.14;
		// Double dValue = new Double(3.14);
		// Double dValue = Double.valueOf(3.14);
		Double dVal = Double.valueOf(3.14);
		
		System.out.println("iValue >> "+iValue);		// iValue.toString()
		System.out.println("dValue >> " + dValue);		// dValue.toString()
		
		int num1 = iValue;		// Integer -> int AUTO UNBOXING
		double num2 = dValue;
		
		System.out.println("num1 >> " + num1);
		System.out.println("num2 >> " + num2);
	}

}
