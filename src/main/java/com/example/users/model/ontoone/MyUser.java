package com.example.users.model.ontoone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @NoArgsConstructor
@Entity
public class MyUser {

    @Id
    private Integer id;
    @Column(unique = true,nullable = false)
    private String email;

    @OneToOne(mappedBy = "myUser",cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private MyUserDetails myUserDetails;

    public MyUser(Integer id, String email) {
        this.id = id;
        this.email = email;
    }
}
