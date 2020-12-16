package variable;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//주석문: 컴파일 되지 않는 문장 - 소스의 설명을 작성할 수 있음.
		// 한줄 주석문
		/*   범위 주석문     */
		
		/*console
		Window -> App
		Web B -> Web*/
		
		System.out.print("world");
		System.out.println("Hello World!");
		
		System.out.printf("%d", 123);
		//f는 포맷의 약자
		System.out.printf("%s", "hello"); //s는 string
		//printf는 ln의 기능이 없음(줄바꿈의 기능이 없음.)
		
		System.out.println(); // 줄바꾸기 
		
		/* 
		  
		 문자: a 
		 문자열: apple (하나 이상)
		 System.out.println('문자');
		 System.out.println("문자열");
		 
		 */
		System.out.println('A');
		System.out.println("hello");
		
//		System.out.println('AB'); -> error가 나면 실행이 안됨.
		
		
		System.out.println(123+456); //숫자는 문자열이 아님. 연산된 값이 출력됨.
		System.out.println("a" + 123 + 456); //숫자와 문자가 같이 쓰이면 문자가 우선된다.
		System.out.println(123 + 456 + "a"); //연산 후에 문자를 붙임.
		System.out.println("a" + (123 + 456)); //연산 - 문자 붙임 .
		System.out.println('a' + 123+ 456);
		System.out.println(""+'a' + 123 + "hello"); 
		// a(97)-z / A(65)-Z에는 지정된 숫자가 있다. -> ASCII코드(아스키코드) 
		// a(97)+123이 연산됨.
		// ""를 붙여주면 연산되지 않고 나란히 나열됨.
		
		System.out.printf("%c %d %s", 'A', 245, "world");
		// %c='A', %d=245, %s="world"
		
		// escape sequence \n(개행) \b(한 칸 거슬러 올라감) \"(큰따옴표) \'(작은 따옴표) /t(띄어쓰기)
		System.out.println();
		System.out.println("hello java world");
		System.out.println("hello\tjava\tworld");
		System.out.println("he      ja      wo");
		System.out.println("he\tja\two\t");
		System.out.println();
		System.out.println("hello\n \"java\" \\ world\b ");
		
		
		

		
		
		
	}

}
