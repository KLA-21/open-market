package dev.learning.openmarket.controller;

import dev.learning.openmarket.dto.CategoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Говорит Спрингу: "Это бин, он обрабатывает HTTP запросы и возвращает JSON"
@RequestMapping("/api/v1/categories") // Базовый URL для всех методов в этом классе
public class CategoryController {

    @GetMapping // Обрабатывает GET-запрос на /api/v1/categories
    public List<CategoryDto> findAll() {
        // Пока имитируем базу данных
        return List.of(
                new CategoryDto(1L, "Электроника"),
                new CategoryDto(2L, "Книги"),
                new CategoryDto(3L, "Одежда")
        );
    }
}