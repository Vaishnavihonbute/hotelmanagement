package com.hotelmanagement.test;

import com.hotelmanagement.guest.Guest;
import com.hotelmanagement.hotelclass.Hotel;
import com.hotelmanagement.room.Room;

import java.util.Scanner;

public class HotelManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Welcome to Hotel Management System");

        // Guest details input
        System.out.println("Please enter guest details:");
        System.out.println("Enter guest id:");
        int guestId = sc.nextInt();
        System.out.println("Enter guest name:");
        String guestName = sc.next();
        System.out.println("Enter guest phone number:");
        String phoneNumber = sc.next();
        System.out.println("Enter guest email:");
        String email = sc.next();
        System.out.println("Enter guest address:");
        String address = sc.next();
        System.out.println("Enter guest age:");
        int age = sc.nextInt();
        System.out.println("Enter guest gender:");
        String gender = sc.next();

        // Create Guest object
        Guest guest = new Guest(guestId, guestName, phoneNumber, email, address, age, gender);

        // Room details input
        System.out.println("\nBook a Room:");
        System.out.println("Enter room number:");
        int roomNumber = sc.nextInt();
        System.out.println("Enter room type:");
        String roomType = sc.next();
        System.out.println("Enter price per night:");
        int pricePerNight = sc.nextInt();
        System.out.println("Enter number of nights:");
        int numberOfNights = sc.nextInt();

        // Create Room object
        Room room = new Room(roomNumber, roomType, pricePerNight);

        // Perform booking
        hotel.createBooking(guest, room, numberOfNights);

        // Display booking details
        System.out.println("\nBooking Details:");
        hotel.displayBookingDetails();

        // Cancel booking
        System.out.println("\nCancel Booking:");
        hotel.cancelBooking();

        // Display updated booking details
        System.out.println("\nUpdated Booking Details:");
        hotel.displayBookingDetails();
    }
}
