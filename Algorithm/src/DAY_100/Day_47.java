package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day_47 {

	//직각삼각형이면 right, 아니면 wrong출력
	public static void main(String[] args) throws IOException {

		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			//값을 받으면서 제곱해주기
			int a = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
			int b = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
			int c = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
			
			//0 0 0 이 들어오면 프로그램종료
			if(a+b+c ==0) 
				break;
			
			//두수의 합이 다른 수 일 때 	right출력 >> 직각삼각형이 맞다.
			if(a+b==c||a+c==b || b+c==a){
				System.out.println("right");
				
			//두 수의 합이 	다른 수가 아닐 때 wrong 출력 >> 직각삼각형이 아니다
			}else {
				System.out.println("wrong");
			}
		}
		
		//Scanner입력 >> 248ms 18280kb
		//BufferedReader입력 >> 124ms 14252kb
	}

}
