package com.example.my.todo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.my.todo.entity.TodoEntity;
import com.example.my.todo.repository.TodoRepository;
import com.example.my.todo.service.TodoDTO;
import com.example.my.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(@RequestParam(name = "idx", defaultValue = "1")
    // Integer idx) {
    // // ResponseBody는 json으로바뀜
    // return todoService.findByIdx(idx);
    // }
    // http://localhost:6060/?idx=1

    // http://localhost:6060/1
    // @GetMapping("/{idx}")
    // @ResponseBody
    // public TodoEntity hello(@PathVariable Integer idx) {
    // // ResponseBody는 json으로바뀜
    // return todoService.findByIdx(idx);
    // }

    // //
    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(Map<String, Object> map) {
    // // ResponseBody는 json으로바뀜
    // System.out.println(map);
    // return null;
    // }

    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(TodoDTO.ReqHello reqDto) {
    // // ResponseBody는 json으로바뀜
    // System.out.println(reqDto);
    // return todoService.findByIdx(reqDto.getIdx());
    // }

    // http://localhost:6060/1?search=asdf
    // @GetMapping("/{idx}/{search}")
    // @ResponseBody
    // public TodoEntity hello(
    // @PathVariable Integer idx,
    // @PathVariable String search) {
    // System.out.println(idx);
    // System.out.println(search);
    // return null;
    // }

    @GetMapping("/")
    @ResponseBody
    public TodoEntity hello(
            @RequestBody TodoDTO.ReqHello reqDto) {
        System.out.println(reqDto);

        return null;
    }

    // delect ynlist
    @GetMapping("/todoList")
    public String todoList(Model model) {

        List<TodoEntity> todoList = todoService.findByDeleteYn('N');
        long todoCount = todoList.stream().filter((todoEntity) -> todoEntity.getDoneYn().equals('N')).count();

        model.addAttribute("todoList", todoList);
        model.addAttribute("todoCount", todoCount);

        return "todoList";
    }
}
