package store;

public class PointBuyer extends Buyer {

	// 생성자
	public PointBuyer( int myMoney, int myPoint, int getPoint) {
		super( myMoney, myPoint, getPoint);
	}

	PointBuyer(PointBuyer pointbuyer) {
		this(  pointbuyer.getMyMoney(), pointbuyer.getGetPoint(), pointbuyer.getGetPoint());
	}

	// 기능: 랜덤박스 구매, 현재 상태값(랜덤박스로 얻은 포인트, 소유한 포인트)을 출력
	// 포인트 구매
	// 판매자정보(객체), 돈을 받아
	// 판매자의 판매 메소드 호출 -> 구매한 포인트를 얻는다.
	// 나의 포인트의 수를 증가
	// 나의 보유 돈을 감소
	@Override
	void showBuyPointResult() {
		super.showBuyPointResult();
	}

}
