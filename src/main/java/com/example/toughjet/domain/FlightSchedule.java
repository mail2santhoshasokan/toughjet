package com.example.toughjet.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity(name = "FlightSchedule")
public class FlightSchedule {

    @Id
    private int id;

    @Column
    private String carrier;

    @Column
    private String basePrice;

    @Column
    private String tax;

    @Column
    private String discount;

    @Column
    private String departureAirportName;

    @Column
    private String arrivalAirportName;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss.SSS")
    private LocalDateTime outboundDateTime;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss.SSS")
    private LocalDateTime inboundDateTime;

}
