package com.bl.demo.service;

import com.bl.demo.dto.UserDto;
import com.bl.demo.model.User;

import java.util.List;

public interface IUserService {
    List<User> displayUser();
    User addUser(UserDto user);
    User updateUser(Integer userId, UserDto userDto);

}
