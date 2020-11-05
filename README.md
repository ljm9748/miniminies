# miniminies
자바를 이용해서 만드는 미니미니게임천국

✔UseCaseDiagram
![image](https://user-images.githubusercontent.com/41908152/98191426-7a0c2280-1f5c-11eb-96dd-64ea348fe125.png)
✔ClassDiagram
![image](https://user-images.githubusercontent.com/41908152/98191434-81333080-1f5c-11eb-9d8f-a376cc03a69a.png)

✔산출뭏
![image](https://user-images.githubusercontent.com/41908152/98191782-4382d780-1f5d-11eb-8cb4-e3a6e201d905.png)
![image](https://user-images.githubusercontent.com/41908152/98191791-47165e80-1f5d-11eb-880e-593aca5c0425.png)
![image](https://user-images.githubusercontent.com/41908152/98191808-4da4d600-1f5d-11eb-80d9-a352a0966a45.png)
![image](https://user-images.githubusercontent.com/41908152/98191881-7a58ed80-1f5d-11eb-8903-b53a8b7c7278.png)
![image](https://user-images.githubusercontent.com/41908152/98191876-77f69380-1f5d-11eb-9de3-b67e12a79f94.png)
![image](https://user-images.githubusercontent.com/41908152/98191909-80e76500-1f5d-11eb-98b4-e5c1b7369249.png)
![image](https://user-images.githubusercontent.com/41908152/98191953-83e25580-1f5d-11eb-9ff5-b82bbf523d26.png)
![image](https://user-images.githubusercontent.com/41908152/98191890-7d53de00-1f5d-11eb-92dc-4c848ae69321.png)
![image](https://user-images.githubusercontent.com/41908152/98191966-86dd4600-1f5d-11eb-8b47-732045b51672.png)
![image](https://user-images.githubusercontent.com/41908152/98191982-8e9cea80-1f5d-11eb-97c4-e461ba89a637.png)
![image](https://user-images.githubusercontent.com/41908152/98191988-92c90800-1f5d-11eb-9e95-75b4fffcfd0f.png)
![image](https://user-images.githubusercontent.com/41908152/98192005-978dbc00-1f5d-11eb-91a4-7a4826590759.png)
### MemberInfo.java

```java
public class MemberInfo implements Serializable{
	
	private String name;
	private String id;
	private String password;
	
	private int point;
	private int life;
	int[][] score;
	// {{게임1 이긴 횟주, 진 횟수}, {게임2 이긴횟수, 진횟수}, {게임3 이긴횟수, 진횟수}}

	//승패 불러오기, 갱신하기
	public int getScore(int game, int winLose) {//게임번호, 이겼는지 졌는지 (이기면 0 지면 1->이후에 상수화 필요!)
		return score[game-1][winLose];
	}
	public void setScore(int game, int winLose, int changedScore) {
		this.score[game-1][winLose] = changedScore;
	}

	public void showInfo(); //회원의 정보를 표시하는 함수
	public void showWin(); //회원의 승패정보 

```

### MemberInfoManager.java

```java
public class MemberInfoManager implements Util{
	int membernum;

	List<MemberInfo> members;
	private MemberInfoManager() {
		members = new ArrayList<MemberInfo>();	//리스트 형식의 members초기화
		membernum=-1;
		load();								  	       //파일에서 인스턴스 로드
	}

	//인스턴스 생성
	private static MemberInfoManager manager = new MemberInfoManager();
	//getter
	public static MemberInfoManager getManager() {
		return manager;
	}

	//메서드

	//로드, 저장
	private void load(); //파일에서 인스턴스 로드
	public void save();

	//값 수정
	public void addInfo(); //회원가입
	public void deleteInfo(); //회원탈퇴
	public void updatePoint(int getPoint) {//얻은 양 기준, 잃었으면 음수표현
		if(members.get(membernum).getPoint()+getPoint <0) {
			System.out.println("포인트가 부족합니다");
			return;
		}
		int tmppoint= members.get(membernum).getPoint()+getPoint;
		members.get(membernum).setPoint(tmppoint);
	}

	//내부기능
	private int searchId(String id);//아이디의 인덱스 찾기
	private String getStrInput(String msg);//string 처리
	private boolean isMember(String id, String name) {//가입여부 확인
		int tmpidx= this.searchId(id); //중복아이디 찾기
		if (tmpidx == -1) return false;
		
		if(members.get(tmpidx).getName().equals(name)) {
			//System.out.println("이미가입된 회원정보");
			return true;
		}
		return false;
	}
	public void changeName( );//이름바꾸기
	public void changePassword(); //비밀번호 바꾸기
	public void giveLife();//목숨 하나 주기
	public void useLife() { //목숨하나 사용
		int tmpnow= members.get(membernum).getLife();
		if(tmpnow<1) {
			System.out.println("하트가 부족합니다 상점에서 더 충전하여  사용해 주세요!");
			return;
		}
		members.get(membernum).setLife(tmpnow-1);
		System.out.println(members.get(membernum).getLife());
	}

 //콘솔에 정보제공
	public void showpoint();
	public void showAllInfo();
	public void showInfoUser();

	//기능
	public void resetLife() { //정각마다 라이프 늘려주는기능
		int tmpnow= members.get(membernum).getLife();
		if(tmpnow>=3) {
			//System.out.println("이미 하트의 개수가 최대이기때문에 증가가 불가합니다.");
			return;
		}
		members.get(membernum).setLife(tmpnow+1);
		System.out.println("접속 시간이 3분 경과되어 하트하나가 추가되었습니다!");
	}
	
	public boolean login() {
		System.out.println("아이디와 비밀번호를 입력해주세용");
		String id = getStrInput("ID:");
		String password = getStrInput("Password:");
		
		int tmpidx= searchId(id);
		
		if(tmpidx == -1) {
			System.out.println("해당 아이디로 가입된 회원정보가 없습니다. 초기화면으로 돌아갑니다.");
			return false;
		}
		if(members.get(tmpidx).getPassword().equals(password)) {
			membernum = tmpidx;
			System.out.println(id+"님이 로그인에 성공했습니다.");
			return true;
			
		}else {
		System.out.println("아이디와 비밀번호가 올바르지 않습니다. 초기화면으로 돌아갑니다.");
		return false;
		}
	}
```

### Rank.java

```java
public class Rank implements Util{
	
	MemberInfoManager manager = MemberInfoManager.getManager();
	static ArrayList<Person> list = null;
	ArrayList<MemberInfo> member = (ArrayList<MemberInfo>) manager.getMembers();

	public void sortScore(){	
		list= new ArrayList<Person>();
		for(int i=0; i <member.size(); i++) {
				//리스트에 각 내용 저장
			}
	}
	public void showRank(int gamenum) {
		switch(gamenum) {
		case 1:
			Collections.sort(list, (p1,p2)->p2.g1win-p1.g1win);
			System.out.println(gamenum+"번 게임의 랭킹을 공개합니다!!");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%d등: %s (%d승 %d패)", i+1, list.get(i).name, list.get(i).g1win, list.get(i).g1lose);
				if (list.get(i).g1total != 0) {
					float tmp = (float)list.get(i).g1win/list.get(i).g1total *100;
					System.out.printf(" => 승률 약 %.2f%%",tmp);
				}
				System.out.println();
			}
			break;
		case 2://위와 같음
			break;
		case 3://위와 같음
			break;
		case 4://위와 같음
			}
			break;
		default:
			break;
		}
	}
	public void askgame(); //게임 몇번에 대한 랭킹을 보고싶은지 물어보는 기능
}

class Person {
	String name;
	
	int g1win;
	int g1lose;
	int g1total;
	
	int g2win;
	int g2lose;
	int g2total;
	
	int g3win;
	int g3lose;
	int g3total;
	
	int win;
	int lose;
	int total;
}
```

### TimeForLife.java

```java
public class TimerForLife {
	
	MemberInfoManager members = MemberInfoManager.getManager();
	//인스턴스 생성
	private static TimerForLife tfl = new TimerForLife();
	//getter
	public static TimerForLife getTimer() {
		return tfl;
	}

	ScheduledJob job = new ScheduledJob();
    Timer jobScheduler = new Timer();
		public void startAddLife() {
		      jobScheduler.scheduleAtFixedRate(job, 3000, 3000);
		}
		public void stopAddLife() {
			jobScheduler.cancel();
		}
	}

class ScheduledJob extends TimerTask {
	TimerForLife tfl = TimerForLife.getTimer();
	MemberInfoManager members = MemberInfoManager.getManager();
	   public void run() {
	      members.resetLife();
	   }
	}
```
![image](https://user-images.githubusercontent.com/41908152/98192093-b8eea800-1f5d-11eb-96cb-9f387e3fb07b.png)
![image](https://user-images.githubusercontent.com/41908152/98192104-bdb35c00-1f5d-11eb-8279-89a1d0bdeba3.png)
![image](https://user-images.githubusercontent.com/41908152/98192112-c2781000-1f5d-11eb-951f-2c63e37d3cc1.png)
![image](https://user-images.githubusercontent.com/41908152/98192116-c6a42d80-1f5d-11eb-814c-b95c71a197e5.png)
