package DAY_100;

import java.util.Scanner;

public class Day_21 {

	public static void main(String[] args){
		//알파벳 대소문자로 된 단어가 주어지면, 
		//이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
		//단, 대문자와 소문자를 구분하지 않는다.
		
		//Scanner 객체사용
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		String s = sc.next();
		
		//문자열 s에 대해 첫 번째 문자부터 마지막 문자까지 반복
		for(int i=0; i<s.length(); i++) {
			
			//대소문자구분하지 않고 배열의 원소 증가 시키기
			//대문자 65~90, 소문자 97~122
			if(65<=s.charAt(i) && s.charAt(i)<=90) {
				
				arr[s.charAt(i)-65]++; //해당 인덱스의 값 1증가
				
			}else {
				arr[s.charAt(i)-97]++;
			}
			
			
		}
		
		int max = -1;
		char ch = '?';
		
		//max보다 클 경우 max값으로 2개 이상의 문자가 여러개면 ?로 출력하기
		for(int i=0; i<26; i++) {
			
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
			
		}

		System.out.println(ch);
	}

}
