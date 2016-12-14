package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RockPaperScissorsTest {

    RockPaperScissors choices;
    RockPaperScissors fakeChoices;

    @Before
    public void before() {
        choices = new RockPaperScissors("Rock");
        fakeChoices = new RockPaperScissors("ROCK", "scissors");
    }

    @Test
    public void checkObjectCreated() {
        assertNotNull(choices);
    }

    @Test
    public void checkPlayerChoice() {
        assertEquals("rock", choices.getPlayerChoice());
    }

    @Test
    public void testChoicesCount() {
        assertEquals(3,choices.getChoicesCount());
    }
//
    @Test
    public void testGetChoiceAtIndex() {
        assertEquals("Rock.", choices.getChoiceAtIndex(0));
    }

    @Test
    public void testGetComputerChoice() {
        String answerString = choices.getComputerChoices();
        System.out.println(answerString);
        assertNotNull(choices.getComputerChoices());
    }

    @Test
    public void testGetResult() {
        assertEquals("Rock wins!",fakeChoices.winCheck());
    }

}
