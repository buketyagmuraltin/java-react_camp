package eCommerceProject.core.concretes;

import eCommerceProject.business.abstracts.BaseUserCheckManager;
import eCommerceProject.core.abstracts.GoogleService;
import eCommerceProject.entities.concretes.User;
import eCommerceProject.googleAuthentication.GoogleAuthenticationManager;

public class GoogleAuthenticationManagerAdapter extends BaseUserCheckManager implements GoogleService {

	
	@Override
	public boolean authentication(String eMail, String password) {
		GoogleAuthenticationManager manager = new GoogleAuthenticationManager();
		return (manager.authentication(eMail, password));
	
	}

	@Override
	public boolean checkIfRealPerson(User user) {
		return (authentication(user.geteMail(), user.getPassword()));
	}

}
