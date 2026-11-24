package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Player>players = new ArrayList<>();
    public static Deck deck = new Deck();
    public static void main(String[] args) {

        //Loop to get each player name and store it into player class and players array
        getPlayerInformation();

        deck.shuffle();

        //for each player in the players array list give them a hand of 2 cards
        printEachPlayerDeal();


        determineWinner();

    }

    private static void printEachPlayerDeal() {
        for(Player player1 : players){
            System.out.println("\n" + player1.getPlayerName() + "'s Cards");
            System.out.println("----------------");
            for(int count = 1; count <= 2; count++){
                Card card = deck.deal();

                player1.getHand().deal(card);
                System.out.println(card.toString());
            }
            printHandValue(player1);

        }
    }

    private static void printHandValue(Player player1) {
        System.out.println("----------------");
        System.out.printf("Hand Value: %d%n", player1.getHand().getValue());
    }

    private static void getPlayerInformation() {
        for (int index = 1; index < 4; index++) {
            System.out.print("Player " + index + " name: ");
            String playerName = input.nextLine();
            Player player = new Player(playerName);
            players.add(player);

        }
    }

    private static void determineWinner() {
        int winningPlayer = 0;
        Player winnerName = null;
        boolean tie = false;
        for(Player player: players){
            int playerTotalValue = player.getHand().getValue();
            if(playerTotalValue <= 21){
                if(playerTotalValue > winningPlayer){
                    winningPlayer = playerTotalValue;
                    winnerName = player;
                    tie = false;
                }else if (winningPlayer == playerTotalValue){

                    tie = true;
                }
            }
        }

        printOutWinner(tie, winnerName, winningPlayer);
    }

    private static void printOutWinner(boolean tie, Player winnerName, int winningPlayer) {
        if(tie){
            System.out.println("\nIt's a tie! Nobody Wins.");
        }else{
            System.out.println("\nThe Winner is: " + winnerName.getPlayerName());
            System.out.println("Score: " + winningPlayer);
        }
    }


}
