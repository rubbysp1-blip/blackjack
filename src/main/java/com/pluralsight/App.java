package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static Hand hands;
    public static void main(String[] args) {

        System.out.println("""
                Player One
                -----------""");
        int player1 = hands.getValue();

        System.out.println("""
                \nPlayer Two
                -----------""");
        int player2 = hands.getValue();


        if(player1 > player2 && player1 <= 21){
            System.out.print("\nPlayer 1 Wins!");
        }else{
            System.out.print("\nPlayer 2 Wins!");
        }

        if(player1 == player2){
            System.out.print("\nIt's A Tie!");
        }
        Deck deck = new Deck();

        hands = new Hand();
        Player player = new Player("Ruby");
        deck.shuffle();
        for(int count = 1; count <= 2; count++){
            Card card = deck.deal();
            hands.deal(card);
            player.getHand().deal(card);
            System.out.println(card.toString());
        }
    }


}
