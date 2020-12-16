package first;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c = new Child();
				
		// 변수참조
		//System.out.println(c.money); // -> private 때문에 사용하할 수 없음
		
		// 메소드를 통해서 값을 가져옴
		System.out.println(c.getMoney());
	}
	
}
