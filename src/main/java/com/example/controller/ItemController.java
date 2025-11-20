package com.example.controller;

import com.example.model.Item;
import com.example.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/items")
public class ItemController {


    private final ItemRepository repo;

    public ItemController(ItemRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public Flux<Item> all() {
        return repo.findAll();
    }


    @PostMapping
    public Mono<Item> add(@RequestBody Item item) {
        return repo.save(item);
    }
}