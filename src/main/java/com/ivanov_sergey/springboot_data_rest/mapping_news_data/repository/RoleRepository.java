package com.ivanov_sergey.springboot_data_rest.mapping_news_data.repository;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
