package eCommerceProject.business.concretes;

import eCommerceProject.business.abstracts.BaseUserCheckManager;
import eCommerceProject.business.abstracts.UserCheckService;
import eCommerceProject.entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager extends BaseUserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		Pattern regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = regex.matcher(user.geteMail());

        if(user.getFirstName().length() >= 2 && user.getLastName().length() >= 2 && user.getPassword().length() >= 6 && matcher.find()) {
			return true;
			}
        return false;
	}
}