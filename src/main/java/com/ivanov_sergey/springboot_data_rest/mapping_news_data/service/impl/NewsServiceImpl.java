package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service.impl;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.repository.NewsRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.News;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;


    @Override
    public Page<News> findAll(Pageable pageable) {
        return newsRepository.findAll(pageable);
    }

    @Override
    public Page<News> findNewsBySourceText(String sourceText, Pageable pageable) {
        return newsRepository.findNewsBySourceText(sourceText, pageable);
    }

    @Override
    public Page<News> findNewsByTopicName(String topicName, Pageable pageable) {
        return newsRepository.findNewsByTopicName(topicName, pageable);
    }
}
