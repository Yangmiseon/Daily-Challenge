package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day_43 {
	//세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] a = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st=new StringTokenizer(br.readLine(), " ");
		int[] b = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		st=new StringTokenizer(br.readLine(), " ");
		int[] c = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
	
		
		int x=a[0]; 
		int y=a[1];
		
		if(a[0]==b[0]) {
			x=c[0];
		}else if(a[0]==c[0]) {
			x=b[0];
		}
		
		if(a[1]==b[1]) {
			y=c[1];
		}else if(a[1]==c[1]) {
			y=b[1];
		}
		
		System.out.println(x+" "+y);
			
		
		
		
		//Scanner입력 받았을 때 256초 , BufferedReader 입력 받았을때 160초
		
		
	}
	
}