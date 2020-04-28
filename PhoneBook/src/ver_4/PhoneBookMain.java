package ver_4;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		//폰북매니저 객체 필요s
		PhoneBookManager manager = new PhoneBookManager(100);	
		
		//반복
		while(true){
			
		Menu.showMenu();
		
		
		int selectNum = manager.sc.nextInt();
		
		//비워주는 용도
		manager.sc.nextLine();
		
		switch(selectNum) {
		case 1:  //사용자의 입력 데이터를 인스턴스 생성
			manager.createInstanse();
			break;
		
		case 2:
			manager.searchInfo();
			break;
			
		case 3://이름으로 검색 후 삭제
			manager.deleteInfo();
			break;
			
		case 4:
			manager.editInfo();
			break;
			
		case 5://전체 리스트 출력 >> 저장된 개수. 전체개수아님
			manager.showAllData();
			break;
			
		case 6:
			System.out.println("시스템을 종료합니다.");
			return;
		
			
		}
			

	}
		
}
}

