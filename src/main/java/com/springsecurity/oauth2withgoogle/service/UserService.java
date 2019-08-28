package com.springsecurity.oauth2withgoogle.service;

import com.springsecurity.oauth2withgoogle.model.User;
import com.springsecurity.oauth2withgoogle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUserFromGoogleInfo(Map<String, Object> userInfoMap) {
        User user = new User();
        user.setFirstName((String) userInfoMap.get("given_name"));
        user.setLastName((String) userInfoMap.get("family_name"));
        user.setEmail((String) userInfoMap.get("email"));
        user.setProfilePic((String) userInfoMap.get("picture"));
        System.out.println("User : " + user);
        userRepository.save(user);
        return user;
    }


}
