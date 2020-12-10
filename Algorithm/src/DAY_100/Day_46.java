package DAY_100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

//완주하지 못한 선수 구하기
//이름이 중복일 땐 중복 완주자명단에 없는 참가자 출력
public class Day_46 {

	static String[] participant = { "aislav", "stanko", "aislav", "ana" };
	static String[] completion = {  "aislav", "stanko", "ana" };

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(solution(participant, completion));
		bw.flush();
		bw.close();
	}

	static String solution(String[] participant, String[] completion) {

		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(String p : participant) {
			System.out.println(">>"+p);
			System.out.println(participant.length);
		}
		for(String c : completion) {
			System.out.println("c>>"+c);
			System.out.println(completion.length);
		}
		
		for (int i = 0; i < completion.length; i++) {
			
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				return answer;
			}
		}
		answer += participant[participant.length - 1];
		return answer;

	}

}
