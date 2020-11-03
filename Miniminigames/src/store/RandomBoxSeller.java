package store;

public class RandomBoxSeller extends Seller {

	
	
	public RandomBoxSeller(int myMoney, int getPoint) {
		super(myMoney, getPoint);		
	}

	RandomBoxSeller(RandomBoxSeller randomboxseller) {
		this(randomboxseller.getMyPoint(), randomboxseller.getGetPoint());
	}

	// 기능: 판매, 수익금을 정산 출력
		// 판매 메소드:
		// 돈을 받고
		// -> 반환하는 포인트 수,
		// 수익금 증가,
		
		

	
	@Override
	void showSaleRandomBoxResult() {		
		super.showSaleRandomBoxResult();
	}

	
	

}
