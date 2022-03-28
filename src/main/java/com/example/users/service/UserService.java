package com.example.users.service;

import com.example.users.model.ontoone.MyUser;
import com.example.users.model.ontoone.MyUserDetails;
import com.example.users.pojo.UserPojo;
import com.example.users.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MyUser> getUsers() {
        List<MyUser> userList=userRepository.findAll();
        return userList;
    }


    public void addUser(UserPojo userPojo) {
        MyUser myUser=new MyUser(userPojo.getId(),userPojo.getEmail());

        MyUserDetails myUserDetails=new MyUserDetails(userPojo.getId()
                ,userPojo.getUsername(),
                userPojo.getPassword(),userPojo.getRole(),
                userPojo.getPhoneNumber());

        myUser.setMyUserDetails(myUserDetails);

        myUserDetails.setMyUser(myUser);

        userRepository.save(myUser);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

    public MyUser getUserByEmail(String email) {
        return  userRepository.getMyUserByEmail(email);
    }

}
