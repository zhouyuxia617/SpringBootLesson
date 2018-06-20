package cn.et.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.sb.dao.UserRepository;
import cn.et.sb.entity.User;

@RestController("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/*
	 * 查询所有用户
	 * http://localhost:8080/queryAll
	 */
	@RequestMapping("/queryAll")
	//Iterable<User>自动转成json类型
	public Iterable<User> queryAll() {
		Iterable<User> userList = userRepository.findAll();
		
		return userList;
	}
	
	/*
	 * 查询指定条件用户
	 * http://localhost:8080/queryBy/WOMAN
	 */
	@RequestMapping("/queryBy/{gender}")
	public Iterable<User> queryByGender(@PathVariable String gender){
		Iterable<User> userList = userRepository.queryByGender(gender);
		
		return userList;
	}
	
	/*
	 * 删除指定用户
	 * http://localhost:8080/delete/A001
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable User id) {
		userRepository.delete(id);
		
		return null;
	}
	
	/*
	 * 新增用户
	 * http://localhost:8080/save/624/FPX/23/MAN
	 */
	@RequestMapping("/save/{id}/{name}/{age}/{gender}")
	public String delete(@PathVariable String id,
			@PathVariable String name,
			@PathVariable String age,
			@PathVariable String gender) {
		
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setGender(gender);
		
		userRepository.save(user);
		
		return null;
	}
	
}
