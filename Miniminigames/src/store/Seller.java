package store;

public class Seller {
	
	// 20.10.30 추가
	// 변수 설정
	int point;		// 포인트 // 초기화 = player가 현재 보유하고 있는 포인트
	int money;		// 보유 금액 // 
	private int LIFE_PRICE;	// 라이프 금액
	
	
	// 생성자 추가
	Seller(int myPoint, int myMoney){
		this.point = myPoint;
		this.money = myMoney;
	}
	
	// 라이프 판매 메소드
	int saleLife(int myMoney) {
		int numOfLife = 0; // 0 -> 현재 player가 보유하고 있는 라이프 개수
		
		// 반환할 라이프 개수를 구한다.
		numOfLife = myMoney/LIFE_PRICE;
		// 수익금 증가
		money = money + myMoney;
		// 라이프 보유 개수 -> 무제한일 경우에는....?
		
		
		return numOfLife;
	}
	
	
	
}
