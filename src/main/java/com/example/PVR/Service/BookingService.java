package com.example.PVR.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PVR.model.Booking;
import com.example.PVR.repository.BookingRepo;


@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepository;

    // Create single booking
    public String createBooking(Booking booking) {
        bookingRepository.save(booking);
        return "Booking successful for movie ID: " + booking.getMovie().getId() +
               " at " + booking.getShowtime() + " for " + booking.getSeats() + " seats.";
    }

    // Fetch all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

//    // Bulk insert multiple bookings
//    public List<Booking> saveBookings(List<Booking> bookings) {
//        return bookingRepository.saveAll(bookings);
//    }
}

//{
//	  "movie": {"id": 2},
//	  "cinema": {"id": 1},
//	  "userId": 207,
//	  "showtime": "2025-03-14T10:00:00",
//	  "seats": 5
//	}
