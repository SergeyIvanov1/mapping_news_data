package com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Source;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Integer> {
    public List<News> findAllBySourceContains(String sourceText);
    public List<News> findAllByTopicContains(String topicName);
}
