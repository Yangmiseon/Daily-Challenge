package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		String[] s = new String[t];
		
		for(int i=0; i<t; i++) {
			s[i]= br.readLine();
		}
		
		for(int i=0; i<t; i++) {
			
			int cnt = 0; //몇번연속인가
			int sum = 0; //누적 합산 값
			
			for(int j=0; j<s[i].length(); j++) {
				
				//해당 원소의 문자열을 charAt()메소드를 통해 하나하나 검사한다.
				if(s[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt = 0;
				}
				
				sum += cnt;
			}
			
			//결과를 저장할 때 StringBuilder에 문자열을 이어준다
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);

	}

}
