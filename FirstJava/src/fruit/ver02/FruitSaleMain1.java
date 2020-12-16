package fruit.ver02;

/*
파일 이름: FruitBuyer.java
기능: 구매자의 객체를 정의
작성일시: 2020.10.08(금)
수정 내용: fruit.FruitBuyer.java를 기반으로 생성자를 추가

 
*/

// 수정: 20.10.15(목) - 제어자 추가

public class FruitSaleMain1 {

	public static void main(String[] args) {

		// FruitSeller 타입의 참조변수 선언
		FruitSeller seller = null;
		// FritSeller의 객체 생성
		// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는 것.
		// 셀러1
		seller = new FruitSeller(0, 30, 1500); // 객체 생성 후 객체의 주소값을 반환
		
		// 셀러2
		FruitSeller seller2 = new FruitSeller(0, 10, 2000);
		
//		String s = "FruitSeller";
//		seller = s; -> seller는 객체의 주소값만 담을 수 있음

		// FruitBuyer 타입의 참조변수 선언과 초기화
		FruitBuyer buyer = new FruitBuyer(10000, 0); // 인스턴스 생성

		// 셀러3
		FruitSeller seller3 = new FruitSeller(seller);
				
		// 사과 구매: 2,000원 지불
		buyer.buyApple(seller, 3000);
				
		// 사과 구매: 4000원어치 구매
		buyer.buyApple(seller2, 4000);
		
		//20.10.15(금) - 제어자 추가 -> 정보 은닉
//		seller.myMoney += 500;
//		buyer.myMoney -= 500;
//		
//		seller.numOfApple -= 20;
//		buyer.numOfApple += 20;
		
		// 
		buyer.buyApple(seller3, 1500);
		
		System.out.println("판매자1의 현재 지표");
		seller.showSaleResult();
		
		System.out.println("----------------------------------");
		
		System.out.println("판매자2의 현재 지표");
		seller2.showSaleResult();
		
		System.out.println("----------------------------------");
		
		System.out.println("판매자3의 현재 지표");
		seller2.showSaleResult();
		
		System.out.println("----------------------------------");
		
		System.out.println("구매자의 현재 지표");
		buyer.showBuyResult();

	}

}
