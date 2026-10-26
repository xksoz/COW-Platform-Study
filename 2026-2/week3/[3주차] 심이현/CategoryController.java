package com.example.todo.controller;

import com.example.todo.dto.*;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor

public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping("api/categories")
    public CategoryResponseDto createCategory(@Valid @RequestBody CategoryCreateResquestDto request) {
        return categoryService.createCategory(request);
    }


    @GetMapping("api/categories/{categoryId}")
    public CategoryResponseDto getCategory(@PathVariable Long categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @DeleteMapping("api/categories/{categoryId}")
    public void deleteCategory(@PathVariable Long categoryId) {
        categoryService.deleteCategory(categoryId);
    }
}