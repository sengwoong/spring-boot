package com.example.my.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.my.todo.entity.TodoEntity;
import com.example.my.todo.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoEntity findByIdx(Integer idx) {
        return todoRepository.findByIdx(idx);
    }

    public List<TodoEntity> findByDeleteYn(Character delectYn) {
        return todoRepository.findByDeleteYn(delectYn);
    }
}
