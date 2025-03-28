
package com.example.AGS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AGS.Repository.BookingRepo;
import com.example.AGS.model.Booking;


@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepository;
//
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













//package com.example.AGS.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.AGS.Repository.BookingRepo;
//import com.example.AGS.Repository.CinemaRepo;
//import com.example.AGS.Repository.MovieRepo;
//import com.example.AGS.model.Booking;
//import com.example.AGS.model.Cinema;
//import com.example.AGS.model.Movie;
//
//@Service
//public class BookingService {
//	@Autowired
// BookingRepo bookingRepository;
//	  public Booking bookMovie(Booking booking) {
//	        return bookingRepository.save(booking);
//	    }
//	 
//
//	public List<Booking> getBooking() {
//		// TODO Auto-generated method stub
//		return bookingRepository.findAll();
//	}
//
//
//	
//		 
//
//
////		public List<Booking> saveBookings(List<Booking> bookings) {
////			return bookingRepository.saveAll(bookings);
////}
//
//@Autowired
//    private  MovieRepo movieRepository;
//@Autowired
//    private  CinemaRepo cinemaRepository;
//
//    
//
//    public String createBooking(Booking booking) {
//        Optional<Movie> movie = movieRepository.findById(booking.getMovie().getId());
//        Optional<Cinema> cinema = cinemaRepository.findById(booking.getCinema().getId());
//
//        if (movie.isEmpty() || cinema.isEmpty()) {
//            return "Invalid movie or cinema ID.";
//        }
//
//        Booking booking1 = new Booking(
//                movie.get(),
//                cinema.get(),
//                booking.getUserId(),
//                booking.getShowtime(),
//                booking.getSeats()
//        );
//
//        bookingRepository.save(booking1);
//        return "Booking successful for movie: " + movie.get().getTitle() +
//                " at " + booking.getShowtime() + " for " + booking.getSeats() + " seats.";
//    }}