package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day_22 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		 
        String a = sc.nextLine();
        int cnt=0;
        String word = "";
        
        for(int i=0; i<a.length(); i++) {
        	//
      	  String b = String.valueOf(a.charAt(i));
      	  
      	  if(b.equals(" ")) {//입력문자열입력여부
      		 word="";
      		
      	  }else {
      		  
      		  if(word.length()==0) {
      			  cnt++;
      		  }
      		  
      		  word=b;
      	  }
      	 
        }
        System.out.println(cnt);
        
        
        //여기서부턴 다 찾아본거
        String s = sc.nextLine().trim(); //앞뒤 공백을 제거하기위한 trim()메서드사용
         
        if (s.isEmpty()) {//입력값의 없을때처리
            System.out.println(0);
        } else {
            System.out.println(s.split(" ").length); //구분자 split("")으로 나누어 길이출력
        }
        
        
        //StringTokenizer 을 사용하여 분리 기준을 공백으로 지정해주면 공백을 기준으로 나뉘어 토큰에 저장해주는 것이다.
        //문자열의 처음과 마지막의 공백에 대해 별다른 예외처리를 안해줘도 되니 매우 편리한 방법이다.
        //StringTokenizer 에 들어간 토큰, 즉 문자열의 개수를 세어주는 메소드를 출력하면 문제는 끝난다.
        // st 에 공백을 기준으로 나눈 토큰들을 st 에 저장한다
     		StringTokenizer st = new StringTokenizer(a," ");
     		
     		// countTokens() 는 토큰의 개수를 반환한다
     		System.out.println(st.countTokens());	
     		
     		
     	//	BufferedReader 사용
     		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		
    		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
    		System.out.print(st1.countTokens());
	}


}
