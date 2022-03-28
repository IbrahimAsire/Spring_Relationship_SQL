package com.example.users.model.manytomany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Classes {

    @Id
    private Integer id;

    private String name;

    private Integer count;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "classes")
    private Set<Student> students;
}
