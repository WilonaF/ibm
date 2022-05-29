
public class StringPatterns {

	public static void main(String[] args) {
		
		String name = "Polo";
		//Name must have first char in caps and min length should be 4
		String namePattern = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(namePattern));
		
		String mobile = "8050581144";
		//Mobile no must start with 7-9 and length should be 10
		String mobilePattern = "[7-9][0-9]{9}";
		System.out.println(mobile.matches(mobilePattern));
		
		String cc = "1122334455667788";
		String ccPattern = "[0-9]{16}";
		System.out.println(cc.matches(ccPattern));
		
		String email = "polo@gmail.com";
		String emailPattern = "[a-zA-Z0-9+_.]+@[a-z0-9.]+[a-z]{2,}";
		System.out.println(email.matches(emailPattern));
				
	}
}
