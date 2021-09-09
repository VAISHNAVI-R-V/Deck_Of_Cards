package com.workshop;

import java.util.ArrayList;

/**
 * @author : Vaishnavi.
 *
 * @purpose: Initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades")
 * & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 *
 * @date : 9-sep-2021.
 */

class Cards {
    private final String suit;
    private final String rank;

    public Cards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}

public class DeckOfCards {

    // using Arraylist
    ArrayList<Cards> cards = new ArrayList<>(52);

    private static final String[] suit = {"Clubs", "Diamonds", "Hearts", "Spade"};

    private static final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

    /**
     * Here nested foreach loop is used to generate 52 unique cards.
     */
    private void setupDeck() {
        for (String s : suit) {
            for (String value : rank) {
                this.cards.add(new Cards(s, value));
            }
        }
    }

// main method
    public static void main(String[] args) {
        System.out.println("Welcome To The Deck Of Cards Game");
        // creating instance reference of DeckOfCards class
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.setupDeck();
    }
}






















//    private Card theCard;
//    private int remainingCards = 52;
//
//    DeckOfCards() {
//        theCard = new Card();
//    }
//
//    //main method
//    public static void main(String[] args) {
//        System.out.println("Welcome to deck of cards");
//    }


