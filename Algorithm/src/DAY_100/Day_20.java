package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day_20 {

	public static void main(String[] args) throws IOException {
		
		//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		//즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
		//S에는 QR Code "alphanumeric" 문자만 들어있다.
		
		
//		Scanner in = new Scanner(System.in);
//		
//		//몇번테스트할건지
//		int T = in.nextInt();
//		
//		for(int i=0; i<T; i++) {
//			
//			//몇번 반복할건지
//			int R = in.nextInt();
//			//반복할글자
//			String S = in.next();
//			
//			//반복시키기
//			for(int j=0; j<S.length(); j++) {
//				for(int k=0; k<R; k++) {
//					System.out.print(S.charAt(j));
//				}
//			}
//			
//			System.out.println();
//		}
		
		
		//BufferedReader를 사용하는 방법
		// readLine()은 split() 이나 StringTokenizer 로 숫자와 문자열 사이의 공백을 구분해주어야 한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			String[] str = br.readLine().split(" "); //공백 분리
			
			//분리된 문자의 첫번째는 int 형으로 변환해야하므로 Integer.parseInt() 를 사용하여 String 에서 int 형으로 변환시켜준다.
			int r = Integer.parseInt(str[0]); //String > int
			String s = str[1];
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			
			System.out.println();
			
		}
		

	}

}
