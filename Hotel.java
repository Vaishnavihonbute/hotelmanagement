package com.hotelmanagement.hotelclass;

import com.hotelmanagement.booking.Booking;
import com.hotelmanagement.guest.Guest;
import com.hotelmanagement.room.Room;

import java.util.Scanner;

public class Hotel implements Booking {
    private Guest bookedGuest;
    private Room bookedRoom;
    private int bookedNights;

    Scanner sc = new Scanner(System.in);

    @Override
    public void createBooking(Guest guest, Room room, int numberOfNights) {
        if (room != null && room.isAvailable()) {
            bookedGuest = guest;
            bookedRoom = room;
            bookedNights = numberOfNights;
            bookedRoom.setAvailable(false); // Mark room as unavailable
            System.out.println("Booking created successfully!");
        } else {
            System.out.println("Room is not available for booking.");
        }
    }

    @Override
    public void displayBookingDetails() {
        if (bookedGuest != null && bookedRoom != null) {
            System.out.println("Booking Details:");
            System.out.println("Guest: " + bookedGuest);
            System.out.println("Room: " + bookedRoom);
            System.out.println("Number of Nights: " + bookedNights);
            calculateTotalPrice();
        } else {
            System.out.println("No booking details available.");
        }
    }

    @Override
    public void cancelBooking() {
        if (bookedGuest != null && bookedRoom != null) {
            bookedRoom.setAvailable(true); // Mark room as available again
            bookedGuest = null; // Clear guest details
            bookedRoom = null; // Clear room details
            bookedNights = 0; // Reset number of nights
            System.out.println("Booking canceled successfully!");
        } else {
            System.out.println("No booking to cancel.");
        }
    }

    @Override
    public void calculateTotalPrice() {
        if (bookedRoom != null) {
            double totalPrice = bookedRoom.getPricePerNight() * bookedNights;
            System.out.println("Total Price: $" + totalPrice);
        } else {
            System.out.println("No booking available to calculate the total price.");
        }
    }

	@Override
	public void calculateTotalPrice1() {
		// TODO Auto-generated method stub
		
	}
}
