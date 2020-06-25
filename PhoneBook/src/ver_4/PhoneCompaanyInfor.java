package ver_4;

public class PhoneCompaanyInfor extends PhoneInfor {
	String company; //회사명

	public PhoneCompaanyInfor(String name, String phoneNumber, String email, String company) {
		super(name, phoneNumber, email);
		this.company = company;
	}
	

	@Override
	public void showAll() {
		showInfo();
		System.out.println("회사명 : " + company);
	}

}
