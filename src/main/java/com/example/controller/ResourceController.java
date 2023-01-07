package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping(value = "/resources")
    public ResponseEntity<String> getResource() {
        return new ResponseEntity<>("Get resource api call", HttpStatus.ACCEPTED);
    }
}
