package samprog;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	성적관리 프로그램
		 	1과목에 대한 성적
		 	총점(합계)
		 	평균(평균) - double
		 	최고 점수(최대값) - 
		 	최소점수(최소값)
		 	
		 	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int count; 
		int student[] = null;
		int sum;
		double avg; //초기화를 안해도 됨 -> sum을 구하고 활용하기 때문
		int max;
		int min;
		
		//초기화
		sum = 0;
		max = 0;
		
		// 1. 몇 명의 학생의 성적을 입력하시겠습니까?
		System.out.println(">>학생수 입력 = ");
		count = sc.nextInt(); //실제로 입력 받아 count로 넘김
		
		
		// 2. 학생 수에 맞게 배열 확보
		student = new int[count]; //입력한 수에 맞춰서 배열 생성
				
		
		// 3. 학생들의 수에 맞게 성적 입력(input)
		for(int i=0; i<student.length; i++) {
			System.out.print((i+1)+"번재 학생의 성적: "); //(ㅑ
			student[i] = sc.nextInt(); // 몇 번재 학생의 성적을 입력 받음
			
		}
		// 4. 총점을 구한다
		for(int i=0; i<student.length; i++) {
			sum = sum + student[i]; //배열에 값이 쌓임.
						
		}				
		// 5. 평균을 구한다.
		avg = (double)sum/student.length;
		
		
		// 6. 최대값을 구한다.
		max = student[0];//음수 일경우 엉망진창이 되기 때문에 0으로 초기화 x -> 값이 도망가지 못함
		for(int i=0; i<student.length; i++) {
			int num = student[i]; // num에 배열 데이터를 넣음
			if(max < num) {
				max = num; 
			}
		}
		// 7. 최소값을 구한다.
		min = student[0];//음수 일경우 엉망진창이 되기 때문에 0으로 초기화 x -> 값이 도망가지 못함
		for(int i=0; i<student.length; i++) {
			int num = student[i]; // num에 배열 데이터를 넣음
			if(min > student[i]) {
				min = student[i]; 
			}
		}
		
		// 8. 결과 출력
		
		System.out.println("학생들의 총 인원수: " + student.length + "명");
		System.out.println("학생들의 성적 합계 : " + sum + "점");
		System.out.println("학생들의 성적 평균 : " + avg + "점");
		System.out.println("학생들의 성적 최대 점수: " + max + "점");
		System.out.println("학생들의 성적 최소 점수: " + min + "점");
		

	}

}
