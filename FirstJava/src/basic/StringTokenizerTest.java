package basic;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		// 원본 문자열
		String strData = "cool|진|jin@mail|서울|?|010-1111-2222";
		StringTokenizer st = new StringTokenizer(strData, "|", false);
		// hasMoreToken() -> 다음 값이 있는지 확인 true / false로 결과 출력
		// nextToken() -> 다음 값을 가져온다.
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("-----------");
		String pNum = "Tel 82-010-1111-2222";
		
		StringTokenizer st1 = new StringTokenizer(pNum); // 구분자가 없으면 공백을  enter로 처리한다.		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("-----------");
		StringTokenizer st2 = new StringTokenizer(pNum, " -");		// 구분자: "-", " " 2개
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("-----------");
		StringTokenizer st3 = new StringTokenizer(pNum, "- " , true);
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}
	

}
