```java
package com.example.api.controller;

import com.example.api.model.Attack;
import com.example.api.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LoggingController {

    private final LoggingService loggingService;

    @Autowired
    public LoggingController(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @PostMapping
    public ResponseEntity<String> logAttack(@RequestBody Attack attack) {
        loggingService.saveAttack(attack);
        return ResponseEntity.status(HttpStatus.CREATED).body("Attack logged successfully");
    }
}
```
