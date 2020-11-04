package miniminigame;

import java.util.List;

import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;

public class RankManager {
	
	MemberInfoManager member = MemberInfoManager.getManager();
	
	// sort한거 저장하는 배열
	MemberInfo [] rank;
	
	
	
	// 승률 구하기
	float winRate = (float)(winLose/gamenum))*100;
	
	// 유저별 점수 얻어서 
	public void sortScore() {
		
		for(int i=0; i < member.updateScore(winLose, gamenum); i++) {
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
