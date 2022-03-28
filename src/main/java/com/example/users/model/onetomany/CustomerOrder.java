package com.example.users.model.onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class CustomerOrder {

    @Id
    private Integer id;
    private Integer total;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customer;
}
