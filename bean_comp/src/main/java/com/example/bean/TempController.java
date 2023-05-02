package com.example.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class TempController {
   
    @Autowired
    private Robot robot;
// private final Robot robot;
// public Tempcontroller(Robot robot) {
//     this.robot = robot;
// }원래이게더좋음
    @GetMapping
    @ResponseBody
    public String temp() throws JsonProcessingException {
        System.out.println(robot.toString());
        return "안녕하세요로봇";
    }

}
