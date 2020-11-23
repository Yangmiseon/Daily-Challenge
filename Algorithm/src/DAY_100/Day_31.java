package DAY_100;

import java.util.Scanner;

public class Day_31 {
	
	public static void main(String[] args) {
		//땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
		//달팬이는 낮에는 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
		//또 정상에 올라간 후에는 미끄러지지 않는다.
		//달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int cnt = 0;
		
		
			if(a>b) {
				
				cnt =  1 + (((v-a)%(a-b) == 0 ? (v-a)/(a-b) : ((v-a)/(a-b)) + 1));
			
			}
		System.out.println(cnt);
		
		sc.close();
		
	}

}
