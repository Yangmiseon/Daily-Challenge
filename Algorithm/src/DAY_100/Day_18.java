package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_18 {

	public static void main(String[] args) throws IOException {
		
		
		
		//배열을 사용하지 않는 방법
		//문자열을 입력받을 때 해당 문자열을 쉽게 각 자릿값을 반환받을 수 있는 방법 : getBytes()
		//이 메소드는 java.lang.string 패키지에 있는 메소드로 따로 import 할 필요 없이 사용할 수 있다.
		//설명을 하자면 String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환해주는 메소드다.
		//이 때, 변환되는 방법은 Charset 에서 사용되는 인코딩 방식, 즉 UTF-16 인코딩으로 변경되는 값을 따른다.
		//UTF-16 (유니코드)의 앞부분은 아스키코드와 호환되기 때문에 영어 문자 및 숫자는 같다. 
		//즉 아스키 코드에서 0 이라는 문자는 48 라는 값이고 이는 UTF-16 에서도 48 이라는 값을 갖는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');	// 또는 (a-48)
		}
		
		System.out.print(sum);
		
		//앞서 말했듯이 getBytes() 는 문자열을  byte 배열로 반환한다고 했다.
		//즉, readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환되므로 
		//for-each 구문을 통해 문자열의 문자를 하나하나씩 읽어들일 수 있다.
		//UTF-16 인코딩에 맞게 각 문자의 값을 저장하므로 반드시 '0' 또는 48 을 빼주어야 한다.
	}

}

//내가 푼 방법
//BufferedReader 값받아서 배열에 넣고 넣을때마다 더해서 합구하기.

/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 * int num = Integer.parseInt(br.readLine()); 
 * int[] a= new int[num]; 
 * int sum=0;
 * 
 * 
 * for(int i=0; i<a.length; i++) {
 * 
 * a[i]=Integer.parseInt(br.readLine()); 
 * sum += a[i]; 
 * }
 * 
 * System.out.println(sum);
 */

