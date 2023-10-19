package com.microweatherstation.microweatherstation.service;

import com.microweatherstation.microweatherstation.Model.Logger;
import com.microweatherstation.microweatherstation.Repository.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoggerServiceImpl implements LoggerService{
    @Autowired
    private LoggerRepository loggerRepository;

    @Override
    public Logger saveLogger(Logger logger) {
        return loggerRepository.save(logger);
    }

    @Override
    public List<Logger> listAllActiveLoggers() {
        return loggerRepository.findAll();

    }


}
