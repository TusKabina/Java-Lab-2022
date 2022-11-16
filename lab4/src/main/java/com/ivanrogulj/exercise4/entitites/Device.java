package com.ivanrogulj.exercise4.entitites;


import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class Device {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn (
            referencedColumnName = "id", unique = true
    )
    private Client client;
}
