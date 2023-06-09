package inc.codeman.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import inc.codeman.springmvc.UserValidationService;


@Controller
public class LoginController {
	@Autowired
	private UserValidationService userValidationService;
	@RequestMapping(value = "/login",method = RequestMethod.GET)	
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public String welcomePage(@RequestParam String name,@RequestParam String password,ModelMap model) {		
		if(userValidationService.isValidUser(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials!!!!");
		return "login";
	}
}
