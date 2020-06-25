package ver_4;

public class PhoneCafeInfor extends PhoneInfor {

	
	String nickName;
	String cafeName;
	PhoneCafeInfor(String name, String phoneNumber, String email,
			String nickName,String cafeName) {
		super(name, phoneNumber, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}
	
	@Override
	public void showAll() {
		
		showInfo();
		System.out.println("닉네임: "+nickName);
		System.out.println("동호회이름: "+cafeName);
	}
	
	

}
