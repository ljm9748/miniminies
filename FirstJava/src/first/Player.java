package first;

public abstract class Player {
	// 추상클래스: 클래스의 멤버 메소드 중 하나라도 추상메소드를 가지면 추상클래스가 된다.

	// 추상메소드: 구현하는 {} 구현부가 없는 메소드,
	// 메소드 정의부에 abstract 키워드를 써준다.
	// 문장 마지막에는 ;으로 종료
	abstract void play(int num);
	abstract void stop();

}

abstract class VideoPlayer extends Player {
	// 추상 클래스를 상속해서 추상메소드, Play, stop을 가진다.
	// VideoPlayer 클래스도 추상클래스이다.
}

class AudioPlayer extends Player{	//인스턴스 생성 가능

	// 추상클래스(상위 클래스)의 play(int num) 메소드를 오버라이딩 -> 구현한다.
	void play(int num) {
		
	}
	
	void stop() {
		
	}
}
