package com.kaliningleb25.github.card_translator_project.dao;


import com.kaliningleb25.github.card_translator_project.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {}
