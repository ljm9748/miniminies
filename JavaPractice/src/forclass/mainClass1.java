package forclass;

public class mainClass1 {

	public static void main(String[] args) {
		// 2중 for문
		/*
		 	for(초기화(1); 조건식(2)(5)(8)(11); 연산식(4)(7)(10)){
		 		처리(3)(6)(9)
		 	}
		 	(12)
		 	
		 	for(초기화(1); 조건식(2)(15); 연산식(14)){
		 		for(초기화(3)(16); 조건식(4)(7)(10)(13); 연산식(6)(9)(12)){
		 			처리(5)(8)(11)
		 		}
		 		
		 	}
		 	
		 	for(int i=0; i<5; i++){			i = 0 	i =	1 	i =	2 		3 		4
		 	
		 		for(int j=0; j<3; j++){		0 1 2	0 1 2	0 1 2	0 1 2	0 1 2
		 			처리
		 		}
		 	}
		 	
		 	//i가 0일때 j는 0,1,2까지 돌아감
		 
		 
		 */
		int count = 0;
		for(int i=0; i<5; i++) { //세로 표현이 많음
			System.out.println("i = " + i);
			for(int j=0; j<3; j++) { // 가로 표현이 많음.
				count++;
				
				System.out.println("\tj: " + j);
			}
		}
		System.out.println("count: " + count);
		
		
		System.out.println("================================");
		
		for(int i=0; i<9; i++) { //9개의 줄 생성
			
			for(int j=0; j<5; j++) { // 줄마다 5번씩 * 반복 실행
				System.out.print("*");
//				if(i == 4 ){
//					System.out.println();
//				}
				
			}
			System.out.println(" "); // 줄바꿈
		}
		
		System.out.println();
		System.out.println();
		
		int n = 0;
		for(int i=0; i<9; i++) { 
			
			if(i<5) n++;
			else 	n--;
			
			for(int j=0; j<n; j++) { 
				System.out.print("*");
			
			}
			System.out.println(" "); 
		}
		
		System.out.println();
		System.out.println();
		
		int arrNum[] = {3, 1, 4, 2, 5, 3, 1};
		
		for(int i=0; i<7; i++) {
			for (int j=0; j<arrNum[i]; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
