package DAY_100;

import java.util.Scanner;

public class Day_38_1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        String page = sc.next(); //내가 가려는 page
	        int m = sc.nextInt(); //고장난 버튼 갯수지정
	        
	        int [] broken = new int[10]; //고장난 버튼을 표시할 배열
	        
	        for(int i=0; i<m; i++)  //고장난 버튼엔 -1을 넣는다.
	            broken[sc.nextInt()] = -1;
	 
	        
	        //채널이 100이면 이동하지 않아도 되기 때문에 0이 출력
	        if(page.equals("100")) 
	            System.out.println(0);
	        else {
	        	
	        	//Integer.MAX_VALUE >> int가 가질 수 있는 최대값을 보유하는 상수
	        	//Integer클래스의 MAX_VALUE와 MIN_VALUE를 사용하면 정수의 최대값(2,147,483,647)과 최소값(-2,147,483,648)을 바로 출력가능하다.
	        	
	            int min = Integer.MAX_VALUE;
	            
	            String v = "";//0 ~ 1000000까지의 숫자를 문자열화 하기위한~
	            String closer = ""; //리모컨으로 입력할 수 있는 n과 가장 가까운 채널
	            
	            for(int i = 0; i<1000000; i++) {
	            	
	                boolean isOk = true;
	                
	                v = i+""; //숫자를 문자열로 저장
	                
	                for(int j=0; j<v.length(); j++) { //고장난 버튼이 포함되어 있는지 검사
	                    if(broken[v.charAt(j)-'0'] == -1) { 
	                        isOk = false;
	                        break;
	                        
	                    }
	                    
	                }
	                if(isOk) { //v에 고장난 버튼이 없으면 가장 가까운 채널을 찾는다. n-v로  + 또는 - 버튼을 몇번 눌러야하는지 계산
	                    if(min > Math.abs(Integer.parseInt(page)-Integer.parseInt(v))) { 
	                        min = Math.abs(Integer.parseInt(page)-Integer.parseInt(v));
	                        System.out.println("min"+min);
	                        closer = v;  
	                        System.out.println("closer"+closer);
	                    }
	                }
	            }
	            
	            int result1 = Math.abs(Integer.parseInt(page)-100); //result1에는 현재채널인 100에서 +와-만으로 n까지 갈때의 횟수를 저장
	           System.out.println("2closer"+closer);
	            if(closer.equals("")) //가장 가까운 수가 비어있으면 그냥 result1출력
	                System.out.println(result1);
	            else { //result2에는 n-closer로 closer에서 n까지 가기위한 횟수에 closer를 누르기위한 버튼 입력 횟수인 closer의 길이를 더한다.
	            	System.out.println("3closer"+closer);
	            	int result2 = Math.abs(Integer.parseInt(page)-Integer.parseInt(closer))+closer.length(); 
	                if(result1>result2)
	                    System.out.println(result2);
	                else
	                    System.out.println(result1);
	            }
	        }
	    }


}