package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao.NewsRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    @Override
    public List<News> findNewsBySourceText(String sourceText) {
        return newsRepository.findNewsBySourceText(sourceText);
    }

    @Override
    public List<News> findNewsByTopicName(String topicName) {
        return newsRepository.findNewsByTopicName(topicName);
    }
}
