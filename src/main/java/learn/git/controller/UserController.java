package learn.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@GetMapping("/index")
	public String index(){
		return "Welcom to this Project!";
	}
	
	
}