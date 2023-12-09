package com.projetjava.databaseprojetjavafx.DAO.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClub;
    private String clubName;
    private String clubDescription;
    private LocalDate foundingDate;
    private String clubEmail;
    private ClubState clubState;
    // responsable club
    @ManyToOne
    private User president;

    @OneToMany(mappedBy = "club")
    private List<Event> events;

}
