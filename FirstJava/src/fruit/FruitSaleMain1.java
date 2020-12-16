package fruit;

public class FruitSaleMain1 {

	public static void main(String[] args) {

		// FruitSeller 타입의 참조변수 선언
		FruitSeller seller = null;
		// FritSeller의 객체 생성
		// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는 것.
		seller = new FruitSeller(); // 객체 생성 후 객체의 주소값을 반환

		FruitSeller seller2 = new FruitSeller();
		
//		String s = "FruitSeller";
//		seller = s; -> seller는 객체의 주소값만 담을 수 있음

		// FruitBuyer 타입의 참조변수 선언과 초기화
		FruitBuyer buyer = new FruitBuyer(); // 인스턴스 생성

		// 사과 구매: 2,000원 지불
		buyer.buyApple(seller, 2000);
		
		System.out.println("판매자의 현재 지표");
		seller.showSaleResult();
		
		System.out.println("----------------------------------");
		
		System.out.println("구매자의 현재 지표");
		buyer.showBuyResult();

	}

}
