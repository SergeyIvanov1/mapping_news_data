package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;

import java.util.List;

public interface NewsService {

    List<News> showNewsBySource(String sourceText);

    List<News> showNewsByTopic(String topicName);
}
