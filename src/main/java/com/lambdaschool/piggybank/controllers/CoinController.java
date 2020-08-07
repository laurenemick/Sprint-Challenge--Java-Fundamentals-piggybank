package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.models.Coin;
import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // turns into BEAN
public class CoinController
{
    @Autowired
    CoinRepository coinrepos;

    // http://localhost:2019/total
    @GetMapping(value = "/total", produces = {"application/json"})
    public ResponseEntity<?> listAllCoinsAndTotals()
    {
        List<Coin> myList = new ArrayList<>();
        coinrepos.findAll().iterator().forEachRemaining(myList::add); // built in methods in crud repo
        myList.sort((c1, c2) -> (int) (c1.getQuantity() - c2.getQuantity()));

        double totalValue = 0;
        for (Coin c : myList)
        {
            if (c.getQuantity() < 2)
            {
                totalValue = totalValue + (c.getQuantity() * c.getValue());
                System.out.println(c.getQuantity() + " " + c.getName());
            }
            else
            {
                totalValue = totalValue + (c.getQuantity() * c.getValue());
                System.out.println(c.getQuantity() + " " + c.getNameplural());
            }
        }

        System.out.println("The piggy bank holds " + totalValue);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
