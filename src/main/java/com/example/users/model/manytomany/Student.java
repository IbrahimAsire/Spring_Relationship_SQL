package com.example.users.model.manytomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Student {
    @Id
    private Integer id;
    private String name;
    private Integer age;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Classes>classes;
}
