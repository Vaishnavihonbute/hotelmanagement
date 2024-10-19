package com.hotelmanagement.booking;

import com.hotelmanagement.guest.Guest;
import com.hotelmanagement.room.Room;

public interface Booking {
public  void createBooking(Guest guest, Room room, int numberOfNights);
public void displayBookingDetails();
public void cancelBooking();
public void calculateTotalPrice();
void calculateTotalPrice1();

}
