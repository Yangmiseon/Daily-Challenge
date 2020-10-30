package DAY_100;

import java.util.Scanner;

public class Day_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int cnt=0;
		int copy = num;
		
		while(true) {
			
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			cnt++;
			System.out.println(num);
			if(copy==num) {
				break;
			}
		}

		System.out.println(cnt);
	}

}
