package card;

public class Card {
	
	String kind; 	// 카드의 종류
	int number;		// 카드의 숫자
	
	// 생성자 생성
	Card(String kind, int number){
		this.kind = kind; // 지역 변수를 가장 우선시 함.
		this.number = number;
		
	}
	
	Card(){
		this("spade", 1); // -> this는 다른 생성자를 호출한다. -> 오버로딩 되어 있음
	}
	
	//클래스 변수 선언
	static int width = 100;	// 카드의 폭 
	// static을 붙임으로써변수가 52개 -> 1개로 통일
	static int height = 250;	// 카드의 높이
	// 시작 할 때 딱 한번 생성된다.
	// 인스턴스와 완전 독립적
	
	
	static void play() { // 어디서든 사용 가능
		System.out.println("카드 놀이를 합니다.");
	}
	
}
