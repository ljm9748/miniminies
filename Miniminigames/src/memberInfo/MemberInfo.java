package memberInfo;

import java.io.Serializable;

public class MemberInfo implements Serializable{
	
	private String name;
	private String id;
	private String password;
	
	private int point;
	private int life;
	int[][] score;
	// {{게임1 이긴 횟주, 진 횟수}, {게임2 이긴횟수, 진횟수}, {게임3 이긴횟수, 진횟수}}
	
	
	public MemberInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
		
		this.point = 0;
		this.life = 3;
		this.score = new int[4][2]; 

	}
	
	
	public MemberInfo(String name, int[][] score) {
		this.name = name;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getPoint() {
		return point;
	}



	public void setPoint(int point) {
		this.point = point;
	}



	public int getLife() {
		return life;
	}



	public void setLife(int life) {
		this.life = life;
	}



	public String getId() {
		return id;
	}
	


	public int getScore(int game, int winLose) {//게임번호, 이겼는지 졌는지 (이기면 0 지면 1->이후에 상수화 필요!)
		return score[game-1][winLose];
	}


	public void setScore(int game, int winLose, int changedScore) {
		this.score[game-1][winLose] = changedScore;
	}


	public void showInfo() {
		System.out.println("이름: " +name);
		System.out.println("아이디: " +id);
		//System.out.println("비밀번호: " +password);//개발용
		System.out.println("포인트: " +point);
		System.out.println("목숨: " +life);
		for (int i = 0; i < score.length; i++) {
			//이후에 게임명 리스트화해서 게임명으로 변환하기
			System.out.printf("%d번게임 이긴횟수: %d회, %d번게임 진횟수: %d회", i+1, score[i][0], i+1, score[i][1]);
			System.out.println();
		}
		
	}
	




}

