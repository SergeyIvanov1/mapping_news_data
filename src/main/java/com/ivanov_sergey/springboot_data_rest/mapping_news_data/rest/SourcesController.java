package com.ivanov_sergey.springboot_data_rest.mapping_news_data.rest;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.repository.SourceRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.Source;
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
public class SourcesController {

    @Autowired
    private SourceRepository sourceRepository;

    @GetMapping("/sources")
    public Page<Source> showAllSources(@PageableDefault(sort = { "id"},
            direction = Sort.Direction.DESC)Pageable pageable){
        return sourceRepository.findAll(pageable);
    }
}
