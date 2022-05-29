
public class EmailValidator {
	
	//1-Only 1 occurrence of @ and . is allowed
	//2-Min 4 chars before @
	//3-Min 3 chars between @ and .
	//4-Min 2 chars after .
	//Regular expression or patterns not allowed
	
	public static void main(String[] args) {
		
		/*
		String email = "polo@email.com";
		
		int i1 =  email.indexOf('@');
		int i2 = email.lastIndexOf(".");
		int i3 =  email.lastIndexOf('@');
		int i4 = email.indexOf(".");
		
		String p1 = email.substring(0, i1); 
		String p2 = email.substring(i1+1, i2);
		String p3 = email.substring(i2+1);
		
		if(i1==i3 && i2==i4 && p1.length()>=4 && p2.length()>=3 && p3.length()>=2)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		*/
		
		String email = "polo@email.com";
		
		int iat = email.indexOf('@');
		int idot = email.indexOf('.');
		
		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat>3 && idot>(iat+3) && email.length()>(idot+2))
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		 
	}
}
