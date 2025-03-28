package com.example.AGS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AGS.model.Booking;
@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

}
