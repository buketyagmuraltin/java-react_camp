package eCommerceProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceProject.dataAccess.abstracts.UserDao;
import eCommerceProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> userList = new ArrayList<User>();
	
	@Override
	public void addToDB(User user) {
		userList.add(user);
		System.out.println("Kullanýcý database'e eklendi : " + user.getFirstName());		
	}

	@Override
	public void addMultipleToDB(User[] users) {
		for(User user : users) {
			System.out.println("Kullanýcý eklendi : " + user.getFirstName());		
		}	
	}

	@Override
	public List<User> userDB(List<User> users) {
		users = userList;
		return users;
	}
}