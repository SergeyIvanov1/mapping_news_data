package com.ivanov_sergey.springboot_data_rest.mapping_news_data.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
    private String username;
    private String password;
}
