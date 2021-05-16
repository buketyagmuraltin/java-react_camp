package eCommerceProject.business.abstracts;


import eCommerceProject.entities.concretes.User;

public interface UserCheckService {

	boolean checkIfRealPerson(User user);

}
