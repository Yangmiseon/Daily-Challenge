package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Day_45 {//136초 14476kb
	//한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
	//직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc= new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력은 공백으로 구분해서 한 줄로 입력받도록 문자열 분리해주기
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		
		//처음거리 0에서 6을 빼면 6으로 x가 그대로 나옴. x와 전체거리에서 뺀값중 최소값이 x축 최소값
		//y축도 같은 방식으로 구하기
		int x_min = Math.min(x, w-x);
		int y_min = Math.min(y, h-y);
		
		System.out.println(Math.min(x_min, y_min));
		
		
	}

}
