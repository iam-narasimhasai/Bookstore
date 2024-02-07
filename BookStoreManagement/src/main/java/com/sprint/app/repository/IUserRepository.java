package com.sprint.app.repository;


import org.springframework.data.repository.CrudRepository;
import com.sprint.app.entity.User;

public interface IUserRepository extends CrudRepository<User, Integer>,CustomUserRepository{

	

}
