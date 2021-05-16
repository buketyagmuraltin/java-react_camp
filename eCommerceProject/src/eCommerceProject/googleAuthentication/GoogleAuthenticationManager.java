package eCommerceProject.googleAuthentication;

public class GoogleAuthenticationManager {
	public boolean authentication(String eMail, String password) 
	{
		if (eMail.equals("deneme@gmail.com") && password.equals("123456")) {
            System.out.println("Google bilgileri doðru.");
            return true;
        } 
		else {
            System.out.println("Google bilgileri yanlýþ."); 
            return false;
        }
	}
}
