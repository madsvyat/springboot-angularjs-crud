package com.madsvyat.crud.controller;

import com.madsvyat.crud.domain.User;
import com.madsvyat.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Infiltrator on 27.01.2015.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        user.setId(null);
        user.setCreatedDate(new Date());
        return userRepository.saveAndFlush(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void deleteUser(@PathVariable Long id) {
        userRepository.delete(id);        
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User updatedUser, @PathVariable Long id) {
        updatedUser.setId(id);
        return userRepository.save(updatedUser);
    }
}
