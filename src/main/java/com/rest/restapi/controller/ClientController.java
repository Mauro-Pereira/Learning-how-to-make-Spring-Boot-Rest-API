package com.rest.restapi.controller;

import java.util.List;

import com.rest.restapi.model.Client;
import com.rest.restapi.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;
    
    @GetMapping
    public List<Client> GetClients(){
    
        return clientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client Add(@RequestBody Client client){
        return clientRepository.save(client);
    }
}
