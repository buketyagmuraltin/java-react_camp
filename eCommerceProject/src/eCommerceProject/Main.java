package eCommerceProject;

import eCommerceProject.business.abstracts.BaseUserCheckManager;
import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.business.concretes.UserCheckManager;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.concretes.GoogleAuthenticationManagerAdapter;
import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.dataAccess.concretes.HibernateUserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		/*
		Normal üye giriþi için:
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager());
		
		Google hesabý ile üye giriþi için:
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthenticationManagerAdapter());
		*/
		
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager());
		
		
		User firstUser = new User(1, "Buket", "Altýn", "deneme@gmail.com", "123456");
		userService.signUp(firstUser);
		
		System.out.println("-------");
		User secondUser = new User(1, "B", "Altýn", "dee@hotmail.com", "123456");
		userService.signUp(secondUser);
		
		System.out.println("-------");
		User thirdUser = new User(1, "Yaðmur", "Altýn", "dee@hotmail.com", "123456");
		userService.signUp(thirdUser);
	
	}
}
