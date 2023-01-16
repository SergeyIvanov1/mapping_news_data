package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.User;

import java.util.List;

public interface UserService {
    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findByID(Long id);

    void delete(Long id);
}
