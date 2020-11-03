package store;

public class Buyer {
	
	// 구매자의 소유 포인트 , 소유한 라이프 개수
	private int myPoint; // 구매자의 보유 포인트	
	private int numOfLife; // 보유한 라이프 개수
	
	// 구매자의 소유 포인트 , 랜덤박스로 얻은 포인트	
	private int givePoint;	 // 랜덤박스로 얻은 포인트
	private int numOfRandomBox; // 랜덤박스 수량
	
	// 구매자의 소유 포인트 , 랜덤박스로 얻은 포인트
	private int myMoney;	
	private int getPoint;	 // 랜덤박스로 얻은 포인트
	//private int numOfRandomBox; // 랜덤박스 수량
	
	// 구매자의 아이디
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// getter/setter
	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}

	public int getNumOfLife() {
		return numOfLife;
	}

	public void setNumOfLife(int numOfLife) {
		this.numOfLife = numOfLife;
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

	public int getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}

	public int getGetPoint() {
		return getPoint;
	}

	public void setGetPoint(int getPoint) {
		this.getPoint = getPoint;
	}

	
	
	// 생성자	
	Buyer(){
		
	}
	
	Buyer(String id, int myPoint, int numOfLife) {
		this.id = id;
		this.myPoint = myPoint;
		this.numOfLife = numOfLife;
	
	}
	
	
	Buyer(String id, int myMoney, int myPoint , int getPoint) {
		this.id = id;
		this.myMoney = myMoney;
		this.myPoint = myPoint; 					
		this.getPoint = getPoint;
	}
	
//	라이프 구매
	void buyLife(LifeSeller lifeseller, int point) {
		// 구매할 사과의 개수를 구한다.
		int numLife = lifeseller.saleLife(point);
		// 나의 라이프의 개수 증가
		numOfLife += numLife;		
		// 나의 보유 포인트를 감소
		myPoint -= point;		
	}
	
//	랜덤박스 구매
	void buyRandomBox(RandomBoxSeller randomboxseller, int point) {
		// 구매할 랜덤박스의 개수를 구한다.
		givePoint = randomboxseller.saleRandomBox(point);
		// 나의 라이프의 개수 증가
		myPoint += givePoint;
		// 나의 보유 포인트를 감소
		myPoint -= point;
	}
	
//	포인트 구매
	void buyPoint(PointSeller pointseller, int money) {
		// 구매할 포인트의 개수를 구한다.
		getPoint = pointseller.salePoint(money);
		// 나의 포인트의 개수 증가
		myPoint += getPoint;
		// 나의 보유 돈을 감소
		myMoney -= money;
	}
	
//	라이프 구매 출력 메소드
	void showBuyLifeResult() {
		// 지급한 포인트 금액 출력
		System.out.println("*****" + id + "의 라이프 구매 내역*****");
		System.out.println("남은 포인트는 " + myPoint + "p 입니다.");
		System.out.println("현재 보유 라이프 개수는 " + numOfLife + "개 입니다.");
	}
	
//	랜덤박스 구매 출력 메소드
	void showBuyRandomBoxResult() {
		// 지급한 포인트 금액 출력
		System.out.println("*****" + id + "의 랜덤박스 구매 내역*****");
		System.out.println("랜덤박스 결과는 " + givePoint + "p 입니다.");
		System.out.println("남은 포인트는 " + myPoint +"p 입니다.");
		
	}
	
//	포인트 구매 출력 메소드
	void showBuyPointResult() {
		// 지급한 포인트 금액 출력
		System.out.println("*****" + id + "의 포인트 구매 내역*****");
		System.out.println("구매한 포인트는 " + getPoint + "p 입니다.");
		System.out.println("남은 포인트는 " + myPoint + "p 입니다.");
		System.out.println("남은 금액은 " + myMoney + "원 입니다.");
		
	}
	
//	구매자의 현재 정보 출력 메소드
	void showBuyerResult() {
		System.out.println("*****" + id + "의 구매 내역*****");
		System.out.println("현재 라이프의 개수는 " + numOfLife + "개 입니다.");		
		System.out.println("현재 포인트는 " + myPoint + "p 입니다.");
		System.out.println("현재 보유 금액은 " + myMoney + " 원 입니다.");
	}
	
}