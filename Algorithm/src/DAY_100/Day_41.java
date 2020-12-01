package DAY_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_41 {

	public static void main(String[] args) {

		//베르트랑 공준은 임의의 자연수 n에 대하여, 
		//n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
		//이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
		//예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 
		//또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
		//n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
		//0이 들어가면 멈춘다.
		Scanner sc = new Scanner(System.in);
		int n=0;
		

		while(true) {
			n = sc.nextInt();
			if(n==0) break;
			int cnt = 0;
			List<Boolean> list = new ArrayList<>();
			list.add(false);
			list.add(false);
			// 2-n 까지 소수로 설정
			for (int i = 2; i <= 2 * n; i++) {
				list.add(i, true);
			}

			// 2부터 ~i*i<=n 각각의 배수들 지우기
			for (int i = 2; (i * i) <= 2 * n; i++) {
				if (list.get(i)) {
					for (int j = i * i; j <= 2 * n; j += i) {// j는 i만큼 증가시키기
						list.set(j, false);
					}
				}
			}

			for (int i = n + 1; i <= 2 * n; i++) {
				if (list.get(i)) {
					cnt++;
					System.out.println(i);
				}
			}
			System.out.println("개수"+cnt);
		}

	}

}
