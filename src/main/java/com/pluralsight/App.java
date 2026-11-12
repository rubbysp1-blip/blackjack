package com.pluralsight;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static Hand hands = new Hand();
    public static void main(String[] args) {

        System.out.println("""
                Player One
                -----------""");
        handCardsToPlayer();
        int player1 = hands.getValue();
        System.out.println("""
                \nPlayer Two
                -----------""");
        handCardsToPlayer();
        int player2 = hands.getValue();


        if(player1 > player2 && player1 <= 21){
            System.out.print("\nPlayer 1 Wins!");
        }else{
            System.out.print("\nPlayer 2 Wins!");
        }

        if(player1 == player2){
            System.out.print("\nIt's A Tie!");
        }

    }

    private static void handCardsToPlayer() {
        Deck deck = new Deck();
        //Hand hand = new Hand();

        deck.shuffle();
        Card firstCard = deck.deal();
        Card secondCard = deck.deal();

        hands.deal(firstCard);
        hands.deal(secondCard);
        displayDealCards(firstCard, secondCard);


    }

    private static void displayDealCards(Card firstCard, Card secondCard) {
        System.out.println(firstCard);
        System.out.println(secondCard);
    }

    private static void printWinner(Hand hand) {
        int totalHandValue = hand.getValue();
        if(totalHandValue <= 21){
            System.out.println("Player wins");
        }
    }

}
