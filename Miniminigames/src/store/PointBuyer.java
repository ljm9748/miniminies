package store;

public class PointBuyer {
	
				// 변수와 메서드 정의
	
				// 구매자의 소유 포인트 , 랜덤박스로 얻은 포인트
				private int myMoney;
				private int myPoint; 	// 구매자의 보유 포인트
				private int getPoint;	 // 랜덤박스로 얻은 포인트
				//private int numOfRandomBox; // 랜덤박스 수량

				// 기능: 랜덤박스 구매, 현재 상태값(랜덤박스로 얻은 포인트, 소유한 포인트)을 출력
				// 포인트 구매
				// 판매자정보(객체), 돈을 받아
				// 판매자의 판매 메소드 호출 -> 구매한 포인트를 얻는다.
				// 나의 포인트의 수를 증가
				// 나의 보유 돈을 감소
				
				// 생성자 정의 -> 변수의 초기화 목적
				public PointBuyer() {
					this(300, 0, 0); // 현재 보유한 돈, 현재 잔액 포인트 ,  라이프 개수 불러오기
				}
				
				public PointBuyer(int myMoney, int myPoint , int getPoint) {
					this.myMoney = myMoney;
					this.myPoint = myPoint; 					
					this.getPoint = getPoint;
				}
				
				// PointSeller pointseller -> PointSeller 클래스로 만든 객체의 주소를 저장하는 변수				
				
				void buyPoint(PointSeller pointseller, int money) {
					// 구매할 포인트의 개수를 구한다.
					getPoint = pointseller.salePoint(money);
					// 나의 포인트의 개수 증가
					myPoint += getPoint;
					// 나의 보유 돈을 감소
					myMoney -= money;
				}
				
					// 현재 상태(금액, 라이프의 개수) 값을 출력
				void showBuyPointResult() {
					// 지급한 포인트 금액 출력
					System.out.println("구매한 포인트 >> " + getPoint);
					System.out.println("현재 보유 포인트 >> " + myPoint);
					System.out.println("현재 보유 금액 >> " + myMoney);
					
				}

}
