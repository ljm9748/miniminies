package ver06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import ver03.Util;

public class PhoneBookManager implements Util {
	// 전화번호 정보를 저장할 배열을 가지고,
	// 배열을 이용한 정보의 저장, 삭제, 출력을 하는 기능	

	// 사용자로부터 데이터를 받는다.
	//Scanner sc = new Scanner(System.in);

	// 20.10.26 수정
	// 정보 저장을 위한 배열선언: 상속 관계이므로 PhoneInfor타입으로 선언
	//private PhoneInfor[] phoneBook; // 전화번호 정보를 저장할 배열
	//private int cnt = 0; // 배열에 저장된 정보(요소)의 개수, 배열의 인덱스
	
	//배열을 이용해서 저장하는 방식을 ArrayList<T> 컬랙션을 이용해서 구현해 보자
	List<PhoneInfor> phoneBook;
	
	
	//20.10.21 수정
	// 생성자: 싱글톤 처리 -> 외부에서 인스턴스 생성을 못하도록 처리
	private PhoneBookManager(int num) { // 개수 num을 받음
		//phoneBook = new PhoneInfor[num]; // phoneInfor 타입의 배열 num의 수만큼 배열을 생성
		//cnt = 0; // 생성자의 매개변수의 인자를 전달 받아 배열 생성
		phoneBook = new ArrayList<PhoneInfor>();
		
		
	}
	
	//20.10.21 수정
	// 클래스 내부에서 인스턴스 생성 -> 외부에서 변경할 수 없도록 private 처리
	// static이 없으면 변수가 만들어지지 않음 -> 왜...?
	private static PhoneBookManager manager = new PhoneBookManager(100);
	
	//20.10.21 추가
	// 외부에서 참조변수를 받을 수 있는 메소드
	// 내부에서만 처리하려면 public 처리 안해도 됨. 하지만 보통 싱글톤 처리를 하면 public으로 처리 
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	
	// 정보 저장: 배열에 친구 정보를 저장하는 기능
	// 1.배열에 저장 메소드 다형성을 이용해서 하나의 메소드로 정의 addInfor(상위 클래스타입의 매개변수)
	// 2. 사용자에게 받은 데이터를 인스턴스로 생성 메소드
	// 입력의 구분 -> 구분에 따라 인스턴스 생성도 구분이 되어야 한다. -> addInfor() 메소드를 이용해서 정보를 저장

	// 배열의 전화번호(상위) 정보를 저장하는 메소드 생성
	private void addInfor(PhoneInfor info) { // 반환값 없음.
		//phoneBook[cnt++] = info; // 상위 클래스에서 받은 값을 phoneBook 배열에 넣어줌.
		
		// List에 정보 저장
		phoneBook.add(info);
	}

	// 기능: 1. 저장, 2. 검색, 3. 삭제

	// 1.2. 저장 기능
	// 사용자로부터 데이터를 받아 ->
	// 인스턴스를 생성 ->
	// 배열에 생성된 인스턴스의 참조값을 저장: 저장 index는 -> cnt를 이용 -> 저장 후에는 cnt++ 처리

