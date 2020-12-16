package randomclass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Random: 무작위 <-> Pattern
		 	
		 	1 2 3 
		 	1 ~ 100 -> 
		 	
		 	
		 
		 */
		
		// 0 ~ 9
		
		int r;
		
		r = (int)(Math.random()*3);
		// Math.random -> double 형이라 int형으로 강제변환이 필요함
		System.out.println("r = " + r);

		double d = Math.random();
		System.out.println("d = " + d);
		
		r = (int)(Math.random()*10); // ->0 ~ 9까지
		System.out.println("r = " + r);

		// 1~10
		
		r = (int)(Math.random()*10)+1;
		System.out.println("r = " + r);
		
		//10 20 30 40 50 
		int r1;
		r1 = ((int)(Math.random()*5)+1)*10; // -> 5개는 무조건 *5 -> 0~4
		System.out.println("r1 = " + r1);
		
		// -1 0 1
		int r2;
		r2 = (int)(Math.random()*3)-1;
		System.out.println("r2 = " + r2);
	}
	

}
