package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day_06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		int sum;
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		 st = new StringTokenizer(reader.readLine()," ");
        
//			for(int i=0; i<num; i++) {
//				
//              
//               sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
//				
//			}
			
			for(int i=1; i<=num; i++) {
				
	              
	              sb.append(Integer.parseInt(st.nextToken()));
					
				}
			
			System.out.println(sb);
			
	}

}
