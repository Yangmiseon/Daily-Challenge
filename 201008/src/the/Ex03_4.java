package the;
/*
  2 단원 
  //그 해 경과 일 수를 구함
*/

import java.util.Scanner;

public class Ex03_4 {
	
		
	//각달의 일수
    static int[][]mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년
    };
    
    static int isLeap(int year) {
        // 운년일 경우 1, 평년일 경우 0을 반환
        return (year%4 == 0 && year%100 != 0 || year%400 == 0 ? 1 : 0);
    }
    
    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d;
        
        for(int i=1; i<m; i++)
            days += mdays[isLeap(y)][i-1];
        return days;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;
        
        System.out.println("그 해 경과 일수를 구합니다.");
        
        do {
            System.out.print("년 : "); int year = sc.nextInt(); //년
            System.out.print("월 : "); int month = sc.nextInt(); //월
            System.out.print("일 : "); int day = sc.nextInt(); //일
            
            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year,month,day));
            
            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            retry=sc.nextInt();
        }while(retry == 1);
    }

}
