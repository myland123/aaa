package Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

import Service.userService;

@Controller
public class userController {
    @Resource
	private userService userservice;

	public userService getUserservice() {
		return userservice;
	}

	public void setUserservice(userService userservice) {
		this.userservice = userservice;
	}
	@RequestMapping("/all.html")
	public String Alllist(Model model){
		List<User> alllsit=userservice.UserList();
		model.addAttribute("alllsit", alllsit);
		return "index";
	}
}
