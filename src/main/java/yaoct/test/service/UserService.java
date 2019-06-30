package yaoct.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yaoct.test.mapper.UserMapper;
import yaoct.test.pojo.User;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	public List<User> selectUsers() {
		return  userMapper.selectUsers();
	}
}
