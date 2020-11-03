package store;

public class LifeSeller extends Seller{

	
	// 클래스에는 변수와 메소드를 정의
		// 성격이 비슷한 변수, 메소드를 정의한다.		
	public LifeSeller(int myPoint) {
		super(myPoint);
		
	}

	LifeSeller(LifeSeller lifeseller){		
		this(lifeseller.getMyPoint());
	}

	// 기능: 판매, 수익금을 정산 출력
			// 판매 메소드:
			//	돈을 받고  
			// 		-> 반환하는 사과의 개수,
			//		수익금 증가
			//		사과 보유 개수가 감소  
			// 	-> 사과의 개수 반환
	
	@Override
	void showSaleLifeResult() {		
		super.showSaleLifeResult();
	}	
	
		
		
		

		
		
		
		
}
