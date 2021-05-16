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
		Normal �ye giri�i i�in:
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager());
		
		Google hesab� ile �ye giri�i i�in:
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthenticationManagerAdapter());
		*/
		
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager());
		
		
		User firstUser = new User(1, "Buket", "Alt�n", "deneme@gmail.com", "123456");
		userService.signUp(firstUser);
		
		System.out.println("-------");
		User secondUser = new User(1, "B", "Alt�n", "dee@hotmail.com", "123456");
		userService.signUp(secondUser);
		
		System.out.println("-------");
		User thirdUser = new User(1, "Ya�mur", "Alt�n", "dee@hotmail.com", "123456");
		userService.signUp(thirdUser);
	
	}
}
