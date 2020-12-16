package whileclass;
import java.util.Scanner; 

public class mainClass {

	public static void main(String[] args) {
		/*
		 	loop
		 		for
		 		반복문
		 		for(초기화; 조건식; 연산식){
		 			처리
		 		
		 		}
		 		
		 		while
		 		
		 		변수 선언
		 		초기화
		 		while(조건식){
		 			처리
		 			연산식
		 		}
		 
		 
		 */
		
		int w; //for문과 다르게 초기화가 밖에 나와있다.
		w = 0;
		while(w < 10) {
			System.out.println("w = " + w);
			
			w++;
			
			
		} System.out.println("w = " + w); //조건이 맞지 않아 while문을 빠져나옴.
		
		System.out.println();
		System.out.println();

		/*
		 	initialize(초기화)
		 	w = 0;
		 	
		 	loop(순환)
		 	while(논리 연산){ //논리 연산자리에 true를 넣어주면 무한 루프가 된다.
		 	
		 	}
		 	
		 	release(해방)
		 	
		 	
		 */
		
		Scanner sc = new Scanner(System.in);
		// 10명의 데이터를 입력을 받도록 한다.
		// Array: 같은 자료형 변수의 묶음.
		int arrNum[] = new int[10];		// 0 ~ 9
		System.out.println("arrNum: " + arrNum.length); // length -> 길이
		
		for(int i=0; i<10; i++) {
			System.out.print((i + 1) + "번째 수 = ");
//			arrNum[i] = sc.nextInt();
		}
		
		int numArr[] = new int[10];
		
		int w1;
		
		w1 = 0;
		
		while(w1<10) {
			System.out.print("w1: "+(w1 + 1)+ "번째 수  = ");
//			numArr[w1] = sc.nextInt();
			
			w1++;
		}
		
		/*
		 	do while
		 	
		 	변수의 초기화
		 	do{
		 		처리
		 		연산식
		 	
		 	} while(조건식);
		  	
		  
		  
		 */
		System.out.println();
		System.out.println();
		
		int dw;
		dw = 0;
		
		do {
			System.out.println("dw: " + dw);
			
			dw++;
		} while(dw < 10);
		System.out.println("dw: " + dw);
		
		System.out.println();
		System.out.println();
		
		/*
		 	break문: 탈출(loop)
		 	
		 	switch(변수){
		 		case 값: 
		 			처리
		 			break;
		 		case 값2:
		 			처리
		 			break;
		 	}
		 	
		 	for(int i=0; i<10; i++){
		 		처리
		 		탈출 - break;-> 단독적으로 사용 못함.
		 	}
		 	
		 	while(){
		 		break;
		 	}
		 */
		
		for(int i=0; i<100; i++) {
			System.out.println("i = " + i);
			if(i == 23) {
				break;
			}
		}
		
		w = 0;
		
		while(w<100) {
			System.out.println("w = " + w);
			if(w == 56) {
				break;
			}
			w++;
		}
		
		int numArr1[] = {2, 9, 3, -4, 12 };
		
		for(int i=0; i<numArr1.length; i++) {
			int number = numArr1[i];
			System.out.println("numArr1[" + i + "] = " + numArr1[i]);
			if(number<0) {
				break;
			}
		}
		
		//이중 for문
		for(int i=0; i<10; i++) {
			System.out.println("i = "  + i);
			
			for(int j=0; j<5; j++) {
				System.out.println("\tj = " + j);
				if(i == 5 && j == 3) {
					break; //break 하나당 for문 하나만 탈출 가능
				}
				
			}
			
		}
		
		//1. 탈출방법
		
		boolean b = false;
		
		for(int i=0; i<10; i++) {
			System.out.println("i = "  + i);
			
			for(int j=0; j<5; j++) {
				System.out.println("\tj = " + j);
				if(i == 5 && j == 3) {
					b = true; 
				}
				
				if(b == true) {
					break;
				}
			}				
			if(b == true) {
				break;
			}			
		}
		
		//2. 탈출방법
		outside: for(int i=0; i<10; i++) {
			System.out.println("i = "  + i);
			
			for(int j=0; j<5; j++) {
				System.out.println("\tj = " + j);
				if(i == 3 && j == 2) {
					break outside;  //예약어만 피하면 아무 단어나 가능
				}
				
			}
			
		}
		
		/*
		 	continue: 생략(skip)
		 	
		 	단독으로 사용 불가 loop문과 함께 사용해야 함.
		 	
		 	while(){
		 		처리1
		 		처리2
		 		처리3
		 		if(조건식){
		 			continue;
		 		}
		 		처리4
		 		
		 		연산식
		 		
		 		
		 	}
		 	
		 	
		 */
		
		for(int i=0; i<10; i++) {
			System.out.println("for start");
			
			System.out.println("i = " + i);
			
			if(i > 4) {
				continue; //4보다 커진 후 부터는 아래 내용이 스킵되었음
			}
			
			System.out.println("for end");
			
		}
		
		w = 0;
		while(w<10) {
			System.out.println("while start");
			System.out.println("w = " + w);
			w++; // continue문 다음 부터 스킵이 되기 때문에 continue문 앞에 있으면 무한로프 x
			if(w>4) { // w가 5인 상태로 무한로프 돌음.
				continue;
				
				
			}
			
			System.out.println("while end");
			
		}
		
		
		
		
		
		
		
	}	

}
