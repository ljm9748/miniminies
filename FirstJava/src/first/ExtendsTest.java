package first;

public class ExtendsTest {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		Child c1 = new Child();
		Child2 c2 = new Child2("KING");
		GrandChild gc = new GrandChild("김자바"); // 문자를 주어야 오류가 사라짐
		
		System.out.println("c1.getMoney(): " + c1.getMoney());
		System.out.println("c2.getMoney(): " + c2.getMoney());
		System.out.println("c2.name: " + c2.name);
		System.out.println("gc.getMoney(): " + gc.getMoney());
		System.out.println("gc.name: "+gc.name);

	}

}
