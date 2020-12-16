package operator;

public class mainClass2 {

	public static void main(String[] args) {
		// 논리 연산자(true or false)
		/*
		 	제어문과 같이 사용(if, for, while)
		 	&& AND	그리고	두가지가 다 참인 경우
		 	|| OR   또는		둘 중 하나만 참이거나 둘 다 참인 경우 -> true
		 	! NOT   ~ 아닌
		 	
		 	int a=3, b=1;
		 	a > b; -> true
		 	a < b; -> false
		 	
		 	a >= b;
		 	a <= b;
		 	a == b;-> = 1개만 있을 경우 대입 연산자가 되므로, ==로 같다라는 표시하기!
		 	a != b; -> 같지 않다.
		 	
		 */
		
		int num = 0;
		
		System.out.println("결과: " + (num > 0));
		System.out.println("결과: " + (num >= 0));
		
		System.out.println("결과: " + (num >= 0 && num < 10));
		System.out.println("결과: " + (num > 0 && num < 10));
		
		System.out.println("결과: " + (num >= 0 || num < 10));
		System.out.println("결과: " + (num > 0 || num < 10));
		
		System.out.println("결과: " + !(num > 0));
//									-> num <= 0
		System.out.println("결과: " + (num == 0));
		
		System.out.println("결과: " + !(num > 0 || num < 10));
//									-> num <= 0 && num >= 10	
		
		//삼항 연산자
		//(조건)이 참이니? "값1":"값2"; -> 참이면 값1에 저장, 거짓이면 값2에 저장
		
		int number = 5;
		int i;
		
		i = (number < 5)?100:200;
		
		System.out.println(i);
		
		/*int _number = 5;
		int a;
		
		a = (_number < 5)?100:200;
		
		System.out.println(a); */
		
		char c;
		c = (number > 1)?'Y':'N';
		System.out.println("c = " +c);
		
		String str;
		str = (number >0)?"숫자는 양수입니다.":"숫자는 양수가 아닙니다.";
		System.out.println("str = " + str);
		
		
		
		
		
		

	}

}
