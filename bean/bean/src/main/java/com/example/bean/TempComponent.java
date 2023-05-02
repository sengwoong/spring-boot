package com.example.bean;

import org.springframework.stereotype.Component;
//Component 는 생성방법 명시
@Component
public class TempComponent {
    public void print() {
        System.out.println("작동확인");
    }
}
