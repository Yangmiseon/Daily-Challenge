package DAY_100;

import java.util.Arrays;



public class Day_47_1 {
	
	//프로그래머스 k번째수
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
        	//Arrays.copyOfRange(복사할배열이름, 복사시작인덱스값, 복사마지막 인덱스값)
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            
            Arrays.sort(temp);
             answer[i]=temp[commands[i][2]-1];
        }
	        
	        return answer;
    }

}
