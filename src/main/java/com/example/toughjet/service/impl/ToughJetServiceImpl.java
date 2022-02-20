package com.example.toughjet.service.impl;

import com.example.toughjet.domain.FlightSchedule;
import com.example.toughjet.repository.ToughJetRepository;
import com.example.toughjet.service.ToughJetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToughJetServiceImpl implements ToughJetService {

    @Autowired
    private ToughJetRepository toughJetRepository;

    @Override
    public List<FlightSchedule> getFlights(String from, String to, String outboundDate, String inboundDate, int numberOfAdults) {
        List<FlightSchedule> flightScheduleList = toughJetRepository.findAllFlightsMatchingTheSearch(from, to, outboundDate, inboundDate);
        return flightScheduleList;
    }
}
