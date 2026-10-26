package com.example.todo.controller;

import com.example.todo.dto.*;

        import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
        import jakarta.validation.Valid;


@RestController
@RequiredArgsConstructor

public class TodoController {

    private final TodoService todoService;

    @PostMapping("api/todos")
    public TodoResponseDto createTodo(@Valid @RequestBody TodoCreateRequestDto request) {
        return todoService.createTodo(request);
    }

    @GetMapping("api/todos/{todoId}")
    public TodoResponseDto getTodo(@PathVariable Long todoId) {
        return todoService.getTodo(todoId);
    }

    @DeleteMapping("api/todos/{todoId}")
    public void deleteTodo(@PathVariable Long todoId) {
        todoService.deletetodo(todoId);
    }
}
