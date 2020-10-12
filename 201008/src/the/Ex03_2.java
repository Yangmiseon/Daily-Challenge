package the;
/*
  2 단원 
  //기수 변환
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_2 {
	
		
	/**
	 * 정수 x를 r진수로 변환하여 문자열로 반환
	 * 
	 * @param x	변환하는 정수
	 * @param r	기수
	 * @return	
	 */
	public static String cardConv(int x, int r) {
		
		char[] rArr = new char[32]; 			   // 변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		int n = ((Integer) x).toString().length(); // 변환 전의 자릿수
		int digits = 0;							   // 변환 후의 자리수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("[DEBUG] 변환과정");
		System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
				
		do {
			
			// 변환 과정 출력을 위한 영역 시작 ======================================================
			System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print("-");
			System.out.println();
			
			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
			// 변환 과정 출력을 위한 영역 끝 ========================================================
			
			// 처리 예)
			// 10 % 2 = 0 	  , rArr[0] = 0, 10/2 = 5
            // 5 % 2 = 1      , rArr[1] = 1, 5/2  = 2
            // 2 % 2 = 0      , rArr[2] = 0, 2/2  = 1
            // 1 % 2 = 1      , rArr[3] = 1, 1/2  = 0
			rArr[digits++] = dchar.charAt(x % r); 	// r로 나눈 나머지를 저장
			x /= r;
			
		} while (x != 0);
		
		
		// d[0]~d[digits-1]의 요소를 역순으로 변경
		System.out.println("[DEBUG] before : " + Arrays.toString(rArr));
		for (int i = 0; i < digits / 2; i++) { 
			char temp = rArr[i];					
			rArr[i] = rArr[digits - i - 1];
			rArr[digits - i - 1] = temp;
		}		
		System.out.println("[DEBUG] after : " + Arrays.toString(rArr));
		
		return new String(rArr).trim();
	}
	
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		int no; 		// 변환하는 정수
		int cd;			// 기수 (cardinalNo)
		int retry;		// 재시도
						
		System.out.println("============= 기수 변환 (10진수 정수 n진수 정수로 변환) ==============\n");
		
		do {
			do {
				System.out.print("> 변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("> 어떤 진수로 변환할까요? (2~36) : ");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			
			// no를 cd 진수로 변환
			System.out.println(cd + "진수로는 " + cardConv(no, cd) + "입니다.");
						
			
			System.out.print("\n> 한 번 더 할까요? (1.예/0.아니오) : ");
			retry = stdIn.nextInt();
			
		} while (retry == 1);
	}

}
