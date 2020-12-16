package ver03;

import java.util.Scanner;

public class PhoneBookManager implements Util{
//	 배열: 전화번호 정보(이름, 전화번호, 생일)를 저장하는 목적
	
	// 사용자로부터 데이터를 받는다.
	//Scanner s = new Scanner(System.in);
	
//	Util3.sc.nextLine();
//	new PhoneBookManager3;
	
	// 정보 저장을 위한 배열선언
	final PhoneInfor[] phoneBook; // 인스턴스 변수로 저장 -> 메소드들이 PHoneInfor[] phonebook을 대상으로 처리가 됨
	int cnt; 				// 저장된 정보의 개수: 반복의 횟수 사용, 배열의 새로운 데이터 입력 시 index로도 사용 가능 //1
	
	//Scanner sc; //5
	
	
	// 초기화(생성자 이용)
	public PhoneBookManager(){
		//phonebook = new PhoneInfor[100];	// PhoneInfor 배열의 저장공간을 100개 생성 // 2
		this(100); 		// size에 100이 들어감.
	}
	
	// 생성자의 오버로딩 이용
	PhoneBookManager(int size) {
		phoneBook = new PhoneInfor[size]; //3
		//sc = new Scanner(System.in);
	}
	
	
	
	
	// 기능: 1. 저장, 2. 검색, 3. 삭제 
	
//	 저장 기능 //4
	// 사용자로부터 데이터를 받아 ->	
	// 인스턴스를 생성 -> 
	// 배열에 생성된 인스턴스의 참조값을 저장: 저장 index는 -> cnt를 이용 -> 저장 후에는 cnt++ 처리
	
	void insertMember() { // 사용자로부터 데이터를 받기 때문에 매개변수는 필요 x 
		System.out.println("친구 정보 입력을 시작합니다.");
		
		// 이름 입력 받기 
		System.out.println("이름 >> ");
		String name = SC.nextLine();
		
		// 전화번호 받기
		System.out.println("전화번호 >> ");
		String phoneNum =SC.nextLine();
		
		// 생일 받기
		System.out.println("생일 >> ");
		String birthday = SC.nextLine().trim(); // trim -> 앞뒤 공백을 지운 후 값을 저장
		
		
//		인스턴스 생성 // 6
		// 배열에 저장하기 위한 인스턴스의 참조 변수 선언
		PhoneInfor infor = null;
		
		// 생일이 입력되었는지 여부에 따라 인스턴스 생성을 다르게 처리
		if(birthday != null && birthday.length()>0) { // null 값이 아니고 length가 0보다 크다 	
			infor = new PhoneInfor(name, phoneNum, birthday);
		} else {
			infor = new PhoneInfor(name, phoneNum);			
		}
		
		phoneBook[cnt] = infor;		// phoneBook[0] = 0x111; -> phoneBook[0] -> 참조변수
		cnt++; 	// 추가된 정보의 개수 + 1
		

	}
//	검색 기능
	// 배열에서 찾는다 -> index를 먼저 찾아야 한다.
	// 검색하고자 하는 이름을 사용자로부터 받고 
	// 배열의 요소(참조 값 -> 인스턴스 참조) PhoneInfor.name 변수의 값과 검색 이름을 비교(동등 비교)		
	// 해당 index를 찾을 수 있다.
	// 검색된 인덱스로 정보를 출력
	
	void searchMember() {
		
		if(cnt==0) {
			System.out.println("저장된 데이터가 없습니다. 다시 메뉴로 이동합니다.");
			return; // 메소드의 종료
		}
			
		// 찾고자 하는 이름을 받는다.
		System.out.println("정보 검색을 시작합니다.");
		System.out.println("찾고자 하는 이름을 입력해주세요.: ");
		String name = SC.nextLine();
		
		//이름을 요소 index 검색
		//int index = -1;
		int index = searchIndex(name);
		
		
		
		// 검색: index를 찾는다 -> 반복
//		for(int i=0; i<cnt; i++) {
//			if(phoneBook[i].name.equals(name)) {		// phoneBook-> phoneInfor 타입의  참조변수
//			// 찾고자 하는 이름을 값으로 넣어서 논리값을 가져옴.
//			index = i;
//			break;
//			}
//		}
		
		
		if(index<0) { // 
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			// 정보의 출력
			phoneBook[index].showInfor();
		}		
	}
	
	//	이름 문자열을 받아서,
	// 배열의 정보와 비교하고, 
	// index를 찾아서 반환하는 메소드
	int searchIndex(String name) {
		int result = -1;
		
		// 검색: index를 찾는다 -> 반복
		for(int i=0; i<cnt; i++) {
			if(phoneBook[i].name.equals(name)) {		// phoneBook-> phoneInfor 타입의  참조변수
			// 찾고자 하는 이름을 값으로 넣어서 논리값을 가져옴.
			result = i;
			break;
			}
			
		}	
		
		return result;
	}
	
	
	
	
	
//	정보 삭제
	// 삭제하고자 하는 이름을 사용자로부터 받는다 -> 
	// 배열에서 이름으로 검색해서 index를 찾는다.
	// 배열에서 찾은 index의 참조값을 삭제: 인스턴스는 찹조하는 참조 변수가 없으면 삭제된다.
	// 참조값에 null을 입력하거나, 다른 주소값을 입력 -> 이전에 있던 참조값은 없어진다.
	// 삭제대상의 index 부터 왼쪽으로 값을 shift 처리 	
	// cnt-1 
	void deleteMember() {
		
		System.out.println("정보 삭제를 진행합니다.");
		System.out.println("삭제 하고자 하는 정보의 이름을 입력해주세요.");
		String name = SC.nextLine();
		
		//이름을 요소 index 검색
			int index = -1;
				
			// 검색: index를 찾는다 -> 반복
			for(int i=0; i<cnt; i++) {
				if(phoneBook[i].name.equals(name)) {		// phoneBook-> phoneInfor 타입의  참조변수
				// 찾고자 하는 이름을 값으로 넣어서 논리값을 가져옴.
				index = i;
				break;
				}
			}
				
			if(index<0) {
				System.out.println("삭제 하고자 하는 정보가 존재하지 않습니다.");
			} else {
				// 삭제 처리 진행: 삭제해야 하는 index부터 왼쪽으로 shift 처리
				// index = 3;
				// phoneBook[3] = phoneBook[4];
				// phoneBook[4] = phoneBook[5];
					
				for(int i=index; i<cnt-1; i++) {
					phoneBook[i] = phoneBook[i+1];
				}
					
				cnt--;
					
				System.out.println("정보를 삭제했습니다.");
			}
			 	
		
	}
	// 전체 정보 출력
	void displayAll() {
		if(cnt==0 ) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		
		System.out.println("전체 정보를 출력합니다.("+cnt+")");
		System.out.println("-------------------");
		
		for(int i=0; i<cnt; i++) {
			phoneBook[i].showInfor();
			System.out.println("-------------------");
		}
		
	}
}
