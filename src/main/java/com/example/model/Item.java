package com.example.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("public.items")
public class Item {
    @Id
    private Long id;
    private String name;
}
