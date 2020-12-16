package exam;

public class Child2 {
	/*
	 * 구슬치기 어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다. 놀이를 통한 구슬을 주고받음을 표현하는 메서드가 존재한다. 두 번째
	 * 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의미하는 것이다.
	 */

	// 변수: player와 구슬 개수가 필요
	String name;
	int numOfMarble;

	// 메서드: player의 이름과 구슬의 개수를 설정하는 메서드
	void setData(String childName, int num) { // 이름과 구슬의 값을 받음
		name = childName;
		numOfMarble = num;
	}

	// 게임의 결과가 졌을 경우 -> 구슬의 개수가 감소
	void lose(int num) { // int num -> 구슬이 몇 개가 감소하였는지
		numOfMarble -= num;
	}

	// 게임의 결과가 이겼을 경우 -> 구슬의 개수가 증가
	void win(int num) {
		numOfMarble += num;
	}

	// 게임 후 승리 메서드: 게임할 대상(상대방), 구슬의 개수 필요
	void playWin(Child2 child, int num) { // child(상대방)가 필요하고 구슬 몇 개의 정보가 필요하다
		// 내가 이겼을 경우
		win(num);
		// 내가 이겼을 경우 -> 상대방은 게임에서 짐
		child.lose(num); // child-> 상대방 값을 불러와야 해서 child를 호출
	}

	// 구슬의 개수를 출력하는 메서드
	void showData() {
		System.out.println(name + "의 현재 구슬의 보유 개수: " + numOfMarble);
	}

	public static void main(String[] args) {
		// 조건을 만족하는 클래스를 정의하였다면, 다음 조건을 만족하는 인스턴스를 각각 생성하자.
		Child2 child1 = new Child2(); // 객체1을 생성 메모리에 등록
		Child2 child2 = new Child2(); // 새로운 객체 2 생성
		
		// 어린이1의 보유자산 구슬 20개 / 어린이2의 보유자산 구슬 10개
		child1.setData("어린이1", 20);
		child2.setData("어린이2", 10);
		
		System.out.println("게임 시작할 때의 어린이들이 보유한 구슬 정보");
		child1.showData();
		child2.showData();
		
		// 인스턴스 생성이 완료되면 다음의 상황을 main 메서드 내에서 시뮬레이션 하자.
		// 1차 게임에서 어린이1은 어린이2의 구슬 2개를 획득한다.
		
		child1.playWin(child2, 2);
		System.out.println("\n 1차 게임: 어린이 1이 승리해서 2개를 획득");
		child1.showData();
		child2.showData();
		
		// 2차 게임에서 어린이 2는 어린이 1의 구슬 7개를 획득했다.
		child2.playWin(child1, 7);
		System.out.println("\n 2차 게임: 어린이 2가 승리해서 7개를 획득");
		child1.showData();
		child2.showData();
		
		// 게임 종료 후 어린이들의 최종 보유 구슬 개수
		System.out.println("\n어린이들의 최종 구슬 보유 개수");
		child1.showData();
		child2.showData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
