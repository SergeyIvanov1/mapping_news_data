package com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {

    public Page<News> findAll(Pageable pageable);
    public Page<News> findNewsBySourceText(String sourceText, Pageable pageable);
    public Page<News> findNewsByTopicName(String topicName, Pageable pageable);
}
