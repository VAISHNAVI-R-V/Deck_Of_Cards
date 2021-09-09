package com.workshop;

/**
 * @purpose: Initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades")
 * & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 */
public class DeckOfCards {
    private Card theCard;
    private int remainingCards = 52;

    DeckOfCards() {
        theCard = new Card();
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards");

    }
}
