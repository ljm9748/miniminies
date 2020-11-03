package miniminigame;

public class RankData {
	
	private int numOfGame;
	private String user;
	private int numOfWin;
	private float winningRate = (float)(numOfWin / numOfGame)*100;
	

	public RankData(int numOfGame, String user, int numOfWin, float winningRate) {
		this.numOfGame = numOfGame;
		this.user = user;
		this.numOfWin = numOfWin;
		this.winningRate = winningRate;
	}

	public int getNnumOfGame() {
		return numOfGame;
	}


	public void setNumOfGame(int numOfGame) {
		this.numOfGame = numOfGame;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public int getNumOfWin() {
		return numOfWin;
	}


	public void setNumOfWin(int numOfWin) {
		this.numOfWin = numOfWin;
	}
	
	public float getWinningRate() {
		return winningRate;
	}


	public void setWinningRate(float winningRate) {
		this.winningRate = winningRate;
	}


	public void showAllGameWin () {
		System.out.println("이름: " + user + "총 플레이한 게임 횟수: "+numOfGame+ "게임이긴횟수: " + numOfWin);
		System.out.println("승률: " + winningRate + "%");
	}
	
	
	
}
