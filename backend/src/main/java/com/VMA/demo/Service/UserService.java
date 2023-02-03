package com.VMA.demo.Service;

import com.VMA.demo.Entities.User;
import com.VMA.demo.Entities.UserRegister;
import com.VMA.demo.Repository.UserRepository;
import com.VMA.demo.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void checkAndRegister(UserRegister userRegister) throws UserException {
        String password=userRegister.getPassword();
        String confirmPassword=userRegister.getConfirmPassword();

        if (!password.equals(confirmPassword)){
            throw new UserException("Passwords must match!");
        }
        User user=new User();
        user.setUsername(userRegister.getUsername());
        user.setEmail(userRegister.getEmail());
        user.setPassword(userRegister.getPassword());
        user.setConfirmPassword(userRegister.getConfirmPassword());

        userRepository.save(user);

    }

}

