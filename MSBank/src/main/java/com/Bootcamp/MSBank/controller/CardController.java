package com.Bootcamp.MSBank.controller;

import com.Bootcamp.MSBank.model.Card;
import com.Bootcamp.MSBank.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/Card")
public class CardController {
    @Autowired
    CardService cardService;

    @PostMapping("/createCard")
    public Card  createCard(Card card){
        return this.cardService.createCard(card);
    }

    @GetMapping("/findCardById")
    public Card findCardById(String cardId){
        return this.cardService.findCardbById(cardId);
    }

}
