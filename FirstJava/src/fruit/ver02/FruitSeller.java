package fruit.ver02;
/*
 	파일 이름: FruitSeller.java
 	기능: 사과 장수의 객체를 정의
 	작성일시: 2020.10.08(금)
 	수정 내용: fruit.FruitSeller.java를 기반으로 생성자를 추가
 	 
 */
// 20.10.15(목) 제어자 추가 및 정보 은닉

public class FruitSeller {
	
	// 클래스에는 변수와 메소드를 정의
	// 성격이 비슷한 변수, 메소드를 정의한다.
	
	// 변수: 인스턴스 변수, 멤버 변수
	
	// 수정: 2020.10.08 - 변수의 초기화를 생성자에서 처리, 변수 선언 시 초기화 코드르 삭제
	//int applePrice = 1000;			 // 사과의 가격
	final int APPLE_PRICE; 	 // 상수 처리 - 사과의 가격, 변경이 불가능
	private int numOfApple; 			 // 사과의 보유 개수
	private int myMoney;				 // 수익 금액
	
	//2020.10.08 생성자 추가
	FruitSeller(){ // 기본 생성자
		this(0, 20, 1000); // 생성자 FruitSeller를 가리킴.
	}
	
	// 생성자의 오버로딩
	FruitSeller(int money, int num, int price){
		APPLE_PRICE=price;
		numOfApple = num;
		myMoney = money;
	}
	
	FruitSeller(FruitSeller seller){
//		APPLE_PRICE = seller.APPLE_PRICE;
//		numOfApple = seller.numOfApple;
//		myMoney = seller.myMoney;
		this(seller.myMoney, seller.numOfApple, seller.APPLE_PRICE);
	}
	
	
	// 기능: 판매, 수익금을 정산 출력
	// 판매 메소드:
	//	돈을 받고  
	// 		-> 반환하는 사과의 개수,
	//		수익금 증가,
	//		사과 보유 개수가 감소  
	// 	-> 사과의 개수 반환
	int saleApple(int money) {
		
		int num = 0; 		//반환할 사과의 개수, 지역 변수는 반드시 초기화해주어야 한다. 
		
		// 반환할 사과의 개수를 구한다.
		num = money/APPLE_PRICE; 		// 받은 돈/사과의 가격
		// 수익금 증가
		myMoney = myMoney + money;
		// 사과 보유 개수 감소
		numOfApple = numOfApple - num;
		
		
		return num;
	}
	
	// 정산 출력: 보유한 사과의 개수 출력, 보유한 금액 출력, 
	// 받는 데이터가 없으므로 매개변수 정의하지 않는다.
	// 반환하는 데이터가 없으므로 반환타입을 void 타입으로 메소드 정의
	void showSaleResult() { 	// 반환 타입이 x
		System.out.println("현재 보유한 사과의 개수: " + numOfApple);
		System.out.println("판매 수익 금액: " + myMoney );
	}
	

}
