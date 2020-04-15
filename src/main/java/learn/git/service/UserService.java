package learn.git.service;

import learn.git.pojo.CallBackMsg;
import learn.git.pojo.User;

public interface UserService {

	CallBackMsg addUser(User user);
	
	CallBackMsg getUser(User user);
	
	CallBackMsg editUser(User user);
	
	CallBackMsg deleteUser(User user);
	
	CallBackMsg getAllUser();
}
