package com.bl.demo.service;

import com.bl.demo.model.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    @Override
    public List<User> displayUser() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(UserDto userDto) {
        User user = new User(userDto);
        return userRepository.save(user);
    }
    @Override
    public User updateUser(Integer userId, UserDto userDto) {
        User user = userRepository.findById(userId).get();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());        //add
        return user;
    }
}
