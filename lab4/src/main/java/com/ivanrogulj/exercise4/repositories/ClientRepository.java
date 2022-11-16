package com.ivanrogulj.exercise4.repositories;

import com.ivanrogulj.exercise4.entitites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository <Client, Long> {



}
