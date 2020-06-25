package ver_4;

import java.util.Scanner;

public class PhoneBookManager {
				
			PhoneInfor[] pBooks;
			int cnt;
			Scanner sc;
			
			
			private PhoneBookManager(int num) {
				//배열 초기화
				pBooks = new PhoneInfor[num];
				//저장개수 초기화
				cnt=0;
				//scanner 객체 초기화
				sc = new Scanner(System.in);
				
			}
			private static PhoneBookManager manager = new PhoneBookManager(100);
			
			public static PhoneBookManager getInstance() {
				return manager;
			}
			
			
			//배열추가
			void addInfo(PhoneInfor info) {
				
				//배열에 요소 대입
				pBooks[cnt] = info;
				//등록된 정보의 개수를 증가
				cnt++;
			}
			
		
			
			//사용자의 입력데이터로 PhoneInfor 객체를 생성		
			void createInstanse() {
			
				System.out.println("원하시는 입력정보를 선택해주세요");
				System.out.println("1.일반 2.대학 3.회사 4.동호회");
				int selectNum = Integer.parseInt(sc.nextLine());
				
				//일반친구의 정보입력
				System.out.println("이름을 입력해주세요. >> ");
				String name = sc.nextLine();
				
				System.out.println("전화번호를 입력해 주세요. >> ");
				String phoneNumber = sc.nextLine();
				
				System.out.println("생일을 입력해 주세요. >> ");
				String email = sc.nextLine();
				
				PhoneInfor info = null;
					
				switch(selectNum) {
				case 1:
					info = new PhoneInfor(name, phoneNumber, email);
					break;
				case 2:
					System.out.println("전공 입력하기");
					String major = sc.nextLine(); 
					System.out.println("학년(숫자) 입력하기");
					String year = sc.nextLine();	
					
					info = new PhoneUnivInfor(name, phoneNumber, email, major, year);
					break;
					
				case 3:
					System.out.println("직업 입력하기");
					String company =  sc.nextLine();
												
					info = new PhoneCompaanyInfor(name, phoneNumber, email, company);
					break;
					}
					
				addInfo(info);
			}
			
				
		

				//전체 리스트 출력
				void showAllData() {
							
					System.out.println("***전체 정보 출력***");
					for(int i=0; i<cnt; i++) {
						pBooks[i].showAll();
						System.out.println("********************");
					}
							
				}
						
						
				//배열에서 이름을 기준으로 검색 후 index값을 반환
				int searchIndex(String name) {
							
					int searchIndex = -1;
							
					//사용자가 입력한 이름으로 배열에 요소를 검색 >>index
					for(int i=0; i<cnt; i++) {
						if(pBooks[i].checkName(name)) {
							searchIndex = i;
							break;
						}
					}
					return searchIndex;
				}
										
				//검색 : 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
				//배열의 요소(PhoneInfor)의 name 속성 값으로 배열의 요소
				void searchInfo() {
							
					System.out.println("검색하고자 하는 이름을 입력해 주세요");
					String name = sc.nextLine();
							
					int searchIndex = searchIndex(name);
							
					if(searchIndex<0) {//검색결과가 없을 경우
						System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");
					}else {
						pBooks[searchIndex].showInfo();
					}
				}
						
						
				//삭제 : 이름을 기준으로 데이터를 찾아서 해당 데이터를 삭제
				void deleteInfo() {
						
				System.out.println("삭제하고자 하는 이름을 입력해 주세요");
				String name = sc.nextLine();
						
				int searchIndex = searchIndex(name);

						
				//삭제
				//pBooks[2] :삭제, pBooks[2] = null
				//데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
				//재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.
				if(searchIndex<0) {
					System.out.println("찾으시는 이름의 데이터가 존재하지 않습니다.");

				}else {
							
					//삭제 : 검색한 index부터 저장된 위치까지 왼쪽으로 시프트
					for(int i=searchIndex; i<cnt-1; i++) {
						pBooks[i] = pBooks[i+1];
					}
					//저장된 정보의 개수를 -1*****
					cnt--;
					System.out.println("요청하신 이름의 정보를 삭제했습니다.");
				}
			}

				void editInfo() {
					
					System.out.println("변경하시려는 이름을 입력해주세요");
					String name = sc.nextLine();
					int searchIndex = searchIndex(name);
					
					if(searchIndex<0) {
						System.out.println("찾으시는 이름이 없습니다.");
						return;
					}else {
						String editName = pBooks[searchIndex].getName();
						System.out.println("수정 데이터 입력을 시작합니다.");
						System.out.println("이름은 " + editName + "입니다.");
						System.out.println("전화번호를 입력해주세요.");
						String phoneNumber = sc.nextLine();
						System.out.println("생일을 입력해주세요.");
						String birthday = sc.nextLine();
						
						
						PhoneInfor info = null;
						
						if(pBooks[searchIndex] instanceof PhoneUnivInfor) {
							System.out.println("전공을 입력해주세요.");
							String major = sc.nextLine();
							System.out.println("학년을 입력해주세요.");
							String year = sc.nextLine();
						info = new PhoneUnivInfor(editName, phoneNumber, birthday, major, year);
					
					}else if (pBooks[searchIndex] instanceof PhoneCompaanyInfor) {
							System.out.println("회사를 입력해주세요.");
							String company = sc.nextLine();
						info = new PhoneCompaanyInfor(editName, phoneNumber, birthday, company);
				}
					pBooks[searchIndex] = info;
			}
	}
		
	}
				




