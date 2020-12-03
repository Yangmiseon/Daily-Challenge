package DAY_100;

import java.util.Scanner;

public class Day_42 {
	// 1보다 큰 자연수 중에서 1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다.
	// 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다.
	// 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
	// 골드바흐의 추측은 유명한 정수론의 미해결 문제로,
	// 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다.
	// 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
	// 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11,
	// 14 = 7 + 7이다.
	// 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
	// 2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
	// 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); //테스트케이스
		
		
		for (int j = 0; j < t; j++) {

			int num = sc.nextInt();	//2보다 큰 짝수
			int a = 0, b = 0; // 소수의 곱
			
			//소수를 2로 나누어 각각 a와 b에 담은 후 각각 1씩 더하고 빼주며 확인
			for (a = num / 2, b = num / 2;; a++, b--) {
				
				if (check(a) && check(b)) {
					System.out.println(b + " " + a);
					break;
				}
			}
		}
		

	}

	public static boolean check(int n) {
		// 자기 자신과 1 말고는 나누어 져서는 안됨.
		for (int i = 2; i <= n / 2; i++) {
			if (n%i==0)
				return false;
		}
		return true;
	}
}