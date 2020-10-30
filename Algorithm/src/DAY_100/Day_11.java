package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int[] n = new int[num];
		
		
		for(int i=0; i<n.length; i++) {
		n[i]=Integer.parseInt(br.readLine());
		}
		
		int max = n[0];
		int min = n[0];
		for(int i=0; i<n.length; i++) {
			
			if(n[i]>max) {
				max = n[i];
			}
			
			if(n[i]<min) {
				min = n[i];
			}
		
		}
		
		System.out.println("max"+max);
		System.out.println("min"+min);
	}

}
