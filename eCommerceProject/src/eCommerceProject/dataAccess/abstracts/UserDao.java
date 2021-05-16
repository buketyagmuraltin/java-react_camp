package eCommerceProject.dataAccess.abstracts;


import java.util.List;

import eCommerceProject.entities.concretes.User;


public interface UserDao {
	void addToDB(User user);
	void addMultipleToDB(User[] users); 
	List<User> userDB(List<User> users);
}
