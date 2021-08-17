package ru.johnmorf.petproject.webapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class MainController {

    @GetMapping
    public ResponseEntity<?> index() {
        return ResponseEntity.ok("Hello world");
    }

}
