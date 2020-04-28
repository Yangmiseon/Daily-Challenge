package ver_4;

public class PhoneUnivInfor extends PhoneInfor {
	String major; //친구의 전공

	String year; // 친구의 학년
	
	public PhoneUnivInfor(String name, String phoneNumber, String birthday, String major, String year) {
		super(name, phoneNumber, birthday);
		this.major = major;
		this.year = year;
	}
	
	

	public PhoneUnivInfor(String name, String phoneNumber,String major, String year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}



	@Override
	void showAll() {
	
		super.showAll();//상속한거 출력
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+ year);
	}

	@Override
	boolean checkName(String name) {
		// TODO Auto-generated method stub
		return super.checkName(name);
	}
}
