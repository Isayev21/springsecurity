package com.example.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : AliIsayev
 * @mailto : aisayev@aris.az
 * @created : 7/28/2022, Thursday
 **/
@Configuration
public class PasswordConfig {

    @Bean
   public PasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder(10);
   }
}
