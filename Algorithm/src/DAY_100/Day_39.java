package DAY_100;

import java.util.Scanner;

public class Day_39 {
	
	//자연수 m과 n이 주어질 때 m이상 n이하의  자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소 값을 찾는 프로그램을 작성하시오.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = 10001;

		for (int i = m; i <= n; i++) {
			int cnt = 0;

			boolean a = true;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					cnt++;

					if (cnt > 3 || i == 1) {
						cnt = 0;
						a = false;

					}

				}

			}
			if (a == true) {
				sum += i;
				if (min > i) {
					min = i;
				}
			}
		}

		if (min == 10001 || sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
