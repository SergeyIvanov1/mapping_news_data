package com.ivanov_sergey.springboot_data_rest.mapping_news_data.repository;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
