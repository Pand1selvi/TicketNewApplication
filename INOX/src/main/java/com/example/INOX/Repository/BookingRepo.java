package com.example.INOX.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.INOX.model.Booking;
@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
