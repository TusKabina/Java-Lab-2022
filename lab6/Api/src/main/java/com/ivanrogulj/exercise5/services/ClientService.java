package com.ivanrogulj.exercise5.services;

import com.ivanrogulj.exercise5.entitites.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClientService {

    Client saveClient(Client client, long id);
    Client getClientById(long id);
//    List<Client> getAllClients();
    Page<Client> getAllClients(Pageable pageable);
    Client updateClient(Client client, Long id);
    void deleteClientById(Long id);
}
