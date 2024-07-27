package com.demo.datasaverapplication.controller;

import com.demo.datasaverapplication.service.DataSaverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DataSaverController {

    private final DataSaverService dataSaverService;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from Data Saver Application!");
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveData() {
        this.dataSaverService.save(this.generateRandomString());

        return ResponseEntity.ok(HttpEntity.EMPTY);
    }

    @PostMapping("/clean")
    public ResponseEntity<?> clean() {
        this.dataSaverService.cleanAll();

        return ResponseEntity.ok(HttpEntity.EMPTY);
    }

    private String generateRandomString() {
        return UUID.randomUUID() + "-" + LocalDateTime.now();
    }
}
