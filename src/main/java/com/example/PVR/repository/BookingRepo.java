package com.example.PVR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PVR.model.Booking;
@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {

	

}
