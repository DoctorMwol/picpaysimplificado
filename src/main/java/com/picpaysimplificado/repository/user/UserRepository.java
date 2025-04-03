package com.picpaysimplificado.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.picpaysimplificado.model.user.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}