package miniminigame;

import java.util.ArrayList;

import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;

public class RankManager {
	
	MemberInfoManager manager = MemberInfoManager.getManager();
	
	// 게임별 승패 불러오
	
	
	// sort한거 저장
	 ArrayList game1Rank = new ArrayList();
	 ArrayList game2Rank = new ArrayList();
	 ArrayList game3Rank = new ArrayList();
	
	 ArrayList totalRank = new ArrayList();
	 
	 
	 private void addRank(MemberInfo rank) {

	 }
	
	 // game1 sort
	public void sortGame1() {
		
	}
	// game2 sort
	public void sortGame2() {
		
	}
	// game3 sort
	public void sortGame3() {
		
	}
	
	
	// totalRank용 sort -> 승률 이용하기
	public void sortTotal() {
		
	}
	
	
	// 출력
	public void showTotalRank() {
		
		
		
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
