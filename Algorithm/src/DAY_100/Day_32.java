package DAY_100;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_32 {

	public static void main(String[] args) {
		
		//ACM 호텔 매니저 지우는 손님이 도착하는 대로 빈 방을 배정하고 있다. 
		//고객 설문조사에 따르면 손님들은 호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호한다고 한다. 
		//여러분은 지우를 도와 줄 프로그램을 작성하고자 한다. 
		//즉 설문조사 결과 대로 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램을 작성하고자 한다.
		//문제를 단순화하기 위해서 호텔은 직사각형 모양이라고 가정하자. 각 층에 W 개의 방이 있는 H 층 건물이라고 가정하자 (1 ≤ H, W ≤ 99). 그리고 엘리베이터는 가장 왼쪽에 있다고 가정하자(그림 1 참고). 이런 형태의 호텔을 H × W 형태 호텔이라고 부른다. 호텔 정문은 일층 엘리베이터 바로 앞에 있는데, 정문에서 엘리베이터까지의 거리는 무시한다. 또 모든 인접한 두 방 사이의 거리는 같은 거리(거리 1)라고 가정하고 호텔의 정면 쪽에만 방이 있다고 가정한다.
		//그림 1. H = 6 이고 W = 12 인 H × W 호텔을 간략하게 나타낸 그림
		//방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고 XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다. 
		//즉, 그림 1 에서 빗금으로 표시한 방은 305 호가 된다.
		//손님은 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다. 다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호한다.
		//예를 들면 102 호 방보다는 301 호 방을 더 선호하는데, 102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문이다. 
		//같은 이유로 102 호보다 2101 호를 더 선호한다.
		//여러분이 작성할 프로그램은 초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다. 
		//첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.
		
		//N 을 H 로 나눈 나머지 값이 층 수다.
		//위 예시처럼 10 번째 손님이면 1 ~ 6 층까지 채워지고 다시 1 층부터 시작하여 4 층에 배정받게 된다.
		//즉, 10 % 6 을 통해 나머지 값인 4 가 층 수가 되는 것이다.
		//만약 N = 6 이고, H = 6 이라면?
		//그럼 나머지가 0 이 되어 0층이 되어버린다.
		//N = 12 , H = 6 이여도 마찬가지다.
		//12 % 6 = 0 으로 0층이라는 값이 나오지만 우리가 배정하고 싶은 층은 6층이다.
		//즉, N % H = 0 일 때는 H 층이 배정받는 층 수다.
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int room=0;
		for(int i=0; i<t; i++) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int r = sc.nextInt();
			
			if(r%h==0) {
				room = (h*100)+(r/h);
			}else {
				room = ((r%h)*100)+(r/h)+1;
			}
			
			System.out.println(room);
		}
		
//		for(int m=0; m<t; m++) {
//		int h = sc.nextInt();
//		int w = sc.nextInt();
//		int r = sc.nextInt();
//		ArrayList room = new ArrayList<>();
//		
//		for(int i =1; i<=h; i++) {
//			for(int j =1; j<=w; j++) {
//				for(int k =1; k<=h; k++) {
//					room.add((k*100)+j);
//			
//				}
//				
//			}
//		}
//		
//		System.out.println(room);
//		System.out.println(room.get(r-1));
//		}
	}

}
