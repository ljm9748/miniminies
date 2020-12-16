package findnumber;
import java.util.Scanner;

public class mainClass2 {

	public static void main(String[] args) {
		
		/*
		 	숫자 찾기 게임
		 	
		 	random number를 하나 뽑는데
		 	범위: 1 - 100 -> number ex) 71
		 	
		 	-> 10번의 기회를 줌
		 	
		 	user input을 받음.: 50
		 	-> 너무 작습니다.
		 	use input: 75
		 	-> 너무 큽니다.
		 	use input: 65
		 	-> 너무 작습니다.
		 	use input: 70
		 	-> 너무 작습니다.
		 	use input: 71
		 	-> 정답입니다.
		 	
		 
		 
		 
		 */
		
		// 1.변수의 선언
		
		// 2.랜덤 수의 산출(1~100)
		
		//------------------- (10번의 기회를 주기 위해서 루프가 돌아야함)
		// 3. use의 입력		   맞추면 루프 탈출	
		
		// 4. 판정(크다, 작다)
		//-------------------
		
		Object system;
		// 5. 결과 출력
		Scanner sc = new Scanner(System.in);
		int i;
		
		i = (int)(Math.random()*100)+1;
		
		
		int j;
		
		for(int r=1; r<=10; r++) {
			j = sc.nextInt();
			if(i>j) {
				System.out.println(j + "보다 큽니다.");
			} else if(i<j){
				System.out.println(j + "보다 작습니다");
			
			} else if(i == j) {
				System.out.println("정답입니다.");
				break;
			}	
		}
		
		System.out.println("정답은: " + i);
			
 		
		
		

	}

}
