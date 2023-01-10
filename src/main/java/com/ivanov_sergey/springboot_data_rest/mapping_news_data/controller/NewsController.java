package com.ivanov_sergey.springboot_data_rest.mapping_news_data.controller;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao.NewsRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.News;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.exception_handling.EntityIncorrectData;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.exception_handling.NoSuchEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public List<News> getCountAnimalsByRule(){
        return newsRepository.findAll();
    }

    @GetMapping("/news/source/{source}")
    public List<News> findNewsBySourceText(@PathVariable String source){
        return newsRepository.findNewsBySourceText(source);
    }

    @GetMapping("/news/topic/{topic}")
    public List<News> findNewsByTopicName(@PathVariable String topic){
        return newsRepository.findNewsByTopicName(topic);
    }
}
