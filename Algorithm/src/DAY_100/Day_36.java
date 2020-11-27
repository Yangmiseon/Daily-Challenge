package DAY_100;

import java.util.Scanner;

public class Day_36 {
	//나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 
	//지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
	//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int cnt = 0; // 라인수
		int x = 0; // 분자
		int y = 0; // 분모

		for (int i = 1; i > 0; i++) {
			cnt++; // 몇번째 줄인지 구한다.
			sum += i;
			if (sum >= num) {
				break;
			}
		}
		
		//라인이 홀수일땐 라인이 분모가 되고, 분자는 (1,2,3,.....라인) 이 된다.
		if (cnt % 2 == 1) {
			//입력숫자를 라인으로 나눈 나머지가 분모가 된다. 
			y = num % cnt;
			
			if (num % cnt == 0) {
				y = cnt;
			}
			x = (sum - num) + 1;
			
		//라인이 짝수일땐 분자가 라인이 되고, 분모는 (1,2,3,...라인) 이 된다. 
		} else {
			//라인수에서 빼주면 몇번째 숫자인지 나옴
			x = cnt - (sum - num);
			if ((sum - num) == 0) {
				x = cnt;
			}
			y = (sum - num) + 1;

		}
		System.out.println(x + "/" + y);
		
		
		//다른 사람 코드
		//1/1 >> 분자분모합t=2
		//2/1 1/2 >> t=3
		//3/1 2/2 1/3 >>t=4
		//대각선의 칸의 개수는 t-1
		// ( T 가 짝수, 또는 대각선 칸의 개수가 홀수 ) 일 때는 왼쪽 아래에서 오른쪽 위 방향 ( ↗︎ ) 으로 진행되고,
		//( T 가 홀수, 또는 대각선 칸의 개수가 짝수 ) 일 때는 오른쪽 위에서 왼쪽 아래 방향 ( ↙︎ ) 으로 진행된다.
		//입력받을 X 값
		//해당 범위의 대각선 개수 ( cross_count )
		//해당 대각선 직전 대각선 까지의 칸의 누적 합 ( prev_count_sum )
		//이렇게 3 개를 이용하여 X 값이 해당 범위의 값이 나올 때 까지 반복하고,
		//만약 해당 범위의 값이라면
		//대각선의 개수가 홀수인지, 짝수인지 판별하여 해당 대각선의 첫 원소와 X, 대각선의 개수를 이용하여 분모 분자 값을 구해준다.
		int X = sc.nextInt();
		 
		int cross_count = 1, prev_count_sum = 0;
 
		while (true) {
        
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분모가 큰 수부터 시작
					// 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1) 
					// 분자는 X 번째 - 직전 대각선까지의 누적합 
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}

	}
		
}
}


