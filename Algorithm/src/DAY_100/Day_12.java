package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_12 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] n = new int[num];
		
		for(int i =0; i<num; i++) {
			n[i]=Integer.parseInt(br.readLine());
		}
		
		int max =n[0];
		int a=0;
		for(int i=0; i<n.length; i++) {
			if(max<n[i]) {
				max = n[i];
				a= i;
				}
			
			}
		System.out.println(max);
		System.out.println(a+1);
	}

}
