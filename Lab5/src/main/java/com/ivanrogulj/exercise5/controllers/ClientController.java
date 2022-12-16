package com.ivanrogulj.exercise5.controllers;

import com.ivanrogulj.exercise5.entitites.Client;
import com.ivanrogulj.exercise5.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
   private ClientService clientService;

    @PostMapping("")
    ResponseEntity<Client> saveClient(@RequestBody Client client, @RequestParam(required = true, name= "deviceId")long id) {
        return new ResponseEntity<>(clientService.saveClient(client, id), HttpStatus.OK);

    }

    @GetMapping("")
    ResponseEntity<Client> getClient(@RequestParam(required = true, name = "clientId")long id) {

       return new ResponseEntity<>(clientService.getClientById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    ResponseEntity<List<Client>>getAllClients()
    {
        return new ResponseEntity<>(clientService.getAllClients(), HttpStatus.OK);
    }

    @PutMapping("")

    ResponseEntity<Client>  updateClient(@RequestBody Client client,
                               @RequestParam(required = true, name = "clientId") long id)
    {
        return new ResponseEntity<>(clientService.updateClient(client, id),HttpStatus.OK);
    }

    @DeleteMapping("")

    ResponseEntity<Client>  deleteClientById(@RequestParam(required = true, name = "clientId")long id)
    {
        clientService.deleteClientById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
