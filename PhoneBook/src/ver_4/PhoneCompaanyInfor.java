package ver_4;

public class PhoneCompaanyInfor extends PhoneInfor {
	String company; //회사명

	public PhoneCompaanyInfor(String name, String phoneNumber, String birthday, String company) {
		super(name, phoneNumber, birthday);
		this.company = company;
	}
	
	

	public PhoneCompaanyInfor(String name, String phoneNumber,String company) {
		super(name, phoneNumber);
		this.company = company;
	}



	

	@Override
	void showAll() {
		super.showAll();
		System.out.println("회사명 : " + company);
	}



	@Override
	boolean checkName(String name) {
		return super.checkName(name);
	}
}
