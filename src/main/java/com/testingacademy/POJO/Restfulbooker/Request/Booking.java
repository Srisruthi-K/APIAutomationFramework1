package com.testingacademy.POJO.Restfulbooker.Request;

public class Booking {

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private String additionaldetails;

    public BookingDates getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(BookingDates bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getAdditionaldetails() {
        return additionaldetails;
    }

    public void setAdditionaldetails(String additionaldetails) {
        this.additionaldetails = additionaldetails;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private BookingDates bookingDates;



}
