package learn.git.service.impl;

import java.util.List;

import learn.git.pojo.CallBackMsg;
import learn.git.pojo.User;
import learn.git.repository.UserMapper;
import learn.git.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userDao;

	@Override
	public CallBackMsg addUser(User user) {
		userDao.addUser(user);
		List<User> list = userDao.getAllUser();
		return new CallBackMsg.Builder().status("success").object(list).build();
		
	}

	@Override
	public CallBackMsg getUser(User user) {
		User result = userDao.getUser(user);
		return new CallBackMsg.Builder().status("success").object(result).build();
	}

	@Override
	public CallBackMsg editUser(User user) {
		userDao.editUser(user);
		User result = userDao.getUser(user);
		return new CallBackMsg.Builder().status("success").object(result).build();
	}

	@Override
	public CallBackMsg deleteUser(User user) {
		userDao.deleteUser(user);
		List<User> list = userDao.getAllUser();
		return new CallBackMsg.Builder().status("success").object(list).build();
	}

	@Override
	public CallBackMsg getAllUser() {
		List<User> list = userDao.getAllUser();
		return new CallBackMsg.Builder().status("success").object(list).build();
	}


	
		
}
