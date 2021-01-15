package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.modules.PiggyBank;
import com.lambdaschool.piggybank.repositories.PiggyBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PiggyBankController {
    @Autowired
    private PiggyBankRepository piggyBankRepository;

//    http://localhost:2019/total
    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?> getTotal(){
        List<PiggyBank> pigList = new ArrayList<>();
        piggyBankRepository.findAll().iterator().forEachRemaining(pigList::add);

        return new ResponseEntity<>(pigList, HttpStatus.OK);
}
