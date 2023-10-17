package com.amigoscode.springbootexample.service;

import com.amigoscode.springbootexample.dto.UserDto;
import com.amigoscode.springbootexample.model.User;

public interface UserService {

    User findByUsername(String username);
    User save (UserDto userDto);

}