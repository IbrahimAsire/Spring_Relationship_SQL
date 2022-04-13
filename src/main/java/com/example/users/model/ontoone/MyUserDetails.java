package com.example.users.model.ontoone;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor @Data
public class MyUserDetails {

    @Id
    @Size(min = 1, max = 8)
    @Column(name = "user_id")
    private Integer id;
    @NotEmpty(message = "userName is empty!")
    private String username;
    @NotEmpty(message = "password is empty!")
    private String password;
    private String role;
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    @MapsId
    @JsonIgnore
    private MyUser myUser;

    public MyUserDetails(Integer id, String username, String password, String role, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.phoneNumber = phoneNumber;
    }
}