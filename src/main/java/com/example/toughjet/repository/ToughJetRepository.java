package com.example.toughjet.repository;

import com.example.toughjet.domain.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ToughJetRepository extends JpaRepository<FlightSchedule, Integer> {
    @Query(value = "SELECT * FROM FlightSchedule WHERE departureAirportName = :from AND arrivalAirportName = :to AND outboundDateTime >= :outboundDate AND inboundDateTime <= :inboundDate", nativeQuery = true)
    List<FlightSchedule> findAllFlightsMatchingTheSearch(String from, String to, String outboundDate, String inboundDate);
}
