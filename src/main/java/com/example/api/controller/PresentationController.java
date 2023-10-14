```java
package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/presentation")
public class PresentationController {

    @GetMapping("/dashboard")
    public String getDashboard() {
        // Code to retrieve and return the dashboard data
        return "Dashboard data";
    }

    @GetMapping("/admin")
    public String getAdminDashboard() {
        // Code to retrieve and return the admin dashboard data
        return "Admin dashboard data";
    }

    @GetMapping("/tester")
    public String getTesterDashboard() {
        // Code to retrieve and return the tester dashboard data
        return "Tester dashboard data";
    }
}
```
