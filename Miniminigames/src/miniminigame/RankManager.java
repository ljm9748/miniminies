package miniminigame;

import java.util.ArrayList;

import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;

public class RankManager {
	
	MemberInfoManager manager = MemberInfoManager.getManager();
	
	// sort한거 저장
	 ArrayList game1Rank = new ArrayList();
	 ArrayList game2Rank = new ArrayList();
	 ArrayList game3Rank = new ArrayList();
	
	 ArrayList totalRank = new ArrayList();
	
	 game1Rank.add
	
	// 유저별 점수 얻어서 rank 구하기
	public void sortScore() {
		
		for(int i=0; i < manager.getMembers().size(); i++) {
			for(int j=0; j < manager.getMembers().size(); j++) {
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
	}
	
	float WinRate(){
		// 승률 구하기
		float winRate = (float)(winLose/gamenum))*100;
	}
	
	// 게임별 랭킹 보기
	public void showEachGameRank() {
		
		int[] new_grade = new int[score.length]; 
		for(int i=0; i < score.length; i++) { 
			new_grade[rank[i]-1] = score[i];
			} 
		for(int i=0; i< score.length; i++) { 
			System.out.println((i+1) + "등 : " + updateScore[i]); 
			}
	}
	
	// 포인트 합산한 랭킹보기 
	public void showTotalRank() {
		
	}
	
}
