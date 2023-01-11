package com.ivanov_sergey.springboot_data_rest.mapping_news_data.controller;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao.TopicRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TopicsController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping("/topics")
    public Page<Topic> showAllTopics(@PageableDefault(sort = { "id"},
            direction = Sort.Direction.DESC)Pageable pageable){
        return topicRepository.findAll(pageable);
    }
}
