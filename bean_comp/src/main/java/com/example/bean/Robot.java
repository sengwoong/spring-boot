package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;


@Component
public class Robot {
    private final Arm arm;
    private final Leg leg;

    @Autowired
    public Robot(Arm arm, Leg leg) {
        this.arm = arm;
        this.leg = leg;
    }

}
