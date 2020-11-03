package store;

public class PointSeller extends Seller { // (point)seller <-> buyer(money)

	public PointSeller(int gievePoint, int myMoney) {
		super(myMoney, gievePoint);
		
	}	
	PointSeller(PointSeller pointseller) {
		this(pointseller.getGivePoint(), pointseller.getMyMoney());
	}
	@Override
	void showSalePointResult() {		
		super.showSalePointResult();
	}

	

	

}
