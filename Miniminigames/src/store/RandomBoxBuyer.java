package store;

public class RandomBoxBuyer extends Buyer {

	// 생성자 정의 -> 변수의 초기화 목적
	public RandomBoxBuyer(String id, int myPoint, int givePoint) {
		super(id, myPoint, givePoint);
	}
	
	RandomBoxBuyer(RandomBoxBuyer randomboxbuyer) {
		this(randomboxbuyer.getId(), randomboxbuyer.getMyPoint(), randomboxbuyer.getGivePoint());
	}

	// 기능: 랜덤박스 구매, 현재 상태값(랜덤박스로 얻은 포인트, 소유한 포인트)을 출력
	// 랜덤박스 구매
	// 판매자정보(객체), 포인트를 받아
	// 판매자의 판매 메소드 호출 -> 구매한 랜덤 포인트를 얻는다.
	// 나의 포인트의 수를 증가
	// 나의 보유 포인트를 감소
	@Override
	void showBuyRandomBoxResult() {		
		super.showBuyRandomBoxResult();
	}

}
