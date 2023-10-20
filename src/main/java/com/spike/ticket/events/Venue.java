package com.spike.ticket.events;


import java.time.LocalDate;

public record Venue(
        int id,
        String name,
        String street,
        String city,
        String country) {
}
