package com.example.bean;



import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class TempConfig{


    @Bean
    public ObjectMapper objectMapper(){
        //객체를제이선으로 제이선을객체로
        return new ObjectMapper();
    }
}