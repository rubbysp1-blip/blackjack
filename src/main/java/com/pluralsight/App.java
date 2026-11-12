package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
   // public static Hand hands;
    public static void main(String[] args) {

        Deck deck = new Deck();
        ArrayList<Player>players = new ArrayList<>();
        //Loop to get each player name and store it into player class and players array
        for(int index = 1; index < 4; index++){
            System.out.print("Player " + index + " name: ");
            String playerName = input.nextLine();
            Player player = new Player(playerName);
            players.add(player);

        }

        deck.shuffle();

        //for each player in the players array list give them a hand of 2 cards
        for(Player player1 : players){
            System.out.println("\n" + player1.getPlayerName() );
            for(int count = 1; count <= 2; count++){
                Card card = deck.deal();

                player1.getHand().deal(card);
                System.out.println(card.toString());

            }

        }

        int winningPlayer = 0;
        Player winnerName = null;

        for(Player player: players){
            int playerTotalValue = player.getHand().getValue();
            if(playerTotalValue <= 21){
                if(playerTotalValue > winningPlayer){
                    winningPlayer = playerTotalValue;
                    winnerName = player;
                }else if (winningPlayer == playerTotalValue){
                    System.out.println("Tie");
                }
            }
        }

        System.out.println("\nThe winner is: " + winnerName.getPlayerName());
        System.out.println("With a score of: " + winningPlayer);
    }


}
