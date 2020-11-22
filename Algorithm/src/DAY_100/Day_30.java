package DAY_100;

import java.util.Scanner;

public class Day_30 {

	public static void main(String[] args) {

		//육각형으로 이루어진 벌집이 있다. 
		//중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
		//숫자 N이 주어졌을 때, 
		//벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 
		//몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
		//예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
		// 1 2 9 22 41 66
		// 1 7 13 19 25 +6
		// 13이면 1 2 9 방3개지나가고
		// 58이면 1 2 9 22 41 방5개 지나감

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = 2;
		int count = 1;
		int range=2;

		do {

			//num이 2일때는 count만 올려줌
			if (num == 2) {
				count++;
				break;
			}
			
			//탈출조건
			if (c > num) {
				break;
			}

			c = c + (count * 6);

			count++;
		} while (num > 0);

		System.out.println(count);

		// 다른 사람 코드
		//n이 1일때는 1을 출력
		//그외에는 c의 값이 n을 넘기 직전까지 c를 증가 후 count 1증가
		if (num == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= num) {	// 범위가 N보다 커지기 직전까지 반복 
				System.out.println("?"+count);
				range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화 
				count++;	// count 1 증가 
				System.out.println("??"+count);
			}
			System.out.println(range);
			System.out.print(count);
		}
		
	}

}
