package cn.sm1234.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sm1234.domain.User;
import cn.sm1234.service.UserService;

public class UserServiceImpl implements UserService {

	public void saveUser(User user) {
		System.out.println("保存用户："+user);
	}

	public void updateUser(User user) {
		System.out.println("修改用户："+user);
	}

	public void deleteUser(Integer id) {
		System.out.println("删除用户："+id);
	}

	public List<User> findAllUser() {
		List<User> users = new ArrayList<User>();
		users.add(new User(1,"张三","男"));
		users.add(new User(2,"李四","男"));
		users.add(new User(3,"陈六","女"));
		return users;
	}

	public User findById(Integer id) {
		return new User(1,"露西","男");
	}

}
