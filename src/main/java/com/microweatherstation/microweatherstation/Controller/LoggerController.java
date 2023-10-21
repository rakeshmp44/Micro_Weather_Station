package com.microweatherstation.microweatherstation.Controller;

import com.microweatherstation.microweatherstation.Model.Logger;
import com.microweatherstation.microweatherstation.service.LoggerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logger")
public class LoggerController {

<<<<<<< HEAD
    private final LoggerService loggerService;

    public LoggerController(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

=======
>>>>>>> origin/master
    @PostMapping("/addLogger")
    public Logger saveLogger(@RequestBody Logger logger) {
        return loggerService.saveLogger(logger);
    }

    @GetMapping("/getLogger")
    public List<Logger> getAllLoggers() {
        return loggerService.listAllActiveLoggers();
    }
}
