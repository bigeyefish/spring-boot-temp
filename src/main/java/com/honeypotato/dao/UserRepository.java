package com.honeypotato.dao;

import com.honeypotato.model.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lenovo on 2018/1/25.
 */
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUserName(String userName);
}
