package the;
/*
  2 단원 
  //배열
   *배열 메서드 중엥 클론이있음. 클론을 사용하여 복사할수 있음
   *두번째) Arrays 클래스 -> 전체(copyOf), 부분 (copyOfRange)
//      a = Arrays.copyOf(b, b.length);  
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_1 {

//	static void swap(int[] a, int idx1, int idx2) {
//		int t = a[idx1];
//		a[idx1] = a[idx2];
//		a[idx2] = t;
//	}
//
//	static void reverse(int[] a) {
//		for (int i = 0; i < a.length / 2; i++) {
//			swap(a, i, a.length - 1);
//		}
//	}
//
//	public static void main(String[] args) { 
//		Scanner stdIn = new Scanner(System.in); 
//		System.out.println("요솟수 : "); 
//		int num = stdIn.nextInt(); 
//		int[] x = new int[num]; 
//		
//		for(int i=0; i<num; i++) { 
//			System.out.println("x[ "+i+" ]"); 
//			x[i] = stdIn.nextInt(); 
//			} 
//		
//		reverse(x); 
//		
//		System.out.println("요소를 역순으로 정렬했습니다."); 
//		
//		for(int i =0; i<num; i++) { 
//			System.out.println("x[ "+i+" ] = " + x[i]); 
//			} 
//		}


	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = a;

		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		int sum = 0; // 배열요소 누적합을 저장할 변수
	    
	    for (int i = 0; i < a.length; i++) {
	        sum += a[i];
	    } 

	    System.out.println("배열요소 누적합: " + sum);
	    System.arraycopy(b, 0, a , 0, b.length);
	
	// 뒤집어진 정수 배열 출력
    System.out.println(Arrays.toString(reverseArrayInt(a)));

	}
    
    
    public static int[] reverseArrayInt(int[] n) {
        int left  = 0;             // 맨 좌측 요소의 첨자
        int right = n.length - 1;  // 맨 우측 요소의 첨자

        while (left < right) {
          int temp = n[left];
          n[left]  = n[right];     // 좌우 요소 교환
          n[right] = temp;

          left++; right--;         // 배열의 중간 부분으로 한칸씩 이동
        }

        return n;
      }
    
    
    

}
