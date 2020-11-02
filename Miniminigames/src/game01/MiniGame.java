package game01;

import java.util.Scanner;

public class MiniGame {
	
	//미니게임 1
	boolean miniGame01() {
			//영화 명대사 문제를 저장하는 배열
			String[] movie = new String[20];
			
			movie[0] = "진실의 방으로";
			movie[1] = "지금까지 이런 맛은 없었다. 이것은 갈비인가. 통닭인가? 네, 수원 왕갈비 통닭입니다";
			movie[2] = "니 아버지 뭐하시노!?";
			movie[3] = "아직 한 발 남았다..";
			movie[4] = "묻고 더블로 가!!";
			movie[5] = "호의가 계속되면 그게 권리인 줄 알아요";
			movie[6] = "거 죽기 딱 좋은 날씨네";
			movie[7] = "살아있네~";
			movie[8] = "야 4885 너지?";
			movie[9] = "I am Iron Man";
			movie[10] = "모히또가서 몰디브 한 잔 할라니까";
			movie[11] = "Do you wanna build a snowman?";
			movie[12] = "Wacanda Forever!!";
			movie[13] = "부장님. ㅆㅂ 러브샷 한 번 하겠습니다!!";
			movie[14] = "뭣이 중헌디! 뭣이 중허냐고!!";
			movie[15] = "도르마무. 거래를 하러 왔다";
			movie[16] = "내가 지금 그래. 어이가 없네??";
			movie[17] = "전하. 신에게는 아직 12척의 배가 남아있사옵니다";
			movie[18] = "이보시오 관상가 양반. 어찌, 그대가 보기엔 내가 왕이 될 상인가?";
			movie[19] = "My precious";
			
			//정답을 저장하는 배열
			String[] movieA = new String[20];
			
			movieA[0] = "범죄도시";
			movieA[1] = "극한직업";
			movieA[2] = "친구";
			movieA[3] = "아저씨";
			movieA[4] = "타짜";
			movieA[5] = "부당거래";
			movieA[6] = "신세계";
			movieA[7] = "범죄와의전쟁";
			movieA[8] = "추격자";
			movieA[9] = "어벤져스";
			movieA[10] = "내부자들";
			movieA[11] = "겨울왕국";
			movieA[12] = "블랙팬서";
			movieA[13] = "더킹";
			movieA[14] = "곡성";
			movieA[15] = "닥터스트레인지";
			movieA[16] = "베테랑";
			movieA[17] = "명량";
			movieA[18] = "관상";
			movieA[19] = "반지의제왕";	
			
			//영화 명대사 문제를 랜덤으로 출력
			int index = (int)(Math.random() * 20);
			
			System.out.println("-첫 번째 문제-");
			System.out.println("영화 명대사를 보고 제목을 맞춰봐");
			System.out.println(movie[index]);
			
			//사용자에게 문제에 대한 정답 입력을 요구
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정답은??\n ->");
			
			//사용자가 입력한 값과 정답이 일치하는지 비교
			if(movieA[index].equals(sc.nextLine())) {
				System.out.println("정답!! 다음 단계로~");
				
				return true;			
			}else {
				System.out.println("땡!!");
				
				return false;
			}
		}
	
	//미니게임 2
	boolean miniGame02() {
			//사자성어 문제를 저장하는 배열
			String[] word = new String[20];
			
			word[0] = "감언OO";
			word[1] = "결초OO";
			word[2] = "고진OO";
			word[3] = "구사OO";
			word[4] = "사면OO";
			word[5] = "사필OO";
			word[6] = "살신OO";
			word[7] = "삼고OO";
			word[8] = "새옹OO";
			word[9] = "설상OO";
			word[10] = "속수OO";
			word[11] = "시시OO";
			word[12] = "망망OO";
			word[13] = "아비OO";
			word[14] = "개과OO";
			word[15] = "과유OO";
			word[16] = "도원OO";
			word[17] = "동문OO";
			word[18] = "주경OO";
			word[19] = "부전OO";
			
			//정답을 저장하는 배열
			String[] wordA = new String[20];
			
			wordA[0] = "이설";
			wordA[1] = "보은";
			wordA[2] = "감래";
			wordA[3] = "일생";
			wordA[4] = "초가";
			wordA[5] = "귀정";
			wordA[6] = "성인";
			wordA[7] = "초려";
			wordA[8] = "지마";
			wordA[9] = "가상";
			wordA[10] = "무책";
			wordA[11] = "비비";
			wordA[12] = "대해";
			wordA[13] = "규환";
			wordA[14] = "천선";
			wordA[15] = "불급";
			wordA[16] = "결의";
			wordA[17] = "서답";
			wordA[18] = "야독";
			wordA[19] = "자전";
			
			//사자성어 문제를 랜덤으로 출력
			int index = (int)(Math.random() * 20);
			
			System.out.println("-두 번째 문제-");
			System.out.println("앞에 두 글자만 보고 사자성어를 완성시켜봐");
			System.out.println(word[index]);
			
			//사용자에게 문제에 대한 정답 입력을 요구
			Scanner sc = new Scanner(System.in);
			
			System.out.println("정답은??\n ->");
			
			//사용자가 입력한 값과 정답이 일치하는지 비교
			if(wordA[index].equals(sc.nextLine())) {
				System.out.println("정답!! 마지막 단계로~");
				
				return true;			
			}else {
				System.out.println("땡!! 다시 처음부터 해 ㅎㅎ");
				
				return false;
			}
		}
	
	//미니게임 3
	boolean miniGame03() {
			//참참참 방향을 저장하는 배열
			String[] ccc = new String[3];
			
			ccc[0] = "1. ←";
			ccc[1] = "2. ↓";
			ccc[2] = "3. →";
			
			//방향의 번호를 저장하는 배열
			int[] cccA = new int[3];
			
			cccA[0] = 1;
			cccA[1] = 2;
			cccA[2] = 3;
			
			//사용자에게 문제에 대한 정답 입력을 요구
			Scanner sc = new Scanner(System.in);
			
			System.out.println("참참참!!");
			System.out.println("1. ←");
			System.out.println("2. ↓");
			System.out.println("3. →");
			System.out.println("->");
			
			//참참참 방향을 랜덤으로 출력
			int index = (int)(Math.random() * 3);
			
			//사용자가 입력한 값과 정답이 일치하는지 비교
			if(!(cccA[index] == (sc.nextInt()))) {
				System.out.println(ccc[index]);
				return true;			
			}else {
				System.out.println(ccc[index]);
				System.out.println("땡!! 아쉽지만 처음부터 해 ㅎㅎ");
				return false;
			}
		}
	
	void miniGameManager() {
		for(int i = 0; i < 3; i++) {
			if(!miniGame01()) continue;
			
			if(!miniGame02()) continue;
			
			if(!miniGame03()) continue;
			
			System.out.println("Congratulation!! You Win!!");
			System.out.println("메인으로 돌아갑니다~");
			return;
		}
		System.out.println("HAHAHA!! You Lose!!");
		System.out.println("메인으로 돌아갑니다~");
		return;
	}
	
		
}
