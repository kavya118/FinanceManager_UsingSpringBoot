package com.kavya.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/financemanager/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/{id}")
	public User getUser(@PathVariable("id") int id)
	{
		return userService.getUser(id);
	}
	
	@RequestMapping("")
	public List<User> getAllUsers()
	{
		return userService.getUsers();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")	
	public void addUser(@RequestBody User user)
	{
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}/update")	
	public void updateUser(@RequestBody User user)
	{		
		userService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public void deleteUser(@PathVariable("id") int id)
	{
		userService.deleteUser(id);
	}
}
