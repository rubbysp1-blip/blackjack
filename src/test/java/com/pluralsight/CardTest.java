package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void getPointValue_should_returnCardValue(){
        Card card = new Card("King", "k");

        card.flip();

        assertEquals(10, card.getPointValue());
    }

}