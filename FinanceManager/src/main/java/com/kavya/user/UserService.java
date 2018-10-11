package com.kavya.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	//List<User> users=null;
	
	public List<User> getUsers()
	{
		//List<User> users= new ArrayList<>();
		return userRepo.findAll();
		//return courses;
	}
	
	public User getUser(Integer id)
	{
		//return listTopic.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return userRepo.findById(id).get();
	}
	
	public void addUser(User user)
	{
		userRepo.save(user);
	}
	
	public void deleteUser(Integer id)
	{
		//listTopic.removeIf(t->t.getId().equals(id));
		userRepo.deleteById(id);
	}
	
	public void updateUser(User user)
	{
		/*for(int i=0;i<listTopic.size();i++)
		{
			Topic t=listTopic.get(i);
			if(t.getId().equals(id))
			{
				listTopic.set(i, topic);
				return;
			}
		}*/
		userRepo.save(user);
	}
}
