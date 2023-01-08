package com.ivanov_sergey.springboot_data_rest.mapping_news_data.controller;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.dao.NewsRepository;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.exception_handling.EntityIncorrectData;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.exception_handling.NoSuchEntityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RESTController {

    @Autowired
    private NewsRepository newsRepository;

//    @PostMapping("/animals/count")
//    public String getCountAnimalsByRule(@RequestBody RuleDTO ruleDTO){
//        Integer countAnimals = entityService.getCountAnimalsByRule(ruleDTO);
//        return "Колличество животных - " + countAnimals;
//    }

    @ExceptionHandler
    public ResponseEntity<EntityIncorrectData> handleException(NoSuchEntityException exception){
        EntityIncorrectData data = new EntityIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EntityIncorrectData> handleException(RuntimeException exception){
        EntityIncorrectData data = new EntityIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
