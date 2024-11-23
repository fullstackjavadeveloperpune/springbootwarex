package com.fullstack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("WELCOME TO FULL STACK JAVA DEVELOPER, PUNE");
    }

    @GetMapping("/services")
    public ResponseEntity<String> sayServices(){
        return ResponseEntity.ok("SOFTWARE DEVELOPMENT SERVICES");
    }
}
