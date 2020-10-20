package DAY_100;

import java.util.Scanner;

public class Circle {
	
	public static void main(String [] args) throws Exception{

	Scanner sc = new Scanner(System.in); 
	
	int n= sc.nextInt(); 
	
	int circle[] = new int[n]; 
	
	for (int i = 0 ; i < n ; i++) { 
		
		int x1 = sc.nextInt(); 
		int y1 = sc.nextInt(); 
		int r1 = sc.nextInt(); 
		
		int x2 = sc.nextInt(); 
		int y2 = sc.nextInt(); 
		int r2 = sc.nextInt(); 
		
		circle[i] = distance(x1, y1, r1, x2, y2, r2); 
		
	} 
	
	for (int i = 0 ; i < n ; i++) 
		System.out.println(circle[i]); 
		
		sc.close(); 
		
	} 

	public static int distance(int x1, int y1, int r1, int x2, int y2, int r2) { 
		
		double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); 
		
		
		if (x1 == x2 && y1 == y2 && r1 == r2) 
			return -1; 
		
		
		else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r < Math.abs(r1-r2)) 
			return 0; 
		
		
		else if (r == r1 + r2 || Math.abs(r1-r2) == r) 
			return 1; 
		
		
		return 2; 
		} 
	


}
