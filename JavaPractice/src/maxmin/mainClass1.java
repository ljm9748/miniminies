package maxmin;

public class mainClass1 {

	public static void main(String[] args) {
//	1. 두 수의 차 구하기 - 큰 수에서 작은 수

		int NumArr[] = {12, 21};
		
		int max; 
		int min;
		
		max = NumArr[0];
		min = NumArr[0];
		
		//최대값
		for(int i=0; i<NumArr.length; i++) {
			int num = NumArr[i]; // num에 배열 데이터를 넣음
			if(max < num) {
				max = num; 
			}
		}
		System.out.println("max: " + max);
		
		//최소값
		for(int i=0; i<NumArr.length; i++) {
			int num = NumArr[i]; // num에 배열 데이터를 넣음
			if(min > NumArr[i]) {
				min = NumArr[i]; 
			}
		}
		
		System.out.println("min: " + min);
		
		int Minus;
		Minus = max - min;
		System.out.println("두 수의 차: " + Minus);
		
		
		System.out.println();
		System.out.println();
//		2. 짝수와 홀수 판별하기
		
		int Num[] = {11, 22, 33, 44, 55};
		
		int JNum;
		int HNum;
		
		JNum = 0;
		HNum = 0;
		
		for(int i=0; i<Num.length; i++) {
			if(Num[i]%2==1) {
				HNum = Num[i];
				System.out.println( HNum+ "- 홀수");
			} else {
				JNum = Num[i];
				System.out.println(JNum+ "- 짝수");
			} 
		} 
		
		
		System.out.println();
		System.out.println();
//		3. 두 수중 큰 수 찾기
		
		int MaxMin[] = {13, 38};
		
		int max1; 
		int min1;
		
		max1 = MaxMin[0];
		min1 = MaxMin[0];
		
		//최대값
		for(int i=0; i<MaxMin.length; i++) {
			int num = MaxMin[i]; // num에 배열 데이터를 넣음
			if(max1 < num) {
				max1 = num; 
			}
		}
		System.out.println("max1: " + max1);
		
		//최소값
		for(int i=0; i<MaxMin.length; i++) {
			int num = MaxMin[i]; // num에 배열 데이터를 넣음
			if(min1 > MaxMin[i]) {
				min1 = MaxMin[i]; 
			}
		}
		
		System.out.println("min1: " + min1);
		
		
		System.out.println();
		System.out.println();
//		4. 세 수중 가장 큰 수 찾기
		int Max[] = {13, 38, 55};
		
		int max2; 
		
		
		max2 = Max[0];
		
		
		//최대값
		for(int i=0; i<Max.length; i++) {
			int num = Max[i]; 
			if(max2 < num) {
				max2 = num; 
			}
		}
		System.out.println("max2: " + max2);
		
		
		System.out.println();
		System.out.println();
//		5. 최대값 찾기(배열)
		
		int MaxFind[] = {26, 45, 87};
		
		int maxFind; 
		
		
		maxFind = MaxFind[0];
		
		
		//최대값
		for(int i=0; i<MaxFind.length; i++) {
			int num = MaxFind[i]; 
			if(maxFind < num) {
				maxFind = num; 
			}
		}
		System.out.println("maxFind: " + maxFind);
		
		System.out.println();
		System.out.println();
//		6. 두 변수 값 교환하기
		int a;
		int b;
		
		a = 13;
		b = 45;
		
		System.out.println("교환하기 전 -> a: " + a + ", b: " + b);
		
		int temp;
		temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("교환한 후 -> a: " + a + ", b: " + b);
		System.out.println();
		System.out.println();
//		7. 작은수에서 큰 수까지의 합 구하기
		int SumArr[] = {-1, 0, 1, 2};
		int sum = 0;
		
		
		for(int i=0; i<SumArr.length; i++) {
			sum = sum + SumArr[i];
			System.out.println("작은 수에서 큰 수까지의 합: " + sum);
		}
		
		System.out.println();
		System.out.println();
//		8. 특정 숫자까지의 3의 배수 합 구하기
		int sum3 = 0; 
		int SNum[] = new int[10];
		
		for(int i=0; i<10; i++) {
			SNum[i] = i + 1;
			
//			System.out.println("SNum[" + i + "] = " + SNum[i]);
			if(SNum[i]%3==0) {
				sum3 += SNum[i];
				
			}
			
		} System.out.println("특정 숫자까지의 3의 배수의 합: " + sum3);
		
		System.out.println();
		System.out.println();
//		9. -1, -2, -4, ...., -100 합 구하기
		int MNum[] = new int[100];
		int sum4 = 0;
		
		for(int i=0; i<100; i++) {
			MNum[i] = -(i+1);
//			System.out.println("MNum[" + i + "] = " + MNum[i]);
			
			sum4 += MNum[i];
			
		} System.out.println("(-1) ~ (-100)까지의 합: " + sum4);
		
		
		

	}

}
