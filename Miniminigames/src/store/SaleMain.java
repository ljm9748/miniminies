package store;

import java.util.Scanner;

public class SaleMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

			// LifeSeller 타입의 참조변수 선언
			LifeSeller lifeseller = null;
			// LifeSeller의 객체 생성
			// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는 것.
			
			// 셀러1
			lifeseller = new LifeSeller(0, 30, 100); // 객체 생성 후 객체의 주소값을 반환
								//	point, numLife, price 
			
						
			// LifeBuyer 타입의 참조변수 선언과 초기화
			LifeBuyer lifebuyer = new LifeBuyer(1000, 0); // 인스턴스 생성
										// 현재잔액 포인트, 라이프 개수
								
			// 라이프 구매: seller 1에게 원하는 값 지급
			int givePoint = 0;			
			System.out.println("구매할 라이프의 개수를 입력하세요.");	
			givePoint = sc.nextInt();
			lifebuyer.buyLife(lifeseller, givePoint*100);
			
			
			
			//20.10.15(금) - 제어자 추가 -> 정보 은닉
//			seller.myMoney += 500;
//			buyer.myMoney -= 500;
//			
//			seller.numOfApple -= 20;
//			buyer.numOfApple += 20;
									
			System.out.println("\n# 라이프 판매자의 현재 지표\n");
			lifeseller.showSaleLifeResult();
			
			System.out.println("----------------------------------");
			
						
			System.out.println("\n# 라이프 구매자의 현재 지표\n");
			lifebuyer.showBuyLifeResult();

		}


	

}
