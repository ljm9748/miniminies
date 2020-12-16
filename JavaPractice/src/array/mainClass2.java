package array;

public class mainClass2 {

	public static void main(String[] args) {
		/*
			Array: 배열 == 변수들(variables)
			정의: 같은 자료형 변수들의 묶음.
		 	목적: 같은 목적의 다수의 변수를 관리하기 위해
			접근 요소: 번호(인덱스_index)
			형식:자료형 선언 배열 변수명[] = new 자료형[배열의 총 수];
				자료형 선언  []배열 변수명 = new 자료형[배열의 총 수];
				자료형 선언[] 배열 변수명 = new 자료형[배열의 총 수];
				
				int arrVar[] = new int[5];
				char []arrChar = new char[10];
				double[] arrDouble = new double[15];
				char *arrChar = new char[10];
				
							동적할당 - 숫자를 마음대로 넣어도 됨. 
							정적할당 - .
							
				int arrVar[] = new int[5]; 		5 -> 인덱스 넘버
				arrVar[0] = 90;
				arrVar[1] = 85;
				arrVar[2] = 100;
				arrVar[3] = 95;
				arrVar[4] = 75;
				
				arrVar[index Number] = 값;
		 
		 */
		//5명 학생의 국어 점수 총점, 평균
		int lang1, lang2, lang3, lang4, lang5;
		
		lang1 = 90;
		lang2 = 85;
		lang3 = 100;
		lang4 = 95;
		lang5 = 75;
		
		int sum = 0;
		
		sum = lang1 + lang2 + lang3 + lang4 + lang5;
		
		double avg = 0;
		
		avg = (double)sum / 5;
		
		System.out.println(sum);
		System.out.println(avg);
		
		//int arraylang[] = new int[5];
		
		
		 int arraylang[] = null; // -> null로 초기화 해야함
		 System.out.println("arraylang: " + arraylang); // -> 할당된 값이 없음.
		 
		 
		 arraylang = new int[5]; // 동적할당(참조)
		 
		
//		System.out.println("arraylang: " + arraylang); // => 출력값: arraylang: [I@15db9742 -> 메모리 주소
//		System.out.println("arraylang[0]: " + arraylang[0]); 	// => 출력값: arraylang[0]: 0 											

		arraylang[0] = 90;
		arraylang[1] = 85;
		arraylang[2] = 100;
		arraylang[3] = 95;
		arraylang[4] = 75;
		
		System.out.println("arraylang[3]: " + arraylang[3]);	// => 출력값: arraylang[3]: 95
		
		// 배열 초기화
		int arrNum[] = {90, 100, 85}; 
		int num = 10;
		
		System.out.println("arraylang[0]: " + arraylang[0]); // =>출력값: arraylang[0]: 90
		
		char arrChar[] = {'A', 'B', 'C'};
		System.out.println("arrChar[1]: " + arrChar[1]); // =>출력값: arrChar[1]: B
		
		 char arrCahr[];
		 // arrChar = {'A', 'B', 'C'}; => 불가능
		 arrChar = new char[3];
		 arrChar[0] = 'A'; // 차례대로 선언 또는 선언과 동시에 초기화해야함.
		 
		 
		 // alias(복제본? 분신?) => 중요!!!
		 int array[] = { 11, 22, 33 };
		 int alias[] = array;
		 
		 System.out.println("alias[1]: " + alias[1]); // =>출력값: alias[1]: 22
		 
		 alias[1] = 222;		 
		 System.out.println("alias[1]: " + alias[1]); // =>출력값: alias[1]: 222
		 
		 System.out.println("array[1]: " + array[1]); // =>출력값: array[1]: 222 -> array값도 alias와 같이 값이 바뀜 
		 // 원본데이터가 영향을 받음
		 
		 int Atype[] = {1, 2, 3};
		 int Btype[] = {11, 22, 33};
		 
		 int temp;
		 
		 int aliasA[] = Atype;
		 int aliasB[] = Btype;
		 int aliastemp[];
		 
		 aliastemp = aliasA; // 한번의 스왑으로 인해 데이터 전체가 바뀜
		 aliasA = aliasB;
		 aliasB = aliastemp;
		 
		 System.out.println("Atype[0]: " + Atype[0]); // =>출력값: Atype[0]: 1
		 System.out.println("Atype[1]: " + Atype[1]); // =>출력값: Atype[1]: 2
		 System.out.println("Atype[2]: " + Atype[2]); // =>출력값: Atype[2]: 3
		 
		 System.out.println("aliasA[0]: " + aliasA[0]); // =>출력값: aliasA[0]: 11
		 System.out.println("aliasA[1]: " + aliasA[1]); // =>출력값: aliasA[1]: 22
		 System.out.println("aliasA[2]: " + aliasA[2]); // =>출력값: aliasA[2]: 33
		 
		 
//		 temp = Atype[0];
//		 Atype[0] = Btype[0];
//		 Btype[0] = temp;
//		 
//		 temp = Atype[1];
//		 Atype[1] = Btype[1];
//		 Btype[1] = temp;
//		 		 
//		 temp = Atype[2];
//		 Atype[2] = Btype[2];
//		 Btype[2] = temp;
		 
		
	}
	

}
