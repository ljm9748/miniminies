package memberInfo;

import java.util.List;

public class Rank {
	
		// sort한거 저장하는 배열
		MemberInfo [] rank;
		
		Rank(int size){
			rank = new MemberInfo[size++];
		}
		
		// 유저별 점수 얻어서 sortscore하기
		public void sortScore() {
			
			for(int i=0; i < score.length; i++) {
				for(int j=0; j < score.length; j++) {
					if(score[i]<score[j]) {
						rank[i]++;
					}
				}
			}
		}
		
		public void 

}
