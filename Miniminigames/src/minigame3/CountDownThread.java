package minigame3;

class CountDownThread extends Thread {
	Over o;

	public CountDownThread(Over o) {
		this.o = o;
	}

	@Override
	public void run() {

		for (int i = 15; i >= 0; i--) {
			if (o.gameOverCheck) {
				return;
			}

			try {
				System.out.println("\t\t" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		o.timeOverCheck=true;
	}
}