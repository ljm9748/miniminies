package store;

public class Seller {
	final int LIFE_PRICE = 100;
	private int numOfLife; 			 		// 라이프의 보유 개수
	private int myPoint;				 	// 보유 포인트 // 잔액 불러오기
	private int myMoney;					// 보유 금액	
	private int givePoint; 				 	// getPoint의 수	
	final int RANDOMBOX_PRICE = 50; 	 			// 상수 처리 - 랜덤박스의 가격, 변경이 불가능
	private int numOfRandomBox;				// 랜덤박스 수량
	private int getPoint; 				 	// getPoint의 수
	
	// getter/setter
	public int getNumOfLife() {
		return numOfLife;
	}

	public void setNumOfLife(int numOfLife) {
		this.numOfLife = numOfLife;
	}

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getGivePoint() {
		return givePoint;
	}

	public void setGivePoint(int givePoint) {
		this.givePoint = givePoint;
	}

	public int getNumOfRandomBox() {
		return numOfRandomBox;
	}

	public void setNumOfRandomBox(int numOfRandomBox) {
		this.numOfRandomBox = numOfRandomBox;
	}

	public int getGetPoint() {
		return getPoint;
	}

	public void setGetPoint(int getPoint) {
		this.getPoint = getPoint;
	}

	public int getLIFE_PRICE() {
		return LIFE_PRICE;
	}

	public int getRANDOMBOX_PRICE() {
		return RANDOMBOX_PRICE;
	}

	Seller(){
		
	}
	
	// 생성자
	Seller(int myPoint) {
		this.myPoint = myPoint;		
	}
	
	Seller(int myMoney, int givePoint){
		this.myMoney = myMoney;
		this.givePoint = givePoint;
	}
	
	
//	라이프 판매
	int numLife;
	int saleLife(int point) {
		
		// 반환할 라이프의 개수를 구한다.
		numLife = point/LIFE_PRICE; 		// 받은 돈/사과의 가격
		// 수익금 증가
		myPoint =myPoint + point;
		// 라이프 보유 개수 감소
		numOfLife = numOfLife - numLife;
		// money로 환전
		myMoney = myPoint;
		
		return numLife; //반환할 라이프의 개수, 지역 변수는 반드시 초기화해주어야 한다.
	}
	
//	랜덤박스 판매 
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
	
//	포인트 판매
	int salePoint(int money) {
		
		
		
		// 반환할  랜덤 포인트의 개수를 구한다.				
		givePoint = money/10; 		// point=돈/10 ex) 100p = 1000원
		// 수익금 증가					
		myMoney = myMoney + money;
		// 포인트를 결제한 횟수
		//numOfPoint = money/POINT_PRICE;
		
		return givePoint;
	}
	
//	라이프 판매 결과 메소드
	void showSaleLifeResult() { 	// 반환 타입이 x
		System.out.println("판매한 라이프의 개수는 " + numLife + "개 입니다.");
		System.out.println("판매 수익 금액은 " + myPoint +"원 입니다." );
		System.out.println("보유 포인트는 " + myMoney + "원 입니다.");
	}
	
//	랜덤박스 판매 결과 메소드
	void showSaleRandomBoxResult() { 	// 반환 타입이 x
		System.out.println("player가 당첨된 포인트는 " + getPoint +"p 입니다." );
		System.out.println("현재 보유 금액은 " + myMoney +"원 입니다.");
	}
	
//	포인트 판매 결과 메소드
	void showSalePointResult() { 	// 반환 타입이 x
		//System.out.println(" >> " + numOfPoint);					
		System.out.println("판매한 포인트는 " + givePoint +"p 입니다.");
		System.out.println("현재 보유 금액은 " + myMoney +"원 입니다.");
	}
	
//	판매자 현재 정보 출력 메소드
	void showSellerResult() {
		System.out.println("현재 판매한 라이프의 개수는 " + numLife + "개 입니다.");
		System.out.println("현재 판매한 랜덤박스의 개수는 " + numOfRandomBox + "개 입니다.");
		System.out.println("player로 부터 얻은 포인트는 " + myPoint + "p 입니다.");
		System.out.println("현재 수익금은 " + myMoney + " 원 입니다.");
	}
	
	
	

}
