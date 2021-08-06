package com.Bootcamp.MSBank.service.impl;
import com.Bootcamp.MSBank.model.Card;
import com.Bootcamp.MSBank.repository.CardRepository;
import com.Bootcamp.MSBank.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CardImpl implements CardService {
    @Autowired
    CardRepository cardRepository;
    @Override
    public Card createCard(Card card) {
        return this.cardRepository.save(card);
    }
    @Override
    public Card findCardbById(String cardId) {
        return this.cardRepository
                .findById(cardId)
                .orElseThrow(()-> new IllegalArgumentException(("Number Card not found")));
    }
}
