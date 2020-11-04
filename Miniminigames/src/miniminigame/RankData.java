package miniminigame;

import java.util.List;

import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;

public class RankData {
	
	MemberInfoManager member = MemberInfoManager.getManager();
	
	float winRate = (float)(winLose/gamenum))*100;
	
	public void sortScore() {
		for(int i=0; i<score.length; i++) {
			for(int j=0; j < score.length; j++) {
				if(score[i]<score[j]) {
					rank[i]++;
				}
			}
		}
		
	
	}
	
	// 게임별 랭킹 보기
	public void showEachGameRank() {
		
	}
	
	// 포인트 합산한 랭킹보기 
	public void showTotalRank() {
		
	}
	
}
