package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day_48 {
	
	//팩토리얼 재귀함수로 구하기
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		System.out.println(mul(num));
//		int mul =1;
//		for(int i=num; i>0; i--) {
//			mul = mul*i;
//		}
//		
//		System.out.println(mul);
	}
	
	public static int mul(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*mul(n-1);
		}
	}

}//Scanner 입력 236ms 18352kb, BufferedReader 입력 132ms 14348kb
//재귀 136ms 14476kb
