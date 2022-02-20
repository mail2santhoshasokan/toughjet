package com.example.toughjet.factory;

import com.example.toughjet.domain.FlightSchedule;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TestFactory {

    public static List<FlightSchedule> flightScheduleList(){
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.setCarrier("Lufthansa");
        flightSchedule.setBasePrice("1500");
        flightSchedule.setTax("10");
        flightSchedule.setDiscount("10");
        flightSchedule.setDepartureAirportName("LHR");
        flightSchedule.setArrivalAirportName("COK");
        flightSchedule.setInboundDateTime(LocalDateTime.now());
        flightSchedule.setOutboundDateTime(LocalDateTime.now());

        return Arrays.asList(flightSchedule);

    }

}
