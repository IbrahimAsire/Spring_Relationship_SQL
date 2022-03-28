package com.example.users.model.onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Customer {

    @Id
    private Integer id;
    private String name;
    private String age;

    @OneToMany(mappedBy = "customer")
    private Set<CustomerOrder> orders;
}
