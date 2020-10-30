package com.utpproject.sales_management.controllers;

import com.utpproject.sales_management.models.Clients;
import com.utpproject.sales_management.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @PostMapping("/save")
    public Clients save(@RequestBody Clients client) {
        return clientRepository.save(client);
    }

    @RequestMapping("/ga")
    public String prueba(@RequestParam String id) {

        return id;
    }
}
