package com.example.toughjet.service;

import com.example.toughjet.domain.FlightSchedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ToughJetService {
    List<FlightSchedule> getFlights(String from, String to, String outboundDate, String inboundDate, int numberOfAdults);
}
