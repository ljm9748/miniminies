package ver00;

public class PhoneBookManager00 {
	
	// 배열: 전화번호 정보(이름, 전화번호, 생일, 주소)를 저장하는 목적
	
//	정보 저장을 위한 배열 선언
	PhoneInfor00[] phoneBook00; 
	// 인스턴스 변수로 저장 -> 메소드들이 PhoneInfor[] phoneBook00을 대상으로 처리가 됨
	
	int cnt;
	//저장된 정보의 개수: 반복의 횟수 사용

	// 생성자 생성(초기화)
	PhoneBookManager00(){ // 받을 데이터가 없으니 매개변수는 생략
		//phoneBook00 = new PhoneInfor00[100];
		this(100);
	}
	
	// 생성자 오버로딩
	PhoneBookManager00(int size) {
		phoneBook00 = new PhoneInfor00[size];
	}
	
//	기능: 1.저장, 2.검색, 3.삭제, 4.전체 출력, 5.종료
	
//	1.저장 기능
	
	// 사용자로부터 데이터를 받아 ->
	// 인스턴스를 생성 ->
	// 배열이 생성된 인스턴스의 참조값을 저장: 저장 인덱스는 -> cnt를 이용 -> 저장 후에는 cnt++ 처리
	
	void insertMember() { //사용자로부터 데이터를 받기 때문에 매개변수는 필요x
		System.out.println("친구 정보 입력을 시작합니다.");
		
		// 이름 정보 받기
		System.out.println("이름 >> ");
		String name = Util00.sc.nextLine();
		
		// 전화번호 정보 받기
		System.out.println("전화번호 >> ");
		String phoneNumber = Util00.sc.nextLine();
		
		// 생일 정보 받기
		System.out.println("생일 >> ");
		String birthday = Util00.sc.nextLine();
				
		// 주소 정보 받기
		System.out.println("주소 >> ");
		String address = Util00.sc.nextLine();
		
		// 삼항연산자 -> 값이 null일 경우 아닐 경우
		name = name.trim().isEmpty()?null:name;
		phoneNumber = phoneNumber.trim().isEmpty()?null:phoneNumber;
		birthday = birthday.trim().isEmpty()?null:birthday;
		address = address.trim().isEmpty()?null:address;
		
		
		// 인스턴스 생성
		PhoneInfor00 infor00 = null;
		
		// 생일이 입력되었는지 여부에 따라 인스턴스 생성을 다르게 처리
		infor00 = new PhoneInfor00(name, phoneNumber, birthday, address);
		

		
	}
	
//	2.검색 기능
	// 배열에서 찾는다 -> index를 먼저 찾아야 하낟.
	// 검색하고자 하는 이름을 사용자로부터 받고
	// 배열의 요소(참조값 -> 인스턴스 참조) PhoneInfor.name 변수의 값과 검색 이름을 비교(동등 비교)		
	// 해당 인덱스를 찾을 수 있다.
	// 검색된 인덱스로 정보를 출력
	
	
	void searchMember() {
		
		if(cnt == 0) {
			System.out.println("저장된 데이터가 없습니다. 다시 메뉴로 이동합니다.");
			return; // 메소드의 종료
		}
		
		// 찾고자 하는 이름을 받는다.
		System.out.println("\t정보 검색을 시작합니다.");
		System.out.println("찾고자 하는 이름을 입력해주세요.");
		String name = Util00.sc.nextLine();
		
		// 이름을 요소 인덱스에서 검색
		// int index = -1;
		int index = searchIndex(name);
		
		// 검색: 인덱스를 찾는다 -> 반복
		/*for(int i=0; i<cnt; i++) {
			if(phoneBook00[i].name.equals(name)) {
			// 찾고자 하는 이름을 값으로 넣어서 논리값을 가져옴.
			index = i;
			break;
			}
		} */
		
		// 조건
		if(index<0) { // 
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			// 정보의 출력
			phoneBook00[index].showData00();
		}		
		
		
		
	}
		
//	메소드 생성
	// 이름 문자열을 받아서,
	// 배열의 정보와 비교하고, 
	// 인덱스를 찾아서 반환하는 메소드
	
	int searchIndex(String name) {
	int result = -1;
		
		// 검색: 인덱스를 찾는다 -> 반복
		for(int i=0; i<cnt; i++) {
			if(phoneBook00[i].name.equals(name)) {
				// 찾고자 하는 이름을 값으로 넣어서 논리값을 가져옴.
				result = i;
				break;
			}
		} return result;			
	}
	
//	3.정보 삭제
	// 삭제하고자 하는 이름을 사용자로부터 받는다 ->
	// 배열에서 이름으로 검색해서 인덱스를 찾는다.
	// 배열에서 찾은 인덱스의 참조값을 삭제: 인스턴스는 참조하는 참조 변수가 없으면 삭제된다.
	// 참조값에 null을 입력하거나, 다른 주소값을 입력 -> 이전에 있던 참조값은 없어진다.
	// 삭제대상의 인덱스부터 왼쪽으로 값을 shift 처리
	// cnt-1
	
	void deleteMember() {
		System.out.println("정보 삭제를 진행합니다.");
		System.out.println("삭제하고자 하는 정보의 이름을 입력해주세요.");
		String name = Util00.sc.nextLine();
		
		//이름을 요소 index 검색
		int index = -1;
			
		// 검색: index를 찾는다 -> 반복
		for(int i=0; i<cnt; i++) {
			if(phoneBook00[i].name.equals(name)) {		// phoneBook-> phoneInfor 타입의  참조변수
			// 찾고자 하는 이름을 값으로 넣어서 논리값을 가져옴.
			index = i;
			break;
			}
		}
		
		if(index<0) {
			System.out.println("삭제하고자 하는 정보가 존재하지 않습니다.");
		} else {
			// 삭제 처리 진행: 삭제해야 하는 인덱스부터 왼쪽으로 시프트 처리
			// index = 3;
			// phoneBook00[3] = phoneBook00[4]; -> 값을 대입 시켜 시프트 처리
			// phoneBook00[4] = phoneBook00[5]; 
			
			for(int i=index; i<cnt-1; i++) {
				phoneBook00[i] = phoneBook00[i+1];
			}
			
			cnt--;
			
			System.out.println("정보를 삭제했습니다.");
			
		}

		
	}
	
//	4.전체 정보 출력
	void displayAll() {
		if(cnt == 0) {
			System.out.println("등록된 정보가 없습니다.");
		return;
		}
		
		System.out.println("전체 정보를 출력합니다. (" + cnt + ")");
		System.out.println("----------");
		
		for(int i=0; i<cnt; i++) {
			phoneBook00[i].showData00();
			System.out.println("----------");
		}
	
		
	}
	
	

	
}
