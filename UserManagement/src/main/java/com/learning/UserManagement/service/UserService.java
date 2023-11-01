package com.learning.UserManagement.service;

import java.util.List;

import com.learning.UserManagement.entities.User;
import com.learning.UserManagement.payloads.UserDto;

public interface UserService {
   UserDto addUser(User user);
   UserDto getUserById(int userId);
   List<UserDto> getAllUsers();
   UserDto updateUser(int userId,UserDto userDto);
   void delete(int userId);
   
   
   
}
