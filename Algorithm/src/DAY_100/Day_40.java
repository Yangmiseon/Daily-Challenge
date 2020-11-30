package DAY_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_40 {
	
	//에라토스테네스의 체를 사용한 소수구하기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		List<Boolean> list = new ArrayList<>();
		list.add(false);
		list.add(false);
		
		//2-n 까지 소수로 설정
		for(int i=2; i<=n; i++) {
			list.add(i, true);
		}
		
		//2부터 ~i*i<=n 각각의 배수들 지우기
		for(int i=2; (i*i)<=n; i++) {
			if(list.get(i)) {
				for(int j=i*i; j<=n; j+=i) {//j는 i만큼 증가시키기
					list.set(j, false);
				}
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(list.get(i)) {
				System.out.println(i);
			}
		}
		
		
		
	}
}

