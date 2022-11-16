package com.ivanrogulj.exercise4.entitites.dto;


import lombok.Builder;

@Builder
public class ClientDTO {

    private long id;

    private String name;

    private String address;
}
