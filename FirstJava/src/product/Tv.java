package product;

public class Tv extends Product {// Product에 생성자가 들어 가 있지만 super가

	public Tv(int price) {
		super(price);
		
		// System.out.println(참조값); //  모든 클래스의 조상은 Object
		// 참조값.toString()
	}

	@Override
	public String toString() {
		return "Tv [" + price + "]"; // []안에는 변수가 들어감
	}

	/*
	 * @Override public String toString() {
	 * 
	 * return "TV"; }
	 */
	
	

	
}
