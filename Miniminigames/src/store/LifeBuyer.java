package store;

public class LifeBuyer {

	// 변수와 메서드 정의
	
		// 구매자의 소유 포인트 , 소유한 라이프 개수
		private int myPoint; // 구매자의 보유 포인트
		private int numOfLife; // 보유한 라이프 개수
		
		
		
		public int getMyPoint() {
			return myPoint;
		}

		public void setMyPoint(int myPoint) {
			this.myPoint = myPoint;
		}
		

		// 기능: 라이프 구매, 현재 상태값(금액, 라이프의 개수)을 출력
		// 라이프 구매
		// 판매자정보(객체), 포인트를 받아
		// 판매자의 판매 메소드 호출 -> 구매한 라이프의 개수를 얻는다.
		// 나의 라이프의 개수를 증가
		// 나의 보유 포인트를 감소
		
		
		// 생성자 정의 -> 변수의 초기화 목적
		public LifeBuyer() {
			this(300, 0); // 현재 잔액 포인트 , 라이프 개수 불러오기
		}
		
		public LifeBuyer(int myPoint, int numOfLife) {
			this.myPoint = myPoint; //this.인스턴스 변수 = 지역변수; / this -> 자신을 가리키는 참조변수
			this.numOfLife = numOfLife;
		
		}
			

		// 참조변수는 객체의 주소를 저장하고 있다.-> 셀러의 참조값을 받도록 참조변수를 매개변수로 정의
		// LifeSeller seller -> LifeSeller 클래스로 만든 객체의 주소를 저장하는 변수
		
		void buyLife(LifeSeller lifeseller, int point) {
			// 구매할 사과의 개수를 구한다.
			int numLife = lifeseller.saleLife(point);
			// 나의 라이프의 개수 증가
			numOfLife += numLife;		
			// 나의 보유 포인트를 감소
			myPoint -= point;
			
			
		}
		
		

		

		// 현재 상태(금액, 라이프의 개수) 값을 출력
		void showBuyLifeResult() {
			// 지급한 포인트 금액 출력
			System.out.println("보유 금액은 " + myPoint + "p 입니다.");
			System.out.println("보유 라이프 개수는 " + numOfLife + "개 입니다.");
		}
	
}
