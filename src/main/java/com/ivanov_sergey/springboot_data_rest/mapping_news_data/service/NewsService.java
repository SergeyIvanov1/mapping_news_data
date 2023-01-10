package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;

import java.util.List;

public interface NewsService {

    List<News> findNewsBySourceText(String sourceText);

    List<News> findNewsByTopicName(String topicName);
}
