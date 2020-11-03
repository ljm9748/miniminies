package memberInfo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerForLife {
	
	MemberInfoManager members = MemberInfoManager.getManager();
	
	 public static void main(String[] args) {
	      ScheduledJob job = new ScheduledJob();
	      Timer jobScheduler = new Timer();
	     
	      jobScheduler.scheduleAtFixedRate(job, 100, 300000);
	      try {
	         Thread.sleep(20000);
	      } catch(InterruptedException ex) {
	         //
	      }
	   }
	}

	class ScheduledJob extends TimerTask {
	MemberInfoManager members = MemberInfoManager.getManager();
	   public void run() {
	      members.resetLife();
	   }

}
