package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_13 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine())
				* Integer.parseInt(br.readLine());
		
		int[] s = new int[10];
		
		//0이 아닐때까지 반복
		while(mul!=0) {
			
			s[mul%10]++;
			
			//나눠서 한자리수씩 줄이기
			mul/=10;
			
		}
		
		for(int result : s) {
			System.out.println(result);
		}
	}

}
