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
