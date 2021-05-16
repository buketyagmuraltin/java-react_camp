package eCommerceProject.business.abstracts;

import eCommerceProject.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void logIn(User user);
	void logOut(User user);
	void sendVerificationCode(User user);
	void clickedVerificationLink(User user);

}
