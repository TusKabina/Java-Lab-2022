package com.ivanrogulj.exercise4.services;

import com.ivanrogulj.exercise4.entitites.Client;

import java.util.List;

public interface ClientService {

    Client saveClient(Client client);
    Client getClientById(long id);
    List<Client> getAllClients();
    Client updateClient(Client client, Long id);
    void deleteClientById(Long id);
}
