package DAY_100;

import java.util.Scanner;

public class Day_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int cnt1 = 0; //1의 갯수
		int cnt0 = 0; //0의 갯수

		for (int i = 0; i <= n; i++) {
			
			if (fibo(i) == 0) {
				cnt0++;
			} else if (fibo(i) == 1) {
				cnt1++;
			}

		}
		System.out.println("0개수:"+cnt0);
		System.out.println("1개수:"+cnt1);

	}

	
	//각각 0과1로 리턴하도록 함
	public static int fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
			//3이 들어오면 3-1과 3-2가리턴되어 2와 1이들어오면다시2가 들어가서 1과 0이 리턴되고
			//1이들어가서 1이 리턴됨 그럼 1이2개 0이 1개가됨
		}
	}

}
