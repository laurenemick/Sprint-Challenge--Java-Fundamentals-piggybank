package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController // turns into BEAN
public class CoinController
{
    @Autowired
    CoinRepository coinrepos;

    // http://localhost:2019/total 
}
