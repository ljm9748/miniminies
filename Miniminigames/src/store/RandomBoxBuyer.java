package store;

public class RandomBoxBuyer {

	
			// 변수와 메서드 정의
	
			// 구매자의 소유 포인트 , 랜덤박스로 얻은 포인트
			private int myPoint; 	// 구매자의 보유 포인트
			private int givePoint;	 // 랜덤박스로 얻은 포인트
			private int numOfRandomBox; // 랜덤박스 수량

			// 기능: 랜덤박스 구매, 현재 상태값(랜덤박스로 얻은 포인트, 소유한 포인트)을 출력
			// 랜덤박스 구매
			// 판매자정보(객체), 포인트를 받아
			// 판매자의 판매 메소드 호출 -> 구매한 랜덤 포인트를 얻는다.
			// 나의 포인트의 수를 증가
			// 나의 보유 포인트를 감소
			
			// 생성자 정의 -> 변수의 초기화 목적
			public RandomBoxBuyer() {
				this(300, 0); // 현재 잔액 포인트 , 라이프 개수 불러오기
			}
			
			public RandomBoxBuyer(int myPoint, int givePoint) {
				this.myPoint = myPoint; 
				this.givePoint = givePoint;
			}

			// 참조변수는 객체의 주소를 저장하고 있다.-> 셀러의 참조값을 받도록 참조변수를 매개변수로 정의
			// RandomBoxSeller randomboxseller -> RandomBoxSeller 클래스로 만든 객체의 주소를 저장하는 변수
			
			
			void buyRandomBox(RandomBoxSeller randomboxseller, int point) {
				// 구매할 랜덤박스의 개수를 구한다.
				givePoint = randomboxseller.saleRandomBox(point);
				// 나의 라이프의 개수 증가
				myPoint += givePoint;
				// 나의 보유 포인트를 감소
				myPoint -= point;
			}
			
				// 현재 상태(금액, 라이프의 개수) 값을 출력
			void showBuyRandomBoxResult() {
				// 지급한 포인트 금액 출력
				System.out.println("랜덤박스 결과는 " + givePoint + "p 입니다.");
				System.out.println("보유 포인트는 " + myPoint +"p 입니다.");
				
			}
}
