package game04;

import memberInfo.MemberInfoManager;

public class Electric implements PoketMonster {
	
	MemberInfoManager members = MemberInfoManager.getManager();
	
	private int experience = 0;
	private int HP = 70;
	private int level = 1; 
	
	@Override
	public void eat() {
		if(HP > 149) {
			System.out.println("더 이상 체력을 보충할 수 없습니다");
			
			return;
		}
		HP += 20;
		
		System.out.println("맛있다 피까~ HP 20 Up!!");
	}
	
	@Override
	public void sleep() {
		if(HP > 149) {
			System.out.println("더 이상 체력을 보충할 수 없습니다");
			
			return;
		}
		HP += 30;
		
		System.out.println("zzZ.. HP 30 Up!!");
	}
	
	@Override
	public void play() {
		experience += 20;
		HP -= 20;
		
		System.out.println("재밌다 피까~ experience 20 UP!!");
		System.out.println("힘들다 피까.. HP 20 Down..");
	}
	
	@Override
	public void train() {
		HP -= 30;
		experience += 30;
		
		System.out.println("힘들다 피까.. HP 30 Down..");
		System.out.println("보람차다 피까!! experience 30 UP!!");
	}
	
	@Override
	public void levelUp() {
		if(experience > 80) {
			experience -= 40;
			level++;
			
			System.out.println("레벨이 올랐다!!" + level);
		}
	}
	
	@Override
	public boolean finish() {	
		if(level > 4) {
			System.out.println("피카츄가 라이츄로 진화했다!!");
			System.out.println("Congratulation!! You Success");
			System.out.println("++ 100Point");
			
			members.updatePoint(100);
			members.updateScore(4, 0);
			
			return false;
			
		}else if(HP < 0) {
			System.out.println("피카츄가 죽었다....");
			System.out.println("You Fail....");
			
			members.updateScore(4, 1);
			
			System.out.println("메인으로 돌아갑니다");
			
			return false;
		}
		return true;
	}
	
	@Override
	public void showData() {
		System.out.println("=========================");
		System.out.println("\t피 카 츄\t");
		System.out.println("\t경험치 : " + experience + "\t");
		System.out.println("\t체력 : " + HP + "\t");
		System.out.println("\t레벨 : " + level + "\t");
		System.out.println("=========================");
	}
	
	
}
