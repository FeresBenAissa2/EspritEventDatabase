package com.projetjava.databaseprojetjavafx.DAO.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idLocal ;
    private String localName;
    private long localCapacity;
    private LocalDate localAvailableFrom  ;
    private LocalDate localAvailableUntil ;
    private boolean isBooked;

    @OneToMany(mappedBy = "eventLocal")
    private List<Event> events;

}
