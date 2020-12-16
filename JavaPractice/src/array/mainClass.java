package array;
public class mainClass {
	
	public static void main(String[] args) {
		
//		 1~ 100 사이에 있는 숫자 중 짝수들의 합, 홀수들의 합을 구하라.
		
		int sum1, sum2;
		sum1 = 0;
		sum2 = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
				
			}
		} 
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		
		
		
//		character array에서 'A'를 찾아서 'a'로 변경하고 출력하라.
		char arrch[] = {'D', 'W', 'O', 'A', 'B'};
//		
//		for(int i=0; i<arrch.length; i++) {
//			//System.out.println("arrch = " + arrch[i]);
//			if(arrch[i] == 'A') {
//				arrch[i] = 'a';
//			}
//		} 
//		foreach문
//		int index = 0;
//		for(char c:arrch) { //배열 변수가 하나씩 c에 대입됨.
//			if(c=='A') {
//				arrch[index] = 'a';
//				
//			}
//			index++;
//		}
//		
//		
//		for(int i=0; i<arrch.length; i++) {
//			System.out.print(arrch[i]);
//		}
		
		// A = 65 a = 97 	차이 -> 32
//		전부다 소문자로 변환
		System.out.println("asc = " + (int)arrch[0]); // 문자 -> ASCII코드
		
		int asc = (int)arrch[0]; // 문자 -> ASCII코드 변환
		asc = asc + 32; // 수치로 대문자 -> 소문자로 변환
		char ch = (char)asc; // ASCII 코드 -> 문자
		System.out.println("ch= " + ch);
		
		for(int i=0; i<arrch.length; i++) {
			char c = arrch[i];
			int as = (int)c;
			as = as + 32;
			arrch[i] = (char)as;
		}
		
		for(int i=0; i<arrch.length; i++) {
			System.out.print(arrch[i]);
		}
		
		
		
		
		
	}		
}		