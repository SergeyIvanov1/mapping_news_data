package com.ivanov_sergey.springboot_data_rest.mapping_news_data.service;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Source;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface SourceService {

    public Page<Source> findAll(Pageable pageable);
}
