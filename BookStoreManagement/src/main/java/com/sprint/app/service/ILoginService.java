package com.sprint.app.service;

import org.springframework.stereotype.Service;
import com.sprint.app.entity.User;

@Service
public interface ILoginService {

	public User addUser(User user);
	public boolean validateUser(User user);
}
