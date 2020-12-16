package array;

public class User {
	
	// "사용자"의 데이터를 저장: 이름, 아이디(숫자로 저장)
	// 손흥민(1), 박지성(2), 
	int id;			// 사용자의 아이디
	String name;	// 사용자의 이름
	
	// 생성자
	User(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	// 출력 메소드
	void showData() {
		System.out.println(name + "(" + id + ")"); 		// 손흥민(1) 처럼 출력 되게끔
	}

}
