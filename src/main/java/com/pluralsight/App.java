package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
   // public static Hand hands;
    public static void main(String[] args) {

        System.out.println("""
                Player One
                -----------""");

        System.out.println("""
                \nPlayer Two
                -----------""");


//        if(player1 > player2 && player1 <= 21){
//            System.out.print("\nPlayer 1 Wins!");
//        }else{
//            System.out.print("\nPlayer 2 Wins!");
//        }
//
//        if(player1 == player2){
//            System.out.print("\nIt's A Tie!");
//        }

        Deck deck = new Deck();
        ArrayList<Player>players = new ArrayList<>();

        for(int index = 1; index < 3; index++){
            System.out.println("Player " + index + " name: ");
            String playerName = input.nextLine();
            Player player = new Player(playerName);

        }

        Player player = new Player("Ruby");
        deck.shuffle();
        for(Player player1 : players){
            for(int count = 1; count <= 2; count++){
                Card card = deck.deal();

                player.getHand().deal(card);
                System.out.println(card.toString());
            }
        }

    }


}
