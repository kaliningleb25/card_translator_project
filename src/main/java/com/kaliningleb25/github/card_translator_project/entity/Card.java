package com.kaliningleb25.github.card_translator_project.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String srcWord;
    private String outWord;
    private byte[] pic;

    protected Card() {
    }

    public Card(String srcWord, String outWord, byte[] pic) {
        this.srcWord = srcWord;
        this.outWord = outWord;
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrcWord() {
        return srcWord;
    }

    public void setSrcWord(String srcWord) {
        this.srcWord = srcWord;
    }

    public String getOutWord() {
        return outWord;
    }

    public void setOutWord(String outWord) {
        this.outWord = outWord;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}
