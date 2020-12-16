package first;

public class PlayerMain {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		// Player player = new Player(); -> 추상 클래스라 오류 발생
		// VidoePlayer player = new VideoPlayer(); -> 추상 클래스라 오류 발생
		AudioPlayer player = new AudioPlayer();

	}

}
