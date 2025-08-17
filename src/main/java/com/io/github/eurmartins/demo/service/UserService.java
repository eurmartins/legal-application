package com.io.github.eurmartins.demo.service;

import com.io.github.eurmartins.demo.model.User;
import com.io.github.eurmartins.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserByEmail(String email){
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        return userRepository.findByEmail(email);
    }

    public Optional<User> getUserById(Long id){
        if(id == null){
            throw new IllegalArgumentException("ID cannot be null");
        }
        return userRepository.findById(id);
    }

    public void userDelete(Long id){
        if(id == null){
            throw new IllegalArgumentException("ID cannot be null");
        }
        userRepository.deleteById(id);
    }
}
