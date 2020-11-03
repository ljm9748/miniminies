package store;

public class RandomBoxSeller {

			// 클래스에는 변수와 메소드를 정의
			// 성격이 비슷한 변수, 메소드를 정의한다.		
			
			final int RANDOMBOX_PRICE; 	 			// 상수 처리 - 랜덤박스의 가격, 변경이 불가능
			private int numOfRandomBox;
			private int getPoint; 				 	// getPoint의 수
			private int myPoint;				 	// 보유 포인트 // 잔액 불러오기
			private int myMoney;					// 보유 금액
			
			
			RandomBoxSeller(){ // 기본 생성자
				this(0, 0, 50); 
			}
			
			// 생성자의 오버로딩
			RandomBoxSeller(int myPoint, int getPoint, int RANDOMBOX_PRICE){
				this.RANDOMBOX_PRICE = RANDOMBOX_PRICE;
				this.getPoint = getPoint;
				this.myPoint = myPoint;
			}
			
			RandomBoxSeller(RandomBoxSeller randomboxseller){		
				this(randomboxseller.myPoint, randomboxseller.getPoint, randomboxseller.RANDOMBOX_PRICE);
			}
			
			
			// 기능: 판매, 수익금을 정산 출력
			// 판매 메소드:
			//	돈을 받고  
			// 		-> 반환하는 사과의 개수,
			//		수익금 증가,
			//		사과 보유 개수가 감소  
			// 	-> 사과의 개수 반환
			
			 //반환할 라이프의 개수, 지역 변수는 반드시 초기화해주어야 한다. 
			int saleRandomBox(int point) {
				
				// 반환할  랜덤 포인트의 개수를 구한다.				
				getPoint = (int)(Math.random()*20)*10; 		// 랜덤으로 포인트 지급 -> (1~20)*10 -> 10~200 지급
				// 수익금 증가
				myPoint = myPoint + point;
				// money로 환전
				myMoney = myPoint;
				// 판매한 랜덤박스 수량
				numOfRandomBox = point/RANDOMBOX_PRICE;
				
				return getPoint;
			}
			
			// 정산 출력: 보유한 사과의 개수 출력, 보유한 금액 출력, 
			// 받는 데이터가 없으므로 매개변수 정의하지 않는다.
			// 반환하는 데이터가 없으므로 반환타입을 void 타입으로 메소드 정의
			void showSaleRandomBoxResult() { 	// 반환 타입이 x
				System.out.println("판매한 라이프의 개수 >> " + numOfRandomBox);
				System.out.println("판매 수익 금액 >> " + myPoint );
				System.out.println("보유 금액 >> " + myMoney);
			}
	
}
