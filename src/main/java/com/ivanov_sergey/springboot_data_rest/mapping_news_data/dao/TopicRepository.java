package com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
    public Page<Topic> findAll(Pageable pageable);
}
