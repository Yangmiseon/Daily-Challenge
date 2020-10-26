package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day_05 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		// 윤년찾기
		int a = sc.nextInt();
		if(a%4==0 && a%100!=0 || a%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

		// x,y축에 따른 4분면 고르기
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}

		// 알람시간 45분 빨리 설정하기
		int h = sc.nextInt();
		int m = sc.nextInt();

		int ah, am;

		if (m >= 45) {
			ah = h;
			am = m - 45;
			System.out.print(ah + " " + am);
		} else if (m < 45) {
			if (h == 0) {
				ah = 23;
			} else {
				ah = h - 1;
			}
			am = m + 15;
			System.out.print(ah + " " + am);
		}
		
		//구구단출력
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine().trim());
			for(int j=1; j<10; j++) {
				System.out.println(num+" * "+j+" = "+num*j);
			}
			
		
	}

}
