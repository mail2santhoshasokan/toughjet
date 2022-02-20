package com.example.toughjet.controller;

import com.example.toughjet.domain.FlightSchedule;
import com.example.toughjet.service.ToughJetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
@RequestMapping("/toughjet")
@Validated()
public class ToughJetController {

    @Autowired
    private ToughJetService toughJetService;

    @GetMapping("/flightSchedules")
    public ResponseEntity<List<FlightSchedule>> getFlights(
            @RequestParam(name = "from") String from,
            @RequestParam(name = "to") String to,
            @RequestParam(name = "outboundDate") String outboundDate,
            @RequestParam(name = "inboundDate") String inboundDate,
            @RequestParam(name = "numberOfAdults") @Max(value = 4, message = "value must be equal to or less than four") int numberOfAdults) {
        return ResponseEntity.ok().body(toughJetService.getFlights(from, to, outboundDate, inboundDate, numberOfAdults));
    }

}
