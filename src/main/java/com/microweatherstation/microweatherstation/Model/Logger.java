package com.microweatherstation.microweatherstation.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "logger")
public class Logger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Pressure")
    private Double Pr;

    @Column(name = "Temperature")
    private Double Tp;

    @Column(name = "Humidity")
    private Double Hu;

    @Column(name = "wind_direction")
    private String Di;

    @Column(name = "wind_speed")
    private Double Sp;

    @Column(name = "leaf_wetness")
    private Double Lw;

    @Column(name = "light_intensity")
    private Double Li;

    @Column(name = "soil_temperature")
    private Double St;

    @Column(name = "Rainfall")
    private Double Rf;


    @Column(name = "active",columnDefinition = "TINYINT DEFAULT 1")
    private int active=1;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "logger_date")
    private Date Dt;

    @Column(name = "active", nullable = true, columnDefinition = "TINYINT(1) default 1")
    private int active=1;

}
