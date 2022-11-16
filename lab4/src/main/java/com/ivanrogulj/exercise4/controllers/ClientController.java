package com.ivanrogulj.exercise4.controllers;

import com.ivanrogulj.exercise4.entitites.Client;
import com.ivanrogulj.exercise4.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {

    @Autowired
   private ClientService clientService;

    @PostMapping("/client")
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);

    }

    @GetMapping("/client/{id}")
    public Client getClient(@PathVariable("id")long id) {

       return clientService.getClientById(id);
    }

    @GetMapping("/client")
    private List<Client> getAllClients()
    {
        return clientService.getAllClients();
    }

    @PutMapping("/client/{id}")

    public Client updateClient(@RequestBody Client client,
                     @PathVariable("id") long id)
    {
        return clientService.updateClient(
                client, id);
    }

    @DeleteMapping("/client/{id}")

    public String deleteClientById(@PathVariable("id") long id)
    {
        clientService.deleteClientById(id);
        return "Client deleted";
    }

}
