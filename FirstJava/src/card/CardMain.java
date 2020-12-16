package card;

public class CardMain {
	
	static int weight = 5;
	

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		
		System.out.println(Math.random());
		
		System.out.println(CardMain.weight);
		
		
		System.out.println("카드의 폭 사이즈: " + Card.width);
		// 클래스 변수를 만들어 놓으면 인스턴스 생성을 안해도 사용 가능
		// 사용빈도가 더 높다.
		
		Card.play();
		
		Card c1 = new Card("heart", 10);
		Card c2 = new Card();
		
		
		System.out.println("------------------------------------------");
		System.out.println("카드 1의 정보");
		System.out.println("모양: " + c1.kind + ", 숫자: " + c1.number);
		
		System.out.println("------------------------------------------");
		System.out.println("카드 2의 정보");
		System.out.println("모양: " + c2.kind + ", 숫자: " + c2.number);
	
		
		c1.play();
		
		System.out.println("카드의 폭 사이즈: " + c1.width);
		System.out.println("카드의 폭 사이즈: " + c2.width);
		
		Card.width = 120; // 공용변수의 개념으로 사용하면 됨.
		
		System.out.println("카드의 폭 사이즈 변경: ");
		System.out.println("카드의 폭 사이즈: " + c1.width);
		System.out.println("카드의 폭 사이즈: " + c2.width);
	}

}
