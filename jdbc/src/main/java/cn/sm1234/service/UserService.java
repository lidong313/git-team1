package cn.sm1234.service;

import java.util.List;

import javax.jws.WebService;

import cn.sm1234.domain.User;

/**
 * 
 * @WebService 把该类标注为WebService接口，可能被远程客户端调用
 *   注意：该注解需要在JDK1.6以上可以使用
 */
@WebService
public interface UserService {

	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
	
	public List<User> findAllUser();
	
	public User findById(Integer id);
}
