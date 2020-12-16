package first;

public class Speaker {
	
	// 볼륨 변수 (볼륨 크기)
	private int volumeRate;

	// 메소드 생성(현재볼륨의 크기를 출력
	void showCurrentState() {
		System.out.println("볼륨의 크기 >> " +volumeRate);
	}
	
	public void setVolume(int vol) { // set은 값을 설정 또는 저장 get은 특정 값을 가져오는 것 
		volumeRate = vol;
	}
}

