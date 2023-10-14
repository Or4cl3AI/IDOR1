```java
package com.example.api.controller;

import com.example.api.model.Attack;
import com.example.api.service.AttackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/simulation")
public class SimulationController {

    private final AttackService attackService;

    @Autowired
    public SimulationController(AttackService attackService) {
        this.attackService = attackService;
    }

    @PostMapping("/attack")
    public ResponseEntity<String> simulateAttack(@RequestBody Attack attack) {
        // Inject malicious parameters to simulate IDOR attacks
        // Implement additional validation and authorization checks
        // Detect attempted attacks and log details to a database
        // Save attack details to PostgreSQL database
        // Support different attack scenarios and severities
        // Authorize access to routes and controller actions

        // Your code here

        return ResponseEntity.status(HttpStatus.OK).body("Attack simulated successfully");
    }

    @GetMapping("/logs")
    public ResponseEntity<List<Attack>> getAttackLogs() {
        // Generate logs for view in admin dashboard
        // Authorize access to routes and controller actions

        // Your code here

        return ResponseEntity.status(HttpStatus.OK).body(attackService.getAttackLogs());
    }
}
```
