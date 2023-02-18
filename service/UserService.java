package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {

	static List<User> user = new ArrayList<User>();

	static
	{
		user.add(new User(1,"jack",new Date()));
		user.add(new User(2,"king",new Date()));
		user.add(new User(3,"dhoni",new Date()));
		user.add(new User(4,"kholi",new Date()));
		user.add(new User(5,"nnn",new Date()));
	}

	public List<User> displayAll()
	{
		return user;
	}

	public User getById(int id)
	{
		for(User key : user)
		{
			if(key.getId()==id)
			{
				return key;
			}
		}
		return null;
	}
	
	public void removeById(int id)
	{
	user.remove(id);
		
	}
}
