package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_14 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		boolean[] s= new boolean[42];
		int count=0;
		
		for(int i=0; i<10; i++) {
			
			num = Integer.parseInt(br.readLine());
			s[num%42]=true;
		}
		
		for(boolean t : s) {
			if(t) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
