package store;

public class LifeSeller {

	
	// 클래스에는 변수와 메소드를 정의
		// 성격이 비슷한 변수, 메소드를 정의한다.		
		
		final int LIFE_PRICE; 	 				// 상수 처리 - 라이프의 가격, 변경이 불가능
		private int numOfLife; 			 		// 라이프의 보유 개수
		private int myPoint;				 	// 보유 포인트 // 잔액 불러오기
		private int myMoney;					// 보유 금액
		
		
		LifeSeller(){ // 기본 생성자
			this(0, 20, 100); // 생성자 FruitSeller를 가리킴. // 라이프 보유 개수 무제한..?
		}
		
		// 생성자의 오버로딩
		LifeSeller(int point, int numLife, int price){
			this.myPoint = myPoint;
			this.numOfLife = numOfLife;
			LIFE_PRICE = price;			
		}
		
		LifeSeller(LifeSeller seller){		
			this(seller.myPoint, seller.numOfLife, seller.LIFE_PRICE);
		}
		
		
		// 기능: 판매, 수익금을 정산 출력
		// 판매 메소드:
		//	돈을 받고  
		// 		-> 반환하는 사과의 개수,
		//		수익금 증가,
		//		사과 보유 개수가 감소  
		// 	-> 사과의 개수 반환
		
		int numLife = 0; //반환할 라이프의 개수, 지역 변수는 반드시 초기화해주어야 한다. 
		int saleLife(int point) {
			
			 		
			
			// 반환할 사과의 개수를 구한다.
			numLife = point/LIFE_PRICE; 		// 받은 돈/사과의 가격
			// 수익금 증가
			myPoint = myPoint + point;
			// 사과 보유 개수 감소
			numOfLife = numOfLife - numLife;
			// money로 환전
			myMoney = myPoint;
			
			return numLife;
		}
		
		// 정산 출력: 보유한 사과의 개수 출력, 보유한 금액 출력, 
		// 받는 데이터가 없으므로 매개변수 정의하지 않는다.
		// 반환하는 데이터가 없으므로 반환타입을 void 타입으로 메소드 정의
		void showSaleLifeResult() { 	// 반환 타입이 x
			System.out.println("판매한 라이프의 개수는 " + numLife + "개 입니다.");
			System.out.println("판매 수익 금액은 " + myPoint +"원 입니다." );
			System.out.println("보유 금액은 " + myMoney + "원 입니다.");
		}
}
