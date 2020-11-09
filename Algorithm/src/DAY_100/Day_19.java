package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_19 {

	public static void main(String[] args) throws IOException {
		
	//알파벳 소문자로만 이루어진 단어 S가 주어진다. 
	//각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
	//포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열선언
		int[] arr = new int[26];
		
		//배열을 -1로 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
			
		}
		
		//문자열 받기
		String S = br.readLine();
		
		//charAt()메소드로 문자열 추출 후 변수 ch에 저장
		for(int i=0; i<S.length(); i++) {
			
			char ch = S.charAt(i);
			
		//ch의 문자의 위치를 arr배열의 값으로 바꿔준다.
		//위치는 0부터 시작하기때문에 ch의 문자의 위치는 i가 된다.
		//arr배열의 인덱스는 ch가 갖고 있는 문자 인코딩 값(=아스키코드 값과 동일) 'a'또는 97을 빼주면 된다.
		//만약 b가 들어가있으면 b-'a' or b-97을 하면 1이되고 arr[1]은 문자 b를 가리키게 된다.
			
			//같은 위치에 있는 문자열이라면 초기화를 하여 처음위치만 나오도록 한다.
			if(arr[ch - 'a'] == -1) {
			arr[ch-'a'] =i;
			}
		}
		
		for(int val : arr) {
			System.out.println(val +"");
		}
	}

}
