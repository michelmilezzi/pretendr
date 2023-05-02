package com.michelmilezzi.pretendr.ports;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String hello(@RequestParam(value = "name", defaultValue = "HAL9000") String name) {
        return String.format("Hi %s!", name);
    }

}
