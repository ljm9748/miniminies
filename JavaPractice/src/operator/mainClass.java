package operator;

public class mainClass {

	public static void main(String[] args) {
		/*
		 Operator: 연산자
		 
		 + - *  / % =
		 
		%: 값을 나누고 남은 나머지 
		 
		 */
		
		int num1, num2;
		int result;
		
		num1 = 12;
		num2 = 25; 
		
		result = num1 * num2; //오른쪽 수식 먼저 계산 후 왼쪽 수식에 저장
		System.out.println(num1 + "*" + num2 + "=" + result);

		
		num1 = 10;
		num2 = 4;
		
		result = num1 / num2;
		System.out.println(num1 + "/" + num2 + "=" + result);
		
		result = num1 % num2;
		System.out.println(num1 + "%" + num2 + "=" + result);
		
		//분자가 0일 경우에는 0으로 계산되지만 분모가 0일 경우에는 오류가 난다.
		
		//increment(증가 연산자), decrement(가감연산자)
		int n;
		n = 0;
		System.out.println("n = " + n);
		n = n + 1; //자기 자신을 갱신
		System.out.println("n = " + n);
		n += 1;
		System.out.println("n = " + n);
		
		n++;
		System.out.println("n = " + n);
		++n;
		System.out.println("n = " + n);
		
		n--;
		System.out.println("n = " + n);
		--n;
		System.out.println("n = " + n);
		
		// 주의 사항
//		단독으로 하나 사용할 경우에는 ++가 앞에 오던 뒤에 오던 상관 없음.
		int a, b;
		a = 0;
		a++;
		b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = 0;
		b = a++;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//대입 먼저 후 연산 처리
		
		a = 0;
		b = ++a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = 0;
		b = (a++);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		//대입 먼저 후 연산 처리
		
		
			
	}

}
