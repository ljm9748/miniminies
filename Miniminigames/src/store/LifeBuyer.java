package store;

public class LifeBuyer extends Buyer {

	// 생성자
	public LifeBuyer( int myPoint, int numOfLife) {
		super( myPoint, numOfLife);
	}

	LifeBuyer(LifeBuyer lifebuyer) {
		this( lifebuyer.getMyPoint(), lifebuyer.getNumOfLife());
	}

	// 기능: 라이프 구매, 현재 상태값(금액, 라이프의 개수)을 출력
	// 라이프 구매
	// 판매자정보(객체), 포인트를 받아
	// 판매자의 판매 메소드 호출 -> 구매한 라이프의 개수를 얻는다.
	// 나의 라이프의 개수를 증가
	// 나의 보유 포인트를 감소
	@Override
	void showBuyLifeResult() {
		super.showBuyLifeResult();
	}

}
