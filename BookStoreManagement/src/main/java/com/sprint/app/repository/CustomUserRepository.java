package com.sprint.app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sprint.app.entity.User;

@Repository
public interface CustomUserRepository {

	public User getByName(String userName);
	public List<User> getByArea(String area);
	public List<User> getByCity(String city);
}
