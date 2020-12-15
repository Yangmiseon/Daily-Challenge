package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day_49 {

	//피보나치수열 재귀함수로 구하기
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		System.out.println(fibo(num));
		br.close();

	}
	
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}else if(n==1){
			return 1;
		}else {
			
			return fibo(n-1)+fibo(n-2);
		}
	}

	//Scanner >>입력 일반for문>>18264kb	224ms 재귀>>18304kb 	236ms
	//BufferedReader 입력 >> 14712kb 136ms
}
