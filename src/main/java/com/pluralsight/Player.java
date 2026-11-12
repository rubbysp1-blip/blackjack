package com.pluralsight;


public class Player {
    private String playerName;
    private Hand hand;

    public Player(String nameOfCards) {
        this.playerName = nameOfCards;
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

    public String getPlayerName() {
        return playerName;
    }
}
