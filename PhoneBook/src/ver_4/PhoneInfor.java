package ver_4;

public abstract class PhoneInfor implements Info{

	String name;
	String phoneNumber;
	String email;
	
	PhoneInfor(String name,	String phoneNumber,	String email){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNumber);
		System.out.println("이메일: "+email);
	}
	
	
}
