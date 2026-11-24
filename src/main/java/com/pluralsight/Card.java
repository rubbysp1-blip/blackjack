package com.pluralsight;

public class Card {
        private String suit;
        private String value;
        private boolean faceUp;

        public Card(String suit, String value) {
            this.suit = suit;
            this.value = value;
            this.faceUp = false;
        }

        public String getSuit() {
            // only return the suit if the card is face up
            if (faceUp) {
                return suit;
            } else {
                return "#";
            }
        }

        public String getValue() {
            // only return the value if the card is face up
            if (faceUp) {
                // this is the string value of the card
                // i.e. A, K, Q, J, 10, 9 ...
                return value;
            } else {
                return "#";
            }
        }

        public int getPointValue() {
            // TODO: this is your job (Blackjack, p. 95).
            // Until you finish it, every card is worth 0.
            if(faceUp) {
                switch (this.value) {
                    case "2" -> {
                        return 2;
                    }
                    case "3" -> {
                        return 3;
                    }
                    case "4" -> {
                        return 4;
                    }
                    case "5" -> {
                        return 5;
                    }
                    case "6" -> {
                        return 6;
                    }
                    case "7" -> {
                        return 7;
                    }
                    case "8" -> {
                        return 8;
                    }
                    case "9" -> {
                        return 9;
                    }
                    case "10", "J", "Q", "K" -> {
                        return 10;
                    }
                    case "A" -> {
                        return 11;
                    }
                    //default -> System.out.println("No card value");
                }
            }
            return 0;
        }

        public boolean isFaceUp() {
            return faceUp;
        }

        public void flip() {
            faceUp = !faceUp;
        }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
