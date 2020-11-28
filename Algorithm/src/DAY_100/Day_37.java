package DAY_100;

import java.util.Scanner;

public class Day_37 {
	public static void main(String[] args) {
		// 금액이 50달러가 넘어가면 10달러를 세일해준다.
		// 세자매가 쇼핑을 할때 혼자 계산하는것보다 합쳐계산할때 이득인 경우가 생긴다.
		// 할인받을 수 있는 최소금액을 리턴하기
		Scanner sc = new Scanner(System.in);
		int[] goods = new int[3];

		for (int i = 0; i < 3; i++) {
			goods[i] = sc.nextInt();
		}

		solution(goods);
	}

	public static int solution(int[] goods) {

		int sum = 0;

		for (int i = 0; i < goods.length; i++) {
			//50보다 작을 때 더해준 후 0으로 초기화한다.
			if (goods[i] < 50) {
				sum += goods[i];
				goods[i] = 0;
			
			//50이상일때 10을 뺀 금액으로 초기화한다.
			} else {
				goods[i] = goods[i] - 10;
			}

			System.out.println(goods[i]);
		}
		
		//구매금액의 합이 50이상이면 10달러를 빼준다.
		if (sum >= 50) {
			sum = sum - 10;

		}

		//남은 상품들에 대한 금액을 더해준다.
		for (int i = 0; i < goods.length; i++) {
			sum = sum + goods[i];
		}

		return sum;

	}

}
