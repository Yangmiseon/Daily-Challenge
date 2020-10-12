/*
- 20.10.08과제

*/
package the;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 곱셈표
		System.out.println("<<곱셈표>>");
		System.out.printf("   | ");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+-----------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);

			System.out.println();
		}
		System.out.println();
		// 덧셈표
		System.out.println("<<덧셈표>>");
		System.out.printf("   | ");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+-----------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d | ", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i + j);

			System.out.println();
		}

		System.out.println();
		System.out.println();

		// 숫자에 맞는 정사각형 만들기
		System.out.println("정사각형만들기");
		Scanner number = new Scanner(System.in);
		System.out.println("정사각형 크기는?");
		int a = number.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println();
			for (int j = 0; j < a; j++)
				System.out.printf("%2s", "*");
		}
		System.out.println();

		// 왼쪽 아래가 이등변 삼각형 만들기
		System.out.println();
		System.out.print("왼쪽 아래가 이등변 삼각형은?");
		// int = number.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.println();
			for (int j = 0; j < i; j++)
				System.out.printf("%2s", "*");
		}

		System.out.println();
		// 왼쪽 위가 이등변 삼각형 만들기
		System.out.println();
		System.out.print("왼쪽 위가 이등변 삼각형은?");
		// int = number.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.println();
			for (int j = 0; j < a-i; j++)
				System.out.printf("%2s", "*");
		}
		
		
		System.out.println();
		// 오른쪽 위가 이등변 삼각형 만들기
		System.out.println();
		System.out.print("오른쪽 위가 이등변 삼각형은?");
		// int = number.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.println();
			for (int j = 0; j <= i - 1; j++) {			
				System.out.printf("%2s", " ");
			}
			for (int j = 0; j < a-i; j++)
				System.out.printf("%2s", "*");
		}
		
		System.out.println();
		// 오른쪽 아래가 이등변 삼각형 만들기
		System.out.println();
		System.out.print("오른쪽 아래가 이등변 삼각형은?");
		// int = number.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.println();
			for (int j = 0; j < a-i; j++) {			
				System.out.printf("%2s", " ");
			}
			for (int j = 0; j < i; j++)
				System.out.printf("%2s", "*");
		}
		
		
		System.out.println();
		// n단 피라미드만들기
		System.out.println();
		System.out.print(a+"단 피라미드만들기");
		// int = number.nextInt();
		for (int i = 0; i <= a; i++) {
			System.out.println();
			for (int j = 0; j < a-i; j++) {			
				System.out.printf("%2s", " ");
			}
			for (int j = 0; j < (i-1)*2+1; j++)
				System.out.printf("%2s", "*");
		}
		
		
		System.out.println();
		// 숫자 피라미드만들기
		System.out.println();
		System.out.print(a+"단 숫자 피라미드만들기");
		
		// Q16
		   // n단의 피라미드
		      int n=0;
		      int space=0;
		      while(true) {
		         System.out.println("몇 단 피라미드 인가요?>>");
		         a = number.nextInt();
		         
		         System.out.println("[1]숫자로 출력   [2]*모양으로 출력");
		         int choice= number.nextInt();
		         if(choice==1) {
		            for (int i = 1; i <= a; i++) {
		               space=a-i;
		               n= (i-1)*2+1;
		               while(space>0) {
		                  System.out.print(" ");
		                  space--;
		               }
		               for (int j = 1; j <= i; j++) {
		                  while(n>0) {
		                     System.out.print(i%10);
		                     n--;
		                  }
		               }
		               System.out.println();
		            }
		         }else if(choice==2) {
		            for (int i = 1; i <= a; i++) {
		               space=a-i;
		               n= (i-1)*2+1;
		               while(space>0) {
		                  System.out.print(" ");
		                  space--;
		               }
		               for (int j = 1; j <= i; j++) {
		                  while(n>0) {
		                     System.out.print("*");
		                     n--;
		                  }
		               }
		               System.out.println();
		            }
		         }
		         System.out.println();
		      }
		   
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
