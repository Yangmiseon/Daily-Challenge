package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day_26 {
	/*
    	문제 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
		예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
		aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
		단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //몇개 단어 입력할건지
		int count=n;
		
		for(int i=0; i<n; i++) {
			String s = sc.next(); //단어 입력
			boolean[] check = new boolean[26]; //단어를 체크해줄 배열
			
			for(int j =1; j<s.length(); j++) {
				//현재 문자와 이전 문자가 같지 않을때
				if(s.charAt(j-1) != s.charAt(j)) {
					//현재 문자가 나온적이 있으면
					if(check[s.charAt(j)-97] == true) {
						//count 빼고 멈추기
						count--;
						break;
					}
					//등장한적없는 단어가 등장했음을 표시
					check[s.charAt(j-1)-97] = true;
				}
			}
		}
		System.out.println(count);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int result =0;
		
		while(t-- >0) {
			String input = br.readLine().trim(); //받은 문자열 공백제거
			if(checkGroup(input)) {
				result++;
			}
		}
		System.out.println(result);
		

	}
	
	private static boolean checkGroup(String input) {
		boolean[] alpabet = new boolean[26];
		int length = input.length();
		
		int k;
		for(k=0; k<length; k++) {
			char temp = input.charAt(k);
			
			if(alpabet[temp-'a']) {
				return false;
			}else {
				if(k<length-1 && temp != input.charAt(k+1)) {
					alpabet[temp-'a']=true;
				}
			}
		}
		return true;
	}

}
