package com.example.users.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class UserPojo {

    private Integer id;
    private String username;
    private String password;
    private String role;
    private String email;
    private String phoneNumber;
}
