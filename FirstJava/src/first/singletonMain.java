package first;

public class singletonMain {

	public static void main(String[] args) {
		
		//Singleton s = new Singleton(); - error
		// 참조변수 생성은 문제가 되지 않으나 new 생성자 호출은 문제가 된다.
		Singleton s = Singleton.getInstance();
		
		

	}

}
