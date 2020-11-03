package miniminigame;

import java.util.List;

public class Rank implements Comparable{
	
	
	List<RankData> rdata;
	
	// 내부 인스턴스 생성 
	private static Rank rank = new Rank();
	
	// 외부에서 참조변수 받기 위함
	public static Rank getInstance() {
		return rank;
	}
	
	// 배열에 이긴거 저장
	private void addWin(RankData win) {
		rdata.add(win);
	}
	
	
	
	
	
	

}
