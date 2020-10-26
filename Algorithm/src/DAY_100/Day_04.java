package DAY_100;

import java.util.Scanner;

public class Day_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//b를 10으로 나눈 나머지 5
		System.out.println(a*(b%10)); 
		
		//b를10으로 나누면 38 그리고 10으로 나눈 나머지 8
		System.out.println(a*((b/10)%10));
		
		//b를 100으로 나누어 3
		System.out.println(a*(b/100));
		
		//두수의 곱셈
		System.out.println(a*b);
		
		
		//a와 b를 비교하여 부등호로 출력하기
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
		//시험점수별로 등급출력하기
		if(a>89) {
			System.out.println("A");
		}else if(a>79 && a<90) {
			System.out.println("B");
		}else if(a>69 && a<80) {
			System.out.println("C");
		}else if(a>59 && a<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		//switch case문으로 등급출력
		//14296kb, 112ms
		switch (b/10) {
		case 10:
		case 9:
			System.out.println("A");
			
			break;
			
		case 8:
			System.out.println("B");
			
			break;
			
		case 7:
			System.out.println("C");
			
			break;
			
		case 6:
			System.out.println("D");
			
			break;

		default:
			System.out.println("F");
			
			break;
		}
	
	}

	
//	static int inequality(int a, int b) {
//		
//		if(a>b) {
//			return a;
//		}else if(a<b) {
//			return b;
//		}else {
//			return 0;
//		}
//	}


}
