package the;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);

		
		//최대값, 구하기 하나하나 비교하기
//		System.out.println("a의 값: ");
//		int a = number.nextInt();
//
//		System.out.println("b의 값: ");
//		int b = number.nextInt();
//
//		System.out.println("c의 값: ");
//		int c = number.nextInt();
//
//		System.out.println("d의 값: ");
//		int d = number.nextInt();
//
//		int max = a;
//
//		if (b > max) {
//			max = b;
//		}
//		if (c > max) {
//			max = c;
//		}
//		if (d > max) {
//			max = d;
//		}
//
//		System.out.println(max);
		
		
		
		//최대값 구하기, 배열에 담아 비교하기
//		int x;
//		int i;
//		int j;
//		int max=0;
//		System.out.println("숫자 몇개?");
//		x=number.nextInt();
//		int array[] = new int[x];
//		
//		for(i=0; i<x; i++) {
//			
//			System.out.println((i+1)+"번째 숫자: ");
//			array[i]=number.nextInt();
//		}
//		
//		max=array[0];
//		
//		for(j=0; j<x; j++) {
//			
//			if(max <array[j]) {
//				max=array[j];
//			}
//		}
//
//		System.out.println(max);
		
		
		//1부터 7까지 합 구하기
//		int i=0;
//		int a=0;
//		for(i=0; i<=7; i++) {
//			
//			a += i;
//		}
//			System.out.println(a);
			
		
		//가우스 덧셈법칙을 이용한 더하기
//		int i=number.nextInt();
//		
//		int sum=0;
//		sum= i*(i+1)/2;
//		
//		System.out.println(sum);
		
		//정수 a,b를 이용한 사잇값 덧셈
		
//		System.out.println("a값 : ");
//		int a= number.nextInt();
//		
//		System.out.println("b값 : ");
//		int b= number.nextInt();
		
		
		//정수 a,b를 받아서 b-a하기(do while문사용)
//		int a, b;
//		do {
//			System.out.println("a: ");
//			a= number.nextInt();
//			
//			System.out.println("b: ");
//			b= number.nextInt();
//			
//		}while(b<a); 
//		
//		System.out.println(b-a);
		
		
		
		//양의 정수를 입력하고 자릿수를 출력하는 프로그램
//		int a;
//		do {
//			System.out.println("a: ");
//			a=number.nextInt();
//		}while(a<0); 
//			
//		int length = (int)(Math.log10(a)+1);
//		System.out.println(length+"자릿수 입니다.");
		
		//두자리숫자 입력받기
		int a;
		System.out.println("두자리수를 입력하세요");
		do {
			System.out.println("a: ");
			a=number.nextInt();
		}while(a<10 || a>99); 
			
		System.out.println(a);
			
	}
	
	
	
}
