package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day_15 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] s = new double[Integer.parseInt(br.readLine())];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<s.length; i++) {
			
			s[i]=Integer.parseInt(st.nextToken());
			
		}
		
		double A = 0;
		Arrays.sort(s);
		for(int i=0; i<s.length; i++) {

			A += ((s[i]/s[s.length-1])*100);
			
		}
			
		System.out.println(A/s.length);
	}

}
