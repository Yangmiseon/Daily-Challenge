package DAY_100;

import java.util.Scanner;

public class Day_28 {

	public static void main(String[] args) {
		
		//상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
		//설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
		//상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
		//예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
		//5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
		//상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
		//봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int sum=0;
		
		//설탕의 킬로그램이 5보다 작을때
		if(sugar <5) {
			System.out.println("-1");
		}else {//5보다 클때
			
			if((sugar%5) > 3 || (sugar%5) < 3) {
				
				sum=(sugar/5)+((sugar%5)/3)+1;
				
			}else{
				sum = (sugar/5)+((sugar%5)/3);
				
			}
			System.out.println(sum);
		}
		
		
		
		//다른사람코드
		//5의 배수 + 3의 자리는 5의 배수에 있던 값의 +1 개수가 되는것
		//3과 6은 5로는 채울 수 없는 숫자 이기 때문에 11, 16, 21 등 n=5의 배수+1 이라면
		//n=3일때 봉지1개 n=6일때 봉지2개, n=6부터 +5씩 증가할때마다 +1씩 증가
		
		//n이 5의 배수 -1 일때
		if (sugar == 4 || sugar == 7) {
			System.out.println(-1);
		}else if (sugar % 5 == 0) {
			System.out.println(sugar / 5);
		}
		//n=4일 때는 어떠한 봉지로도 나누어 떨어지지 않으므로 n=9부터 시작
		//n=9 부터 +5씩 증가할때마다 봉지의 개수가 3에서 +1씩 증가
		
		//n>=3 일때, <<(5의 배수+1)과 (5의 배수 +3)>>은 5로 나눈 몫의 +1
		//즉, n이 5의 배수 +1 또는 +3이라면 n을 5로 나눈 몫+1이 설탕의 최소개수
		else if (sugar % 5 == 1 || sugar % 5 == 3) {
			System.out.println((sugar / 5) + 1);
		}
		//n>=8일때 <(5의 배수+2)와 (5의 배수+4)>> 는 5로 나눈 몫의 +2
		//즉, n이 5의 배수+2 또는 5의 배수+4라면 n을 5로 나눈몫 +2가 설탕의 최소개수
		else if (sugar % 5 == 2 || sugar % 5 == 4) {
			System.out.println((sugar / 5) + 2);
		}
	}

}
