package com.ivanrogulj.exercise5.entitites;


import javax.persistence.*;

@Entity
@lombok.Data
public class Data {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private long id;
    @Column
    private String year;
    @Column
    private String month;
    @Column
    private String value;

    @ManyToOne (

            cascade = CascadeType.ALL
    )
    @JoinColumn (
            referencedColumnName = "id"
    )
    private Device Device;

}
