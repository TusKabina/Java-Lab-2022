package com.ivanrogulj.exercise5.entitites;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private long id;

    @Column
    private String name;

    @Column(unique = true)
    private String address;
    @OneToOne (

            cascade = CascadeType.ALL
    )
    @JoinColumn (
          name="device_id",  referencedColumnName = "id", unique = true
    )
    private Device device;
}
