package com.learning.UserManagement.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.UserManagement.entities.User;
import com.learning.UserManagement.payloads.UserDto;
import com.learning.UserManagement.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto addUser(User user) {
		User savedUser = this.userRepository.save(user);
		return this.modelMapper.map(savedUser, UserDto.class);
	}

	@Override
	public UserDto getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(int userId, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub

	}

}
