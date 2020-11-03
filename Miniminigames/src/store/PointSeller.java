package store;

public class PointSeller { // 		(point)seller <-> buyer(money)
	
				// 클래스에는 변수와 메소드를 정의
				// 성격이 비슷한 변수, 메소드를 정의한다.		
				
				//final int POINT_PRICE; 	 			// 상수 처리 - 랜덤박스의 가격, 변경이 불가능
				//private int numOfPoint;
				private int givePoint; 				 	// getPoint의 수
				//private int myPoint;				 	// 보유 포인트 // 잔액 불러오기
				private int myMoney;					// 보유 금액
				
				
				PointSeller(){ // 기본 생성자
					this( 0, 0); // givepoint를 무제한으로 설정하려면?
				}
				
				// 생성자의 오버로딩
				PointSeller( int myMoney, int gievePoint ){					
					this.givePoint = gievePoint;
					this.myMoney = myMoney;
					
				}
				
				PointSeller(PointSeller pointseller){		
					this( pointseller.givePoint ,pointseller.myMoney);
				}
				
				
				// 기능: 판매, 수익금을 정산 출력
				// 판매 메소드:
				//	포인트를 받고  
				// 		-> 반환하는 포인트의 개수,
				//		수익금 증가,
				//		포인트 보유 개수가 감소  
				// 	-> 포인트의 개수 반환
				
				 //반환할 라이프의 개수, 지역 변수는 반드시 초기화해주어야 한다. 
				int salePoint(int money) {
					
					
					
					// 반환할  랜덤 포인트의 개수를 구한다.				
					givePoint = money/10; 		// point=돈/10 ex) 100p = 1000원
					// 수익금 증가					
					myMoney = myMoney + money;
					// 포인트를 결제한 횟수
					//numOfPoint = money/POINT_PRICE;
					
					return givePoint;
				}
				
				// 정산 출력: 보유한 사과의 개수 출력, 보유한 금액 출력, 
				// 받는 데이터가 없으므로 매개변수 정의하지 않는다.
				// 반환하는 데이터가 없으므로 반환타입을 void 타입으로 메소드 정의
				void showSalePointResult() { 	// 반환 타입이 x
					//System.out.println(" >> " + numOfPoint);					
					System.out.println("판매한 포인트 >> " + givePoint );
					System.out.println("현재 보유 금액 >> " + myMoney);
				}

}
