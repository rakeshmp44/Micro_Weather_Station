package com.microweatherstation.microweatherstation.service;

import com.microweatherstation.microweatherstation.Model.Logger;
import com.microweatherstation.microweatherstation.Repository.LoggerRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoggerServiceImpl implements LoggerService{
    private final LoggerRepository loggerRepository;
    public LoggerServiceImpl(LoggerRepository loggerRepository) {
        this.loggerRepository = loggerRepository;
    }

    @Override
    public Logger saveLogger(Logger logger) {
        logger.setDt(new Date());
        return loggerRepository.save(logger);
    }

    @Override
    public List<Logger> listAllActiveLoggers() {
        return loggerRepository.listAllActiveLoggerList();
    }
}
