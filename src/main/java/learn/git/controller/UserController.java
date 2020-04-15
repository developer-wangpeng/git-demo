package learn.git.controller;

import learn.git.pojo.CallBackMsg;
import learn.git.pojo.User;
import learn.git.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public String index(){
		return "Welcom to this Project!";
	}
	
	@GetMapping("/getAllUser")
	public CallBackMsg getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/getUser")
	public CallBackMsg getUser(User user){
		return userService.getUser(user);
	}
	
	@PutMapping("/addUser")
	public CallBackMsg addUser(User user){
		return userService.addUser(user);
	}
	
	@GetMapping("/deleteUser")
	public CallBackMsg deleteUser(User user){
		return userService.deleteUser(user);
	}
	
	@PostMapping("/editUser")
	public CallBackMsg editUser(User user){
		return userService.editUser(user);
	}
}
