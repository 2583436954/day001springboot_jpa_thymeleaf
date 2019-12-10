package com.wmc.springboot_jpa_thymeleaf.dao;

import com.wmc.springboot_jpa_thymeleaf.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
    User findByNameAndAge(String name,Integer age);
}