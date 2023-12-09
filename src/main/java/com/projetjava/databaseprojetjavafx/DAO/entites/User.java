package com.projetjava.databaseprojetjavafx.DAO.entites;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
    private String username ;
    private String password ;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "president")
    List<Club> clubs;

    @ManyToMany (mappedBy = "participants")
    private List<Event> events;
}