	// 전화번호 정보를 인스턴스 생성하고 배열에 저장
	public void insertInfo() {
		
		// 100개 입력 완료(인덱스 0~99) -> cnt = 100
		// phoneBook[100] -> 오류 발생
		// 배열의 개수와 입력된 요소의 개수를 비교
//		if(phoneBook.length==cnt) {
//			System.out.println("\n-----더이상 정보를 저장할 수 없습니다.-----");
//			System.out.println("일부 정보를 삭제하고 저장 공간을 확보해주세요.");
//		}
		
		// List는 저장공간이 부족하면 자동으로 저장공간을 확장
		
		
		int select = 0;
		
		while(true) {
			System.out.println("어떤 정보를 입력하시겠습니까?");
		//	System.out.println(" 1. 기본"); // 추상 클래스로 -> 인스턴스 생성불가
			System.out.println(Menu.UNIV+". 대학 ");
			System.out.println(Menu.COM+". 회사");
			System.out.println(Menu.CAFE+". 동호회");	
			
			try {
				select = SC.nextInt(); // char 타입으로 만들어도 됨.
		
				//SC.nextLine();
		
				// 메뉴가 잘못 입력된 경우
				if ( !(select > 0 && select <4) ) {
					//System.out.println("입력이 잘못되었습니다.");
					//System.out.println("초기 메뉴로 돌아갑니다.");
					//return;
					
					// 20.10.26 추가
					BadInputException e= new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못된 메뉴를 입력했습ㄴ다. 다시 선택해주세요.");
				SC.nextLine();
				continue;
			}
			break;
		}
		
		SC.nextLine();

		System.out.println("정보 입력을 시작합니다.");
		System.out.println("이름 >> ");
		String name = SC.nextLine();
		System.out.println("전화번호 >> ");
		String phoneNumber = SC.nextLine();
		System.out.println("주소 >> ");
		String address = SC.nextLine();
		System.out.println("이메일 주소 >> ");
		String email = SC.nextLine();

		// switch / if-else 도 사용가능
		switch (select) {
//		case 1:
//			// 인스턴스 생성 -> 배열에 저장
//			addInfor(new PhoneInfor4(name, phoneNumber, address, email));
//			break;
		case Menu.UNIV:
			// 추가 정보를 받고 -> 인스턴스 생성 -> 배열에 저장
			// 전공과 학년 정보를 추가로 받음
			System.out.println("전공 >> ");
			String major = SC.nextLine();
			System.out.println("학년 >> ");
			int grade = SC.nextInt();

			addInfor(new PhoneUnivInfor(name, phoneNumber, address, email, major, grade));
			break;
		case Menu.COM:
			// 추가 정보를 받고 -> 인스턴스 생성 -> 배열에 저장
			System.out.println("회사명 >> ");
			String company = SC.nextLine();

			addInfor(new PhoneCompanyInfor(name, phoneNumber, address, email, company));
			break;
		case Menu.CAFE:
			// 추가 정보를 받고 -> 인스턴스 생성 -> 배열에 저장
			System.out.println("동호회 이름 >> ");
			String cafeName = SC.nextLine();
			System.out.println("닉네임 >> ");
			String nickName = SC.nextLine();

			addInfor(new PhoneCafeInfor(name, phoneNumber, address, email, cafeName, nickName));

			break;
		}

		System.out.println("입력하신 정보가 저장되었습니다. (저장된 정보의 개수: " + phoneBook.size() + ")");
		

	}

	// 정보 검색

	// 배열의 인덱스를 찾는 메소드가 필요	
	private int searchIndex(String name) { // searchIndex는 외부에서 보여지지 않는게 좋다.
		int index = -1; // 정보가 없을 경우

		for (int i = 0; i < phoneBook.size(); i++) {
			// 이름으로 비교해야 함.
			if (phoneBook.get(i).getName().equals(name)) {
				index = i;
			}
		}
		return index;
	}
	
	// 해당 인덱스의 참조 변수로 정보 출력 -> 사용자가 입력한 이름으로 검색
	public void searchInfor(){
		
		if(phoneBook.size()==0) {
			System.out.println("\n입력하신 정보가 없습니다.");
			return;
		}
		
		SC.nextLine();
		
		System.out.println("\n-----검색하실 이름을 입력해주세요.-----");
		String name = SC.nextLine();
		
		int index = searchIndex(name); // name 값을 받아서 -1 이나 결과를 찾았다면 그 값을 반환
		
		if(index<0) {
			System.out.println("검색하신 "+name+"의 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
		} else {
			System.out.println("\n-----검색 결과-----");
			phoneBook.get(index).showInfor();
		}
	}

	// 삭제 기능: 사용자에게 이름을 입력 받고 이름으로 검색한 뒤 정보를 삭제  -> 인덱스를 찾아 
	public void deleteInfor() {
		
		if(phoneBook.size()==0) {
			System.out.println("\n삭제할 정보가 없습니다.");
			return;
		}
		
		SC.nextLine();
		
		System.out.println("\n-----삭제하고자 하는 이름을 입력해주세요.-----");
		String name = SC.nextLine();
		
		int index = searchIndex(name);
		if(index<0) {
			System.out.println("찾으시는 "+name+"의 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
			
		} else {
			// 배열의 요소를 왼쪼으로 시프트(이동)
//			for(int i=index; i<cnt-1; i++) { // 왼쪽에 있는 값을 가져와야 하기 때문에 cnt-1
//				phoneBook[i] = phoneBook[i+1];
//			}
//			cnt--; 		// 저장된 개수를 감소
			
			// List의 요소 삭제는 인덱스의 시프트로 이루어진다.
			phoneBook.remove(index);
			System.out.println("요청하신 정보가 삭제되었습니다.");
		}
	}
	
	// 전체 정보를 출력하는 메소드
	public void showAllInfor() {
		
		if(phoneBook.size()==0) {
			System.out.println("\n출력할 정보가 없습니다.");
			return;
		}
		
		System.out.println("\n-----전체 정보를 출력합니다.-----");
		
		for(int i=0; i<phoneBook.size(); i++) {
			phoneBook.get(i).showInfor();
			System.out.println("-----------");
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
