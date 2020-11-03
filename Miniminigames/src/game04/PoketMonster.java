package game04;

public class PoketMonster {
	
	public String name;
	public int HP;
	public int experience;
	public int level;
	
	
	public PoketMonster() {
		System.out.println("Start!!");
	}
	
	public void eat() {
		HP += 20;
	}
	
	public void sleep() {
		HP += 30;		
	}
	
	public void play() {
		experience += 20;
		HP -= 20;
	}
	
	public void train() {
		HP -= 30;
		experience += 30;
	}
	
	public void levelUp() {
		if(experience > 70) {
			experience -= 40;
			level++;
			
			System.out.println("레벨 업!!" + level);
		}
	}
	
	public void showData() {
		System.out.println("====================");
		System.out.println("\t" + name + "\t");
		System.out.println("경험치 : " + experience);
		System.out.println("체력 : " + HP);
		System.out.println("레벨 : " + level);
		System.out.println("====================");
	}
	

}
