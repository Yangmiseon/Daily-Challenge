package DAY_100;

import java.util.Scanner;

public class Day_35 {

	public static void main(String[] args) {
		// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int count = 0;

		for (int i = 0; i < N; i++) {

			// 소수인경우 true, 아닌경우 false
			boolean isPrime = true;

			int num = sc.nextInt();

			if (num == 1) { // 1 인경우 다음 반복문으로
				continue;
			}
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isPrime = false; // 소수가 아니므로 false 로 바꿔줌
					break;
				}
			}
			if (isPrime) { // 소수인경우 count 값 1 증가
				count++;
			}
		}
		System.out.println(count);
	}
}
