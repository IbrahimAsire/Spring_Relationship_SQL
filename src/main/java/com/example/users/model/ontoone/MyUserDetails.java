package com.example.users.model.ontoone;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor @Data
public class MyUserDetails {

    @Id
    @Column(name = "user_id")
    private Integer id;
    private String username;
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
