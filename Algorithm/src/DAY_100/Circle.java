package DAY_100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Circle {
	
	public static void main(String [] args) throws Exception{

	//Scanner sc = new Scanner(System.in); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
	int n= Integer.parseInt(br.readLine()); 
	
	int circle[] = new int[n]; 
	
	for (int i = 0 ; i < n ; i++) { 
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x1 = Integer.parseInt(st.nextToken()); 
		int y1 = Integer.parseInt(st.nextToken()); 
		int r1 = Integer.parseInt(st.nextToken()); 
		
		int x2 = Integer.parseInt(st.nextToken());  
		int y2 = Integer.parseInt(st.nextToken());  
		int r2 = Integer.parseInt(st.nextToken()); 
		
		//distance()에서 나온 값들을 circle에 담아준다.
		circle[i] = distance(x1, y1, r1, x2, y2, r2); 
		
		
	} 
	
	//담겨진 값들을 차례로 불러온다.
	for (int i = 0 ; i < n ; i++) 
		System.out.println(circle[i]); 
		
		
		
	} 

	public static int distance(int x1, int y1, int r1, int x2, int y2, int r2) { 
		
		//Math.pow(밑, 지수) 밑=2 지수=4 이면 2의 4제곱 값을 구해준다.
		//Math.sqrt(num) num의 제곱근을 구해준다. num이 4이면 2를 num이 1024면 32를 구해줌
		//제곱근 값 r(조규환과 백승환의 거리)을 구해준다.
		double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); 
		
		//원두개가 같은거니까 류재명이 있을 수 있는 위치가 무한대임(o). 
		if (x1 == x2 && y1 == y2 && r1 == r2) 
			return -1; 
		
		//두점사이의 거리가 두원의 반지름의 합보다 크면 떨어진 원이 되기때문에 만날 수 없음(o o), 
		//위치가 같을 때 두점사이의 거리가 원의 반지름을 뺀거보다 작으면 원안에 원이 있으므로 만날수없음 (◎)
		else if (r > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || r < Math.abs(r1-r2)) 
			return 0; 
		
		//거리와 반지름의 합이 같으면 내접(＠)혹은 외접 (∞)
		else if (r == r1 + r2 || Math.abs(r1-r2) == r) 
			return 1; 
		
		
		return 2; 
		} 
	
//Scanner로 받았을 때, 308ms, 19428kb
//BufferedReader로 받았을 때, 152ms, 14500kb	

}
