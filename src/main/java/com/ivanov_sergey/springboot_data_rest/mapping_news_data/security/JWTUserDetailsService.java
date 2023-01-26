package com.ivanov_sergey.springboot_data_rest.mapping_news_data.security;

import com.ivanov_sergey.springboot_data_rest.mapping_news_data.model.User;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.security.jwt.JwtUser;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.security.jwt.JwtUserFactory;
import com.ivanov_sergey.springboot_data_rest.mapping_news_data.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JWTUserDetailsService implements UserDetailsService {


    private final UserService userService;

    @Autowired
    public JWTUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("User with username: " + username + " not found");
        }

        JwtUser jwtUser = JwtUserFactory.create(user);
        log.info("IN loadUserByUsername - user with username: {} successfully loaded", username);
        return jwtUser;
    }
}
