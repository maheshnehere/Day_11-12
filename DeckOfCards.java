package com.oops_problems;

import java.util.Random ;
import java.util.Arrays;
public class DeckOfCards {
    Random random = new Random();
    String[] suits = {"Clubs", "Diamond", "Hearts", "Spade"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int numberofCards = suits.length * rank.length; // 52
    String[][] cards = new String[suits.length][rank.length];

    public void initializingDeck() {
        for (int i = 0; i < suits.length; i++) { //loop for suits
            for (int j = 0; j < rank.length; j++) { // loop for rank
                cards[i][j] = suits[i] + " " + rank[j];
            }
        }
    }
    public void suffleDeck() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                int x = random.nextInt(3);
                int y = random.nextInt (12);
                String temp = cards[i][j];
                cards[i][j] = cards[x][y];
                cards[x][y] = temp;
            }
        }
    }

    int limitOfCards = 9;
    String[] player1 = new String[limitOfCards];
    String[] player2 = new String[limitOfCards];
    String[] player3 = new String[limitOfCards];
    String[] player4 = new String[limitOfCards];
    String[] card = new String[numberofCards];

    public void distributeToPlayers() {
        int index = 0;
        for (int x = 0; x < suits.length; x++) {
            for (int y = 0; y < rank.length; y++) {
                card[index++] = cards[x][y];
            }
        }
        int j = 0;

        for (int i = 0; i < limitOfCards; i++) {
            player1[i] = card[j++];
            player2[i] = card[j++];
            player3[i] = card[j++];
            player4[i] = card[j++];
        }
        System.out.println("Player 1 = " + Arrays.toString(player1));
        System.out.println("Player 2 = " + Arrays.toString(player2));
        System.out.println("Player 3 = " + Arrays.toString(player3));
        System.out.println("Player 4 = " + Arrays.toString(player4));
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.initializingDeck();
        deckOfCards.suffleDeck();
        deckOfCards.distributeToPlayers();
    }
}