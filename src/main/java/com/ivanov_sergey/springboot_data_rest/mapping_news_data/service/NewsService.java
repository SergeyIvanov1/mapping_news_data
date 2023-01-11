package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface NewsService {
    public Page<News> findAll(Pageable pageable);

    Page<News> findNewsBySourceText(String sourceText, Pageable pageable);

    Page<News> findNewsByTopicName(String topicName, Pageable pageable);
}
