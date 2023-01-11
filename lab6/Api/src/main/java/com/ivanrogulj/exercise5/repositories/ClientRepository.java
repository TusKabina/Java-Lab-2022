package com.ivanrogulj.exercise5.repositories;

import com.ivanrogulj.exercise5.entitites.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {

    Page<Client> findAll(Pageable pageable);

}
