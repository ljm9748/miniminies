package array;

public class StringIndex {

	public static void main(String[] args) {
//		String index 사용 / ABCDE => EDCBA
		String str = "ABCDE";
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result += str.charAt(i); // "" + 'A' -> "A" / "A" + 'B' = "AB" / "AB" + 'C' = "ABC"
		}
		System.out.println("result -> " + result);
			
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		for(int score : scores) {
			System.out.print(score + " ,");
		}
	}

}

