package com.example.INOX.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.INOX.Service.BookingService;
import com.example.INOX.model.Booking;

@RestController
@RequestMapping("/api/v1")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Create a new booking (Single Booking)
    @PostMapping("/bookings")
    public ResponseEntity<String> createBooking(@RequestBody Booking booking) {
        String response = bookingService.createBooking(booking);
        return ResponseEntity.ok(response);
    }

    // Get all bookings
    @GetMapping("/bookings")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }

//    // Bulk insert multiple bookings
//    @PostMapping("/bulk")
//    public ResponseEntity<List<Booking>> addBookings(@RequestBody List<Booking> bookings) {
//        List<Booking> savedBookings = bookingService.saveBookings(bookings);
//        return new ResponseEntity<>(savedBookings, HttpStatus.CREATED);
//    }
}
