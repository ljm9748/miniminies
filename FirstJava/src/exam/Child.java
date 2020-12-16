package exam;

public class Child {
	/* 다음조건을 만족하는 클래스를 구성하자. 구슬치기 어린아이가 소유하고 있는 구슬의 개수 정보를 담을 수 있다. 놀이를 통한 구슬을 주고받음을
	 * 표현하는 메서드가 존재한다. 두 번째 조건은 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음을 의미하는 것이다.*/
	int numOfMarble;
	String name; // player의 이름

	// 어린이의 이름과 구슬의 개수를 설정하는 메서드
	void setChild(String childName, int num) { // 이름과 구슬 수의 값을 받음
		name = childName;
		numOfMarble = num;
	}

	// 게임의 결과가 졌을 경우 -> 구슬의 개수를 감소
	void lose(int num) { // int num -> 몇 개를 잃었는지
		numOfMarble -= num;
	}

	// 게임의 결과가 이겼을 경우 -> 구슬의 개수를 증가
	void win(int num) {
		numOfMarble += num;
	}

	// 게임 후 승리 메서드: 게임할 대상(상대방 Child), num(구슬의 개수)
	void playWin(Child child, int num) { // 상대방 child가 필요하고 구슬 몇 개(num)
		// 나는 승리 -> 나의 구슬의 개수는 증가
		win(num); // 
		// 상대방은 패배 -> 구슬을 감소
		child.lose(num);
	}//
	
	// 구슬의 개수를 출력하는 메서드
	void showData() {
		System.out.println(name + "의 현재 구슬의 보유 개수: " + numOfMarble);
	}
	
	
	
	public static void main(String[] args) {
		/*
		  조건을 만족하는 클래스를 정의하였다면, 다음조건을 만족하는 인스턴스를 각각 생성하자. (하나의 클래스만 작성하자 ) */
		Child child1 = new Child(); // 객체1 생성메모리에 등록
		Child child2 = new Child(); // 새로운 객체2 생성
		 
		/* 어린이 1의  보유자산 구슬 15개
		  * 어린이 2의  보유자산 구슬 9개 */
		child1.setChild("어린이1", 15); // 15 - > 17 ->10
		child2.setChild("어린이2", 9);  // 9 -> 7 -> 14
		
		System.out.println("게임 시작할 때의 어린이들이 보유한 구슬의 정보");
					
		/*  인스턴스의 생성이 완료되면 다음의 상황을 main 메서드 내에서 	 
		 *  시뮬레이션 하자. * “1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다” */
		child1.playWin(child2, 2); // (나랑 게임한 상대방, 획득 구슬 개수)
		System.out.println("\n1차 게임: 어린이 1이 승리해서 2개를 획득");
		child1.showData();
		child2.showData();
		
		 /*  “2차 게임에서 어린이 2는 어린이 1의 구슬  7개를 획득한다.” */
		child2.playWin(child1, 7);
		System.out.println("\n2차 게임: 어린이 2이 승리해서 7개를 획득");
		child1.showData();
		child2.showData();
		
		 /* * 마지막으로 각각의 어린이의 보유 구슬의 개수를 출력하고 프로그램 종료.
		 */
		System.out.println("\n어린이들의 최종 구슬 보유 개수");
		child1.showData();
		child2.showData();
	}

}
