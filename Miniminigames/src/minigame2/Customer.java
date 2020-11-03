package minigame2;

public class Customer {
	
	/*
	 손님 : 1. 메뉴리스트 중 음료를 선택함.
	  	  2. 플레이어에게 선택한 내용의 주문을 함.	
	 */
	
	// 손님은 메뉴를 4가지중에 하나를 골라야함.
	public String csRandomChoice() {
		// 배열의 index로 사용할 cnt
		int cnt = 0;
		// String타입의 배열 메뉴리스트를 생성함.
		String[] menuList = {"아이스아메리카노", "아이스카페라떼", "카페모카", "바닐라라떼"};
		// cnt는  0, 1, 2, 3 의 값을 가짐.
		cnt = (int) (Math.random()*4);
		// 메뉴리스트의 0~3번지 중 1개의 값을 스트링 타입 mc에 저장 후 값을 반환 = (메뉴를 정했다)
		String mc = menuList[cnt];
		return mc;
		}
	
	// 입력받은 메뉴가 바뀌지않게.... 변수를 만들어봄.
	String saveMenu;
	
	// 손님은 주문을 합니다.
	void csOrder() {
		// csMenuChoice();에서 나온 return 값을 String 타입의 menu에 저장
		String menu = csRandomChoice();
		
		// 손님이 주문하는 것을 표현함 
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("손님이 주문을 하러 왔습니다. 뚜벅뚜벅");
		System.out.println("손님  : >> "+ menu + "주세요");
		
		saveMenu = menu;
		
		// 여기서 return이 필요한가? 왜 return을 적었는지 생각해보자 필요없으면 삭제할 것.(11-02 10:00)
		// csMenuChoice 에서 리턴시 다시 랜덤값으로 생성되어 주문이 바뀌게됨 ?? 해결해야함. -> 해결완료 (11-02 11:17)
		
		// 이곳에 원래 반환형으로 menu를 String 타입으로 return 하려 했었음
		// 그러나 크나큰 문제가 발생함 아래는 내가 생각한 해결방법임.
		
		// 1. 랜덤수의 index를 받아 menu 를 출력하기때문에 비교판단을 하는 과정에서 이곳에있는 String타입을 사용할시 갱신되어 menu가 바뀌었음
		// 2. 이때문에 올바른 판단이 이루어지지 않아 제대로 입력해도 어떤때는 패스 , 어떤때는 실패함 (4가지 랜덤중 같은메뉴가 두번연속나오면 성공으로 처리되었음)
		// 3. 그래서 csOrder에서 나온 값을 Class(Player)의 saveMenu 변수에 넣고 그 변수는 추가 행동이 없는한 처음에 주문한 menu의 값을 가지고있도록 함
		// 4. 즉 랜덤이 다시 돌아가지 않도록 비교를 위한 변수를 나누어버렸음 + getter 의 역할도 함.
		// 5. 성공.
	}

	public String lastChoice() {
		return saveMenu;
	}


}

