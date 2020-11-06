package DAY_100;

import java.util.Scanner;

public class Day_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int student = 0; //학생수
		
		double A =0; //평균점수
		int[] s = new int[1000];
		
		//몇번 할건지 학생수몇명으로할건지 돌리기
		for(int i=0; i<num; i++) {
			student = sc.nextInt();
			int total =0; //합계
			int cnt =0; // 평균넘는 학생
			
			//점수넣기
			for(int j=0; j<student; j++) {
				s[j] = sc.nextInt();
				total += s[j];
			}
			
			//평균구하고
			A = (double)total / student;
			
			//평균넘는학생들세기
			for(int j=0; j<student; j++) {
				if(s[j]>A) {
					cnt++;
				}
			}
			//퍼센트 구하기
			System.out.println(100.0*cnt/student+"%");
		}


}
}
