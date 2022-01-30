package com.spring.boot.userdept.repositories;

import com.spring.boot.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
