package yaoct.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import yaoct.test.pojo.User;
import yaoct.test.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(name="/users",method=RequestMethod.GET)
	@ResponseBody
	List<User> mmm(){
		return userService.selectUsers();
	}
}
