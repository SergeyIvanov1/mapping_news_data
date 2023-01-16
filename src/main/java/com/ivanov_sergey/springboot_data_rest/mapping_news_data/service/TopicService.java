package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TopicService {

    public Page<Topic> findAll(Pageable pageable);
}
