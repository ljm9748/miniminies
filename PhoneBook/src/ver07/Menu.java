package ver07;

public interface Menu {
	
	// public static final 생략
	//main Menu
	int INSERT=1;
	int SERACH=2;
	int DELETE=3;
	int DISPLAY_ALL=4;
	// 20.10.27 >> 인스턴스를 저장하는 메뉴 추가
	int SAVE = 5;
	int EXIT=6;
	
	//서브 메뉴
	// 입력 시 사용되는 메뉴
	int UNIV=1;		// 1번의 1번
	int COM=2;			// 1번의 2번
	int CAFE=3;		// 1번의 3번

}
