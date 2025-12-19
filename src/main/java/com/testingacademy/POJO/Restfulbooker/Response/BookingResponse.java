package com.testingacademy.POJO.Restfulbooker.Response;
import com.testingacademy.POJO.Restfulbooker.Request.Booking;

public class BookingResponse {

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    private Integer bookingid;
    private Booking booking;

}
