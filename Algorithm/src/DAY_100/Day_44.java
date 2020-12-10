package DAY_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Day_44 {
	
	//자연수 m과 n이 주어질 때 m이상 n이하의  자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소 값을 찾는 프로그램을 작성하시오.
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int[] numbers = new int[n];

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
        }

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(numbers[i]).append("\n");
        }

        System.out.println(sb); //여기까지 152초 메모리사용량도 절반
        
//		List<Integer> list=new ArrayList<Integer>();
//		for(int i=0; i<n; i++) {
//			list.add(Integer.parseInt(br.readLine()));
//		}
//		Collections.sort(list);
//		for(Integer i:list) {
//			System.out.printf("%d\n",i);
//		} 이렇게 했을 때는 시간이 348초. Scanner로 받았을 때는 548초.
		
		

	}

}
