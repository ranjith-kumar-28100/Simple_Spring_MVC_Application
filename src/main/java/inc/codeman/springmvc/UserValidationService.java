package inc.codeman.springmvc;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
	public boolean isValidUser(String user, String password) {
		return (user.equals("codemanrkg")&&password.equals("abCD12@@"));		
	}

}
