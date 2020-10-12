package the;
/*
  2 단원 
  //난수 생성
   * ArrayIndexOutOfBoundsException 에러
*/

import java.util.Random;

public class Ex03 {
	
		
		static int maxOf(int[] a) {
			int max = a[0];
			for(int i=0; i<a.length; i++)
				if(a[i]>max)
					max=a[i];
			return max;				
		}
		
	
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		System.out.println("사람수에 따른 키의 최댓값");
		
		int people = 1+rand.nextInt(10);
		System.out.print("사람수: "+people);
		
		int[] height = new int[people];
		
		System.out.println();
		for(int i =0; i< people; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println("사람"+(i+1) +": "+height[i]);
		}
		
		System.out.println("키의 최댓값은: "+maxOf(height));
	}

}
