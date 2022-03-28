package com.example.users.repository;

import com.example.users.model.ontoone.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser,Integer> {

    MyUser getMyUserByEmail(String email);

}
