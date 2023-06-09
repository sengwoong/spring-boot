package com.example.my.todo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.my.common.ResDTO;
import com.example.my.todo.dto.TodoDTO;
import com.example.my.todo.service.TodoServiceV2;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/todo")
public class TodoControllerApiV2 {
    private final TodoServiceV2 TodoServiceV2;

    @GetMapping
    public ResDTO<?> select() {
        return TodoServiceV2.findByDeleteYn('N');
    }

    @PostMapping
    public ResDTO<?> insert(@RequestBody TodoDTO.ReqBasic reqDto) {
        return TodoServiceV2.insert(reqDto);

    }

    // @RequestParam
    @PutMapping("/{idx}")
    public ResDTO<?> update(@PathVariable Integer idx) {
        return TodoServiceV2.update(idx);
    }

    // @RequestParam
    @DeleteMapping("/{idx}")
    public ResDTO<?> delete(@PathVariable Integer idx) {
        return TodoServiceV2.delete(idx);
    }

}
