package com.spring.aldair15.cors_demo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.aldair15.cors_demo.entity.Account;

import jakarta.persistence.EntityManager;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = "localhost:8080", maxAge = 1801)

public class AccountController {

    EntityManager entityManager;

    @CrossOrigin(origins = "localhost:8080", maxAge = 1801)
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")

    public Account retrieve(@PathVariable Long id) {
        return new Account(id, "aldair", "ryan");
    }

//    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
//    public void remove(@PathVariable Long id) {
//        return entityManager.remove(Account.findById(id));
//    }
}
