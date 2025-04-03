package com.picpaysimplificado.service.users;

import org.springframework.stereotype.Service;

import com.picpaysimplificado.model.user.User;
import com.picpaysimplificado.repository.user.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
}
