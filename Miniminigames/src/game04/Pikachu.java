package game04;

public class Pikachu {
	
	private int experience = 0;
	private int HP = 70;
	private int level = 1; 
	
	public void eat() {
		System.out.println("맛있다 피까~ HP Up!!");
	}
	
	public void sleep() {
		System.out.println("zzZ.. HP Up!!");
	}
	
	public void play() {
		System.out.println("재밌다 피까~ experience UP!!");
		System.out.println("힘들다 피까.. HP Down..");
	}
	
	public void train() {
		System.out.println("힘들다 피까.. HP Down..");
		System.out.println("보람차다 피까!! experience UP!!");
	}
	
	public void levelUP() {
		}
	
	public boolean finish() {
		boolean returnValue = true;
		
		if(level > 4) {
			System.out.println("피카츄가 라이츄로 진화했다!!");
			
			returnValue = false;
		}else if(HP < 0) {
			System.out.println("피카츄가 죽었다....");
			
			returnValue = false;
		}
		return returnValue;
	}
	
	public void showData() {
		System.out.println("====================");
		System.out.println("/t피 카 츄/t");
		System.out.println("경험치 : " + experience);
		System.out.println("체력 : " + HP);
		System.out.println("레벨 : " + level);
		System.out.println("====================");
	}
	
	
}
