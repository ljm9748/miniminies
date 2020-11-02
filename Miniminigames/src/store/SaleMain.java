package store;

import java.util.Scanner;

public class SaleMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			while(true) {
		
				System.out.println("*****메뉴를 입력하세요*****");
				System.out.println("1. 라이프 충전");
				System.out.println("2. 랜덤박스 구매");
				System.out.println("3. 포인트 충전");
			
				
				
				int select = 0;
				select = sc.nextInt();
			
				switch(select) {
	
				case 1:
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
															
					System.out.println("\n# 라이프 판매자의 현재 지표\n");
					lifeseller.showSaleLifeResult();
					
					System.out.println("----------------------------------");
					
								
					System.out.println("\n# 라이프 구매자의 현재 지표\n");
					lifebuyer.showBuyLifeResult();
					
					break;
					
					// 보유 금액을 연동하고 싶습니다. 
					
				case 2:
					// RandomBoxSeller 타입의 참조변수 선언
					RandomBoxSeller randomboxseller = null;
					// LifeSeller의 객체 생성
					// 객체의 생성은 클래스에 정의된 멤버(변수, 메서드)들을 메모리에 등록하는 것.
					
					// 랜덤박스 셀러
					randomboxseller = new RandomBoxSeller(0, 0, 50); // 객체 생성 후 객체의 주소값을 반환
										//	point, getPoint, price 
					
								
					// RandomBoxBuyer 타입의 참조변수 선언과 초기화
					RandomBoxBuyer randomboxbuyer = new RandomBoxBuyer(300, 0); // 인스턴스 생성
												// 현재잔액 포인트, 라이프 개수
										
					// 랜덤박스 구매: randomboxseller에게 원하는 값 지급
					givePoint = 0;			
					System.out.println("100p를 결제하세요. (랜덤박스는 1회당 1개씩 구매 가능합니다.)");	
					givePoint = sc.nextInt();
					if(givePoint%100==0) {
						randomboxbuyer.buyRandomBox(randomboxseller, givePoint);
					} else {
						System.out.println("100원 단위로 입력해주세요. \n메뉴로 돌아갑니다.");
					}
					
															
					System.out.println("\n# 라이프 판매자의 현재 지표\n");
					randomboxseller.showSaleRandomBoxResult();
					
					System.out.println("----------------------------------");
					
								
					System.out.println("\n# 라이프 구매자의 현재 지표\n");
					randomboxbuyer.showBuyRandomBoxResult();
					
					break;
					
				}
			}
		}


	

}
