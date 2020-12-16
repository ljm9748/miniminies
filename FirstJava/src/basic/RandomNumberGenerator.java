package basic;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		
		 

		// 로또 
		for(int i=0; i<6; i++) {
			System.out.print(r.nextInt(45)+1+"\t"); 	// (0 ~ 44)+1 => (0 ~ 45)
		}
		
		System.out.println();
		
		Random r2 = new Random(10);
		for(int i=0; i<6; i++) {
			System.out.print(r2.nextInt(45)+1+"\t"); 	// (0 ~ 44)+1 => (0 ~ 45)
		}
		
		System.out.println();
		
		System.out.println(System.currentTimeMillis());
		System.out.println("System.nanoTime() >> "+System.nanoTime()); // 시스템이 가지고 있는 
		Random r3 = new Random(System.currentTimeMillis());
		for(int i=0; i<6; i++) {
			System.out.print(r3.nextInt(45)+1+"\t"); 	// (0 ~ 44)+1 => (0 ~ 45)
		}
		
		
		
		
	}

}
