package ServiceImpl;

import java.util.List;

import pojo.User;
import Dao.UserMappers;
import Service.userService;

public class userServiceImpl implements userService {
	private UserMappers userMappers;

	public UserMappers getUserMappers() {
		return userMappers;
	}

	public void setUserMappers(UserMappers userMappers) {
		this.userMappers = userMappers;
	}

	@Override
	public List<User> UserList() {
		// TODO Auto-generated method stub
		return userMappers.UserList();
	}

}
