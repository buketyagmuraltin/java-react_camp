package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.BaseUserCheckManager; 
import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private BaseUserCheckManager baseUserCheckManager;

	public UserManager(UserDao userDao, BaseUserCheckManager baseUserCheckManager) {
		super();
		this.userDao = userDao;
		this.baseUserCheckManager = baseUserCheckManager;
	}

	@Override
	public void signUp(User user) {
		if(baseUserCheckManager.checkIfRealPerson(user)) {
			userDao.addToDB(user);
			System.out.println("Hesap olu�turuldu.");
			sendVerificationCode(user);
			clickedVerificationLink(user);
		}
		else {
			System.out.println("Eksik bilgi. �yelik tamamlanamad�.");
		}
	}
	
	@Override
	public void logIn(User user) {
		System.out.println("Giri� yap�ld�. " + user.getFirstName());
		
	}

	@Override
	public void logOut(User user) {
		System.out.println("��k�� yap�ld�. " + user.getFirstName());
	}

	@Override
	public void sendVerificationCode(User user) {
		System.out.println("Do�rulama e-postas� g�nderildi.");
	}

	@Override
	public void clickedVerificationLink(User user) {
		System.out.println("�yelik tamamland�.");	
		
	}
}
