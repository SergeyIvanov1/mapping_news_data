package com.ivanov_sergey.springboot_data_rest.mapping_news_data.controller;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao.TopicRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Topic;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.exception_handling.EntityIncorrectData;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.exception_handling.NoSuchEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TopicsController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping("/topics")
    public List<Topic> getCountAnimalsByRule(){
        return topicRepository.findAll();
    }
}
