package com.example.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/api")
public class HelloController {

    @Get("/hello/{name}")
    public HttpResponse<?> sayHello(@PathVariable String name) {
        return HttpResponse.ok("Hello " + name);
    }
}
