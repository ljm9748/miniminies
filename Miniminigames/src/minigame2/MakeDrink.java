package minigame2;

import java.util.Scanner;

public class MakeDrink extends Cafe{
	
	// 입력을 받기위한 스캐너
	Scanner sc = new Scanner(System.in);
	
	// 만든 음료의 값을 반환받을 String타입의 drink초기화
	private String drink;
	
	/*
	 2020 11 02 Ver0.2 문제내용
	 contains 를 활용해서 레시피를 만들고싶었음
	 그러나 아메리카노에 포함된 요소를 물 , 커피, 얼음 이 꼭 들어가야하늗네
	 얼음 , 얼음, 얼음 을 입력해도 아메리카노가 완성됨..!?
	
	 2020 11 03 Ver0.3 해결내용
	 contains 는 띄어쓰기마다 포함된 요소인지 비교를 한다.
	 "물 커피 얼음" 는 "물" "커피" "얼음" 을 나타낸다 그래서 var1,2,3에 
	  커피 커피 커피 를 넣어도 true값이 반환되었다.
	 "물커피얼음" 은 "물커피얼음"을 나타낸다.
	  플레이어가 입력한 var1,2,3을 더 해서 String을 만들고 띄어쓰기로 경우의수를 구분해 적어서 비교하기로했다.
	  레시피용 String은 늘어났으나 삼항연산자를 줄여 가독성이 좋아졌다!
	*/
	
	String americano = "물커피얼음 물얼음커피 얼음커피물 얼음물커피 커피얼음물 커피물얼음";
	String cafeLatte = "우유커피얼음 우유얼음커피 얼음커피우유 얼음우유커피 커피얼음우유 커피우유얼음";
	String vanilaLatte = "우유커피바닐라 우유바닐라커피 바닐라커피우유 바닐라우유커피 커피바닐라우유 커피우유바닐라";
	String cafeMocha = "우유커피초코 우유초코커피 초코커피우유 초코우유커피 커피초코우유 커피우유초코";
	
	// 재료 3개를 입력받아 음료를 제조함 만약 레시피에 없는 음료일시 else로(실패) 처리
	void recipe (String var1, String var2, String var3) {
		
		// 재료 3개를 더해 문자열을 만듬 (비교용).trim으로 띄어쓰기 입력 방지해줌
		 String inputBase = (var1+var2+var3).trim();
		
		// 아메리카노 (물 + 커피 + 얼음) | (물 + 얼음 + 커피)
		if(americano.contains(inputBase)) {
			System.out.println("**************************");
			System.out.println("아이스 아메리카노 완성");
			System.out.println("**************************");
			drink = "아이스아메리카노";	
			
		// 카페라떼 (우유 + 커피 + 얼음) | (우유 + 얼음 + 커피)	
		} else if (cafeLatte.contains(inputBase)){
			System.out.println("**************************");
			System.out.println("아이스 카페 라떼 완성");
			System.out.println("**************************");
			drink = "아이스카페라떼";
		
		// 바닐라 라떼 (우유 + 바닐라 + 커피) | (우유 + 커피 + 바닐라) 	
		} else if (vanilaLatte.contains(inputBase)){
			System.out.println("**************************");
			System.out.println("바닐라 라떼 완성");
			System.out.println("**************************");
			drink = "바닐라라떼";
			
		// 카페 모카 (우유 + 초코 + 커피) | (우유 + 커피 + 초코)
		} else if (cafeMocha.contains(inputBase)){
			System.out.println("**************************");
			System.out.println("카페 모카 완성");
			System.out.println("**************************");
			drink = "카페모카";
			
		// 음료제조 실패
		} else 
			System.out.println("음료 제조에 실패했습니다~~T.T");
		
			// 반환 값인 drink가 null일경우 null을 콘솔에서 없애기위해 사용함.
			if(drink == null) {
				drink = "음식물 쓰레기";
			}
	}
	
	// getter
	public String getDrink() {
		return drink;
	}

	@Override
	public void recipe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerMakeDrink() {
		// TODO Auto-generated method stub
		
	}

	
}
