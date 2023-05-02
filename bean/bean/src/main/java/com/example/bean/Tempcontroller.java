package com.example.bean;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class Tempcontroller {

//     @Autowired
// private  TempComponent tempComponent;

@Autowired
private  TempComponent tempComponent;
@Autowired
private ObjectMapper objectMapper;
// private final TempComponent tempComponent;
// private final ObjectMapper objectMapper;
// public Tempcontroller(TempComponent tempComponent,ObjectMapper objectMapper) {
//     this.tempComponent = tempComponent;
//     this.objectMapper=objectMapper;
// }
    @ResponseBody
    @GetMapping
   public String temp() throws JsonProcessingException{
    
tempComponent.print();


    String   write = objectMapper.writeValueAsString(new ArrayList<>());

System.out.println(write);
return "안녕하세요";
   }
}