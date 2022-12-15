package com.ivanrogulj.exercise5.controllers;

import com.ivanrogulj.exercise5.entitites.Client;
import com.ivanrogulj.exercise5.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
   private ClientService clientService;

    @PostMapping("")
    public Client saveClient(@RequestBody Client client, @RequestParam(required = true, name= "deviceId")long id) {
        return clientService.saveClient(client, id);

    }

    @GetMapping("")
    public Client getClient(@RequestParam(required = true, name = "clientId")long id) {

       return clientService.getClientById(id);
    }

    @GetMapping("/all")
    public List<Client> getAllClients()
    {
        return clientService.getAllClients();
    }

    @PutMapping("")

    public Client updateClient(@RequestBody Client client,
                               @RequestParam(required = true, name = "clientId") long id)
    {
        return clientService.updateClient(
                client, id);
    }

    @DeleteMapping("")

    public String deleteClientById(@RequestParam(required = true, name = "clientId")long id)
    {
        clientService.deleteClientById(id);
        return "Client deleted";
    }

}
