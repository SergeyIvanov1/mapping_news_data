package com.ivanov_sergey.springboot_data_rest.mapping_news_data.repository;


import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.Source;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, Integer> {
       public Page<Source> findAll(Pageable pageable);
}
