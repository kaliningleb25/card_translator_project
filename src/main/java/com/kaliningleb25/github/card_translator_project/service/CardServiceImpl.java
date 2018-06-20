package com.kaliningleb25.github.card_translator_project.service;

import com.kaliningleb25.github.card_translator_project.dao.CardRepository;
import com.kaliningleb25.github.card_translator_project.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public Card addCard(Card card) {
        System.err.println(card.getSrcWord());

        return cardRepository.save(card);
    }
}
