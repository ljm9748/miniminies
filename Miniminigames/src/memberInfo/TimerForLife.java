package memberInfo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import miniminigame.MenuManager;

public class TimerForLife {
	
	boolean stop =false;
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
			
		     
		      jobScheduler.scheduleAtFixedRate(job, 180000, 180000);
		      /*
		      try {
		         Thread.sleep(20000);
		      } catch(InterruptedException ex) {
		         //
		      }
		      jobScheduler.cancel();
		      */
		}
		public void stopAddLife() {
			jobScheduler.cancel();
			//System.exit(0);
		}

	

	}

class ScheduledJob extends TimerTask {
	TimerForLife tfl = TimerForLife.getTimer();
	MemberInfoManager members = MemberInfoManager.getManager();
	   public void run() {
		  
	      members.resetLife();
	      
	   }

	}