package com.projetjava.databaseprojetjavafx.DAO.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idEvent ;
    private String eventName;
    private String eventDescription ;
    private LocalDate eventDate;
    private LocalDate eventStartTime ;
    private LocalDate eventEndTime ;
    private EventState eventState;
    @ManyToOne
    private Club club;

    @ManyToOne
    private Local eventLocal;

    @ManyToMany
    private List<User> participants;
}
