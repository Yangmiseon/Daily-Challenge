package DAY_100;

import java.util.Scanner;

public class Day_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch= str.charAt(i);
			
			 //c가 들어오고 c가 마지막 문자열이아닐때 다음 값을 확인한다.
			if(ch =='c' && i<str.length()-1) {
				//c다음의 문자를 확인한다.
				if(str.charAt(i+1) == '=') {
					//i+1 까지가 하나의 문자이므로 다음 문자를 건너뛰기 위해 1증가
					i++;
				}else if(str.charAt(i+1)== '-') {
					i++;
				}
			}
			
			if(ch =='d') {
				if(str.charAt(i+1)=='z' && str.charAt(i+2)=='=') {
					i=i+2;
				}else if(str.charAt(i+1)=='-') {
					i++;
				}
			}
			
			if(ch=='l' || ch=='n') {
				if(str.charAt(i+1)=='j') {
					i++;
				}
			}
			
			if(ch=='s' || ch=='z') {
				if(str.charAt(i+1)=='=') {
					i++;
				}
			}
			
			count++;
			
		}
		
		System.out.println(count);
		
		
		
		
		//찾아본 코드
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<8; i++) {
			//문자열 croatia를 전부 a로 바꾸기
			str = str.replace(croatia[i], "a");
			
			
			
		}
		//str의 길이를 출력하면 정답
		System.out.println(str.length());

	}

}
