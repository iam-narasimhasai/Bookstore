package com.sprint.app.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.app.entity.User;
import com.sprint.app.service.ILoginService;
import com.sprint.app.service.IUserService;

@RestController
@CrossOrigin(origins = {"http://localhost:8099", "http://localhost:4200"},allowedHeaders = "*")			
@RequestMapping("/store")
@Validated
public class UserController {
	
	@Autowired
	ILoginService loginService;
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody @Valid User u)
	{
		User user=loginService.addUser(u);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	@GetMapping("/user")
	public User getUser(@RequestParam int id) {
		
		User u=userService.getUser(id);
		
		if(u==null) {
			return null;
		}
		
		return u;
	}
	
	
	@DeleteMapping("/user")
	public boolean removeUser(@RequestParam int id){
		
		return userService.removeUser(id);
	}
	
	
	@GetMapping("/users")
	public List<User> allUsers(){
		
		return userService.getAllUsers();
	}
	
	@GetMapping("/details")
	public User getByName(@RequestParam String userName){
		
		return userService.getByName(userName);	
		
	}
	
	@GetMapping("/user/area")
	public List<User> getByArea(@RequestParam String area){
		
		return userService.getByArea(area);
		
	}
	
	
	@GetMapping("/user/city")//
	public List<User> getByCity(@RequestParam String city){
		
		return userService.getByCity(city);
		
	}
	
	@PutMapping("/user/{id}")
	public boolean upateUser(@RequestBody User u,int id) {
		
		  loginService.addUser(u);
		return true;
	}
	
}
