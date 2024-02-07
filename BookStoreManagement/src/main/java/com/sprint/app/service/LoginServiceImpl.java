package com.sprint.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint.app.entity.User;
import com.sprint.app.repository.ILoginRepository;

@Service
public class LoginServiceImpl implements ILoginService{

	@Autowired
	ILoginRepository loginrepo;
	
	@Override
	public User addUser(User user) 
	{
		User log=loginrepo.save(user);
		return log;
	}


	@Override
	public boolean validateUser(User user) {

		//User Validation needs to be done here
		return false;
	}

	
	

}
