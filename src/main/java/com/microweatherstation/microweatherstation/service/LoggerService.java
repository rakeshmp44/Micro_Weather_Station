package com.microweatherstation.microweatherstation.service;

import com.microweatherstation.microweatherstation.Model.Logger;

import java.util.List;

public interface LoggerService {
    Logger saveLogger(Logger logger);
    List<Logger> listAllActiveLoggers();
}


// hi john