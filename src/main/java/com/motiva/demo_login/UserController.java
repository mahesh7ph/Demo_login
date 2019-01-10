package com.motiva.demo_login;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motiva")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/login/{username}/{password}")
	public UserDtos validateUser(@PathVariable(value="username") String username,@PathVariable(value="password") String password) {
		return userService.getUserDetails(username,password);

 }
}