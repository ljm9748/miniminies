package array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		System.out.println("-----mathScores[][]-----");
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores["+ i + "][" + j +"] = " + mathScores[i][j]);
			}
		}		
		
		System.out.println("-----englishScores[][]-----");
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.println("englishScores["+ i + "][" + j +"] = " + englishScores[i][j]);
			}
		}
		
		System.out.println("-----javaScores[][]-----");
		int[][] javaScores = { {95, 80}, {92, 96, 80}};
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores["+ i + "][" + j +"] = " + javaScores[i][j]);
			}
		}	
	}

}
