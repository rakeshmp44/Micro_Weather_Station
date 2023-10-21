package com.microweatherstation.microweatherstation.Repository;

import com.microweatherstation.microweatherstation.Model.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoggerRepository extends JpaRepository<Logger, Long> {
    @Query("SELECT l from Logger l WHERE l.active =1")
    List<Logger> listAllActiveLoggerList();
}
