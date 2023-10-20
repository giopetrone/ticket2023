package com.spike.ticket.events;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrganizerRepository {

    private final List<Organizer> organizers = List.of(
            new Organizer(101, "gio", "Globomantics Technology Corporation"),
            new Organizer(102, "alf", "Carved Rock Sports Equipment"));

    public List<Organizer> findAll() {
        return organizers;
    }
}
