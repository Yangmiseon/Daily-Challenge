package ver_4;

public class PhoneInfor {
	//변수선언
			//private : 변수의 직접참조를 막는다. 정보은닉. 메인페이지에 설명써둠
			private String name;  //친구의 이름
			private String phoneNumber;  //친구의 전화번호
			private String birthday;  //친구의 생일
			
			//생성자 : 초기화목적 >>생성자이름은 클래스이름과 같게해준다.
			PhoneInfor(String name, String phoneNumber, String birthday) {
				this.setName(name);
				this.phoneNumber = phoneNumber;
				this.birthday = birthday;
			}
			
			//생일은 저장할수도 안할수도
			PhoneInfor(String name, String phoneNumber) {
//				this.name = name;
//				this.phoneNumber = phoneNumber;
//				this(name, phoneNumber, null);1번
				this(name, phoneNumber, "입력값없음");//2번
			}
			
			//출력가능메서드
			void showInfo() {
				System.out.println("이      름 : "+this.getName());
				System.out.println("전화번호 : "+this.phoneNumber);
				System.out.println("생       일 : "+this.birthday);//2번일때
				
//				if(this.birthday == null) {
//					System.out.println("생일 : 입력값이 없습니다");
//				}else {
				
//				System.out.println("생       일 : "+this.birthday);
//				
//				}1번일때는 이렇게 처리
			}
			
			void showAll() {
				showInfo();
			}
			
			//변수의 name을 직접 참조할 수 없으니 기능을 만들어줌
			//name속성 값과 전달받은 문자열을 비교해서 결과 반환
			boolean checkName(String name) {
				return this.getName().equals(name);			
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
}
