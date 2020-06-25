package ver_4;

public class PhoneUnivInfor extends PhoneInfor {
	String major; //친구의 전공

	String year; // 친구의 학년
	
	public PhoneUnivInfor(String name, String phoneNumber, String email, String major, String year) {
		super(name, phoneNumber,email);
		this.major = major;
		this.year = year;
	}
	

	@Override
	public void showAll() {
		showInfo();
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+ year);
		
	}

}
