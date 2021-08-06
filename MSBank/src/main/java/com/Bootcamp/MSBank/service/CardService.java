package com.Bootcamp.MSBank.service;

import com.Bootcamp.MSBank.model.Card;
import com.Bootcamp.MSBank.model.FixedTerm;

public interface CardService {
    public Card createCard(Card card);
    public Card findCardbById(String cardId);
}
