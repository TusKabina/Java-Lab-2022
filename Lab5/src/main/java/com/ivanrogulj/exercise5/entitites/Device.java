package com.ivanrogulj.exercise5.entitites;


import lombok.Data;

import javax.persistence.*;

@Data @Entity
@Table(name = "device")
public class Device {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String name;

   // private Client client;
}
