package com.microweatherstation.microweatherstation.Controller;

import com.microweatherstation.microweatherstation.Model.Logger;
import com.microweatherstation.microweatherstation.Repository.LoggerRepository;
import com.microweatherstation.microweatherstation.service.LoggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/logger")
public class LoggerController {
    @Autowired
    private LoggerService loggerService;

    @PostMapping("/addLogger")
    public Logger saveLogger(@RequestBody Logger logger) {
        return loggerService.saveLogger(logger);
    }

    @GetMapping("/getLogger")
    public List<Logger> getAllLoggers() {
        return loggerService.listAllActiveLoggers();
    }
}
