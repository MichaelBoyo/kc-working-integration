package com.example.oauth2kc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TestController {

    List<String> todos = List.of("Buy Groceries", "Floating Berries");

    @GetMapping
    public List<String> geTodos() {
        return todos;
    }
}
