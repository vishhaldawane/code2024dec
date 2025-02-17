package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomSecurityUser;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	 	@Autowired
	    private UserRepository userRepo;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	    {
	        User user = userRepo.findByUsername(username);

	        if(user == null)
	        {
	            throw new UsernameNotFoundException("Invalid username and password");
	        }
	        return new CustomSecurityUser(user);
	    }
}












/*
 	Mammal  WalkingDetails
 		|   |		|
 		|   |		Duck
 	   Person
 
 */

class Mammal //User
{
	
}

interface WalkingDetails
{
	
}

//CustomSecurityUser
class Person 	     extends Mammal implements WalkingDetails 
{
	
}

class FetchPersonDetailsService
{
		WalkingDetails loadPersonByPersonName(String name) {
			
			return new Person();
		}
}













