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
			System.out.println("Hesap oluþturuldu.");
			sendVerificationCode(user);
			clickedVerificationLink(user);
		}
		else {
			System.out.println("Eksik bilgi. Üyelik tamamlanamadý.");
		}
	}
	
	@Override
	public void logIn(User user) {
		System.out.println("Giriþ yapýldý. " + user.getFirstName());
		
	}

	@Override
	public void logOut(User user) {
		System.out.println("Çýkýþ yapýldý. " + user.getFirstName());
	}

	@Override
	public void sendVerificationCode(User user) {
		System.out.println("Doðrulama e-postasý gönderildi.");
	}

	@Override
	public void clickedVerificationLink(User user) {
		System.out.println("Üyelik tamamlandý.");	
		
	}
}
