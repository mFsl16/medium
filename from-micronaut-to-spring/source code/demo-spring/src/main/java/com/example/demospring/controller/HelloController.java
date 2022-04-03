package com.example.demospring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<?> sayHello(@PathVariable String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
