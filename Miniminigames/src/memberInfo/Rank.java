package memberInfo;

import java.util.List;
import memberInfo.MemberInfo;
import memberInfo.MemberInfoManager;

public class Rank {
	
	MemberInfoManager manager = MemberInfoManager.getManager();
	
		// sort한거 저장하는 배열
		MemberInfo [] rank;
		
		Rank(int size){
			rank = new MemberInfo[size++];
		}
		
		// 유저별 점수 얻어서 sort score하기
		public void sortScore() {
			
			for(int i=0; i <manager.getMembers().size(); i++) {
				for(int j=0; j < manager.getMembers().size(); j++) {
					if( manager.getMembers()[i] < manager.getMembers()[j]) {
						rank[i]++;
					}
				}
			}
		}
		
		public void showEachGameRank() {
			
			int[] new_grade = new int[manager.getMembers().size()]; 
			for(int i=0; i < manager.getMembers().size(); i++) { 
				new_grade[rank[i]-1] = rank[i];
				} 
			for(int i=0; i< manager.getMembers().size(); i++) { 
				System.out.println((i+1) + "등 : " + updateScore[i]); 
				}
		}

}
