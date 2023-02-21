package com.example.websocket.service;

import com.example.websocket.dto.UserDto;
import com.example.websocket.model.User;
import com.example.websocket.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public User register(UserDto userDto){

        User user = new User();

        user.setUsername(userDto.getUsername());

        userRepository.save(user);

        return user;

    }
}
