package com.example.my.todo.service;

import lombok.Data;

public class TodoDTO {

    @Data
    public static class ReqHello {
        private Integer idx;
        private String search;
    }

    // @Data
    // public static class ReqDeleteYn {

    // private char search;
    // }

}
// a
