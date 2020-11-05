package memberInfo;

import java.util.ArrayList;
import java.util.List;

import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;

public class RankInfo implements Comparable<RankInfo>{
	
	MemberInfoManager manager = MemberInfoManager.getManager();
	
	private int nowscore;
	private String name;
	
	
	public RankInfo(int nowscore, String name) {
		this.nowscore = nowscore;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(RankInfo rankInfo) {
		if(this.nowscore == rankInfo.nowscore) {
			return 0;
		}else if (this.nowscore < rankInfo.nowscore) {
			return -1;
		}else
			return 1;
			}
	

}

 public static
	
	// sort한거 저장
	// game1 data sort
	public void sortGame1() {
		List<RankInfo> game1Rank = new ArrayList<RankInfo>() {
			game1Rank.add(getscore(1.0));
		};
		
		
		
	}
	// game2 data sort
	public void sortGame2() {
		List<RankInfo> game2Rank = new ArrayList<>() {{
			
		}};
		
	}
	// game3 data sort
	public void sortGame3() {
		 List<RankInfo> game3Rank = new ArrayList<>(){{
			 
		 }};
	}
	
	
	// totalRank용 sort -> 승률 이용하기
	public void sortTotal() {
		
	}
	
	
	
	
public void showEachGameRank() {
		
		int[] new_grade = new int[score.length]; 
		for(int i=0; i < score.length; i++) { 
			new_grade[rank[i]-1] = score[i];
			} 
		for(int i=0; i< score.length; i++) { 
			System.out.println((i+1) + "등 : " + name + updateScore[i]); 
			}
	}
	
	

	
//  유저별 점수 얻어서 rank 구하기 (점수로 정렬)
//	public void sortScore() {
//		
//		for(int i=0; i < manager.getMembers().size(); i++) {
//			for(int j=0; j < manager.getMembers().size(); j++) {
//				if(manager.updateScore[i] < manager.updateScore[j]) {
//					game1Rank[i]++;
//				}
//			}
//		}
//	}
//	
//	float WinRate(){
//		// 승률 구하기
//		float winRate = (float)(winLose/gamenum))*100;
//	}
//	
//	// 게임별 랭킹 보기 (등수 포함해서)
//	public void showEachGameRank() {
//		
//		int[] new_grade = new int[score.length]; 
//		for(int i=0; i < score.length; i++) { 
//			new_grade[rank[i]-1] = score[i];
//			} 
//		for(int i=0; i< score.length; i++) { 
//			System.out.println((i+1) + "등 : " + updateScore[i]); 
//			}
//	}
//	
//	// 포인트 합산한 랭킹보기 
//	public void showTotalRank() {
//		
//	}
	
}
