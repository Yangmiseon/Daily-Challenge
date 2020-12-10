package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day_03 {
	
	static Integer[][] cnt = new Integer[41][2];

	public static void main(String[] args) throws IOException {
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		cnt[0][0] = 1;
		cnt[0][1] = 0; //n이 0일 때 0의 횟수와 1의 횟수 초기화
		cnt[1][0] = 0;
		cnt[1][1] = 1; //n이 1일 때 0의 횟수와 1의 횟수 초기화
		
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int num =Integer.parseInt(st.nextToken());
			
			fibo(num);
			System.out.println(cnt[num][0] + " " + cnt[num][1]);
		}



	}
	
	//== 연산자는 인수 유형 int, null에 대해 정의되지 않기 때문에 Integer사용
	static Integer[] fibo(int num) {
		// num에 대한 0, 1의 호출 횟수가 없을 떄(탐색하지 않은 값일 때)
		if(cnt[num][0] == null || cnt[num][1] == null) {
			// 각 num에 대한 0 호출 횟수와 1 호출 횟수를 재귀호출한다.
			cnt[num][0] = fibo(num - 1)[0] + fibo(num - 2)[0];
			cnt[num][1] = fibo(num - 1)[1] + fibo(num - 2)[1];
		}
		// num에 대한 0과 1, 즉 [num][0]과 [num][1] 을 담고있는 [num]을 반환한다.
		return cnt[num];
 
	}

//	// 각각 0과1로 리턴하도록 하고 0과 1이 리턴될때 각각 카운트 올려주기
//	public static int fibo(int n) {
//		if (n == 0) {
//			return 0;
//		} else if (n == 1) {
//			return 1;
//		} else {
//			return fibo(n - 1) + fibo(n - 2);
//
//			// 3이 들어오면 3-1과 3-2가리턴되어 2와 1이들어오면다시2가 들어가서 1과 0이 리턴되고
//			// 1이들어가서 1이 리턴됨 그럼 1이2개 0이 1개가됨
//		}
//
//	}
	
	

}
