package com.ivanov_sergey.springboot_data_rest.mapping_news_data.rest;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.repository.NewsRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/news")
    public Page<News> showAllNews(@PageableDefault(sort = { "id"},
            direction = Sort.Direction.DESC)Pageable pageable){
        return newsRepository.findAll(pageable);
    }

    @GetMapping("/news/source/{source}")
    public Page<News> showNewsBySourceText(@PathVariable String source,
                                           @PageableDefault(sort = { "id"},
                                                   direction = Sort.Direction.DESC)Pageable pageable){
        return newsRepository.findNewsBySourceText(source, pageable);
    }

    @GetMapping("/news/topic/{topic}")
    public Page<News> showNewsByTopicName(@PathVariable String topic,
                                          @PageableDefault(sort = { "id"},
                                                  direction = Sort.Direction.DESC)Pageable pageable){
        return newsRepository.findNewsByTopicName(topic, pageable);
    }
}
