package com.sprint.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.entity.User;
import com.sprint.app.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepository userrepo;
	
	@Override
	public User getUser(int userId) {
		
		return userrepo.findById(userId).get();
	}

	@Override
	public List<User> getAllUsers() {
		
		List<User> userList=(List<User>) userrepo.findAll();
		return userList;
	}

	@Override
	public boolean removeUser(int userId) {
	
		userrepo.deleteById(userId);
		return true;
	}

	@Override
	public User getByName(String userName) {
		
		return userrepo.getByName(userName);
	
	}

	@Override
	public List<User> getByArea(String area) {
		
		return userrepo.getByArea(area);
	}

	@Override
	public List<User> getByCity(String city) {
		
		return userrepo.getByCity(city);
	}

}
