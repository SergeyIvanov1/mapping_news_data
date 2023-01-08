package com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, Integer> {

}
