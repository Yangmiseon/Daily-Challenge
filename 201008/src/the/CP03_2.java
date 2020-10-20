package the;

import java.util.Scanner;

/*선형 검색의 스캐닝 과정을 상세하게 출력하는 프로그램을 작성하세요.
이때 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력하고,
현재 검색하고 있는 요소위에 별표 기호 *를 출력하세요.
*/
public class CP03_2 {

	// 배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 선형 검색 (보초법)
			static int seqSearchEx(int[] a, int n, int key) {
				System.out.print("   |");
				for (int k = 0; k < n; k++)
					System.out.printf("%4d", k);
				System.out.println();

				System.out.print("---+");
				for (int k = 0; k < 4 * n + 2; k++)
					System.out.print("-");
				System.out.println();

				for (int i = 0; i < n; i++) {
					System.out.print("   |");
					System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
					System.out.printf("%3d|", i);
					for (int k = 0; k < n; k++)
						System.out.printf("%4d", a[k]);
					System.out.println("\n   |");
					if (a[i] == key)
						return i; // 검색성공
				}
				return -1; // 검색실패
			}

			public static void main(String[] args) {
				Scanner stdIn = new Scanner(System.in);

				System.out.print("요솟수：");
				int num = stdIn.nextInt();
				int[] x = new int[num]; // 요솟수 num인 배열

				for (int i = 0; i < num; i++) {
					System.out.print("x[" + i + "]：");
					x[i] = stdIn.nextInt();
				}

				System.out.print("찾는 값："); // 키 값을 입력 받음
				int ky = stdIn.nextInt();

				int idx = seqSearchEx(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

				if (idx == -1)
					System.out.println("그 값의 요소가 없습니다.");
				else
					System.out.println(ky + "은 " + "x[" + idx + "]에 있습니다.");
			}
}
