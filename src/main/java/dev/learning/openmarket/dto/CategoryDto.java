package dev.learning.openmarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Lombok: сгенерирует геттеры, сеттеры, equals, hashCode и toString
@AllArgsConstructor // Lombok: конструктор со всеми полями
@NoArgsConstructor  // Lombok: пустой конструктор (нужен для JSON библиотек)
public class CategoryDto {
    private Long id;
    private String title;
}