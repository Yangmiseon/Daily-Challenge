package DAY_100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day_07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		
		
		
//		for (int i =1; i<=num; i++) {
//			
//			//st에 br담아서
//			st = new StringTokenizer(br.readLine());
//			
//			//첫번째 숫자a, 두번째 숫자 b 찾고
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			
//			//더하기
//			sum = a+b;
//			
//			//문자 데이터를 출력문자스트림으로 출력
//			bw.write(sum+"\n");
//			
//		}
		
		//1부터 차례로 한줄씩 num까지 출력하기
		/*
		 * 1 
		 * 2 
		 * 3 
		 * 4 ..
		 */
//		for(int i=1; i<=num; i++) {
//			bw.write(i+"\n");
//		}
//		
//		
//		//num부터 차례로 한줄씩 1까지 출력하기
//				/*
//				 * 4 
//				 * 3 
//				 * 2 
//				 * 1 ..
//				 */
//		for(int i=num; i>0; i--) {
//			bw.write(i+"\n");
//		}
//		
//		//남아있는 데이터 모두 출력시키기
//		bw.flush();
		
		//Scanner사용해서 합 출력하기
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		int sum=0;
//		
//		for(int i=1; i<=num; i++) {
//			
//			sum += i;
//		}
//		
//		System.out.println(sum);
//
	}

}
