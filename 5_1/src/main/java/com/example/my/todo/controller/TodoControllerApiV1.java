package com.example.my.todo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.my.common.ResDTO;
import com.example.my.todo.service.TodoServiceV1;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/todo")
public class TodoControllerApiV1 {
    private final TodoServiceV1 TodoServiceV1;

    @GetMapping
    public ResDTO<?> select() {
        return TodoServiceV1.findByDeleteYn('N');
    }

    @PostMapping
    public ResDTO<?> insert(@RequestParam String content) {
        return TodoServiceV1.insert(content);

    }

    @PutMapping
    public ResDTO<?> update(@RequestParam Integer idx) {
        return TodoServiceV1.update(idx);
    }

    @DeleteMapping
    public ResDTO<?> delete(@RequestParam Integer idx) {
        return TodoServiceV1.delete(idx);
    }

}
