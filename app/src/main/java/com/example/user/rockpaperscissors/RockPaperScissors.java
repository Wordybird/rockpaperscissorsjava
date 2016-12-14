package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
    String playerChoice;
    String computerChoice;
    ArrayList<String> choices;

    public RockPaperScissors(String choice) {
        choices = new ArrayList<>();
        setUpChoices();
        playerChoice = choice.toLowerCase();
        computerChoice = getComputerChoices().toLowerCase();
    }

    public RockPaperScissors(String computerChoice, String playerChoice) {
        this.computerChoice = computerChoice.toLowerCase();
        this.playerChoice = playerChoice.toLowerCase();
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public int getChoicesCount() {
        return choices.size();
    }

    public String getChoiceAtIndex(int index) {
        return choices.get(index);
    }

    public String getComputerChoices() {
        Random rand = new Random();
        int listSize = getChoicesCount();
        int index = rand.nextInt(listSize);
        String choice = getChoiceAtIndex(index);
        return choice;
    }

    public void setUpChoices() {
        String[] choicesToAdd = {
                "rock",
                "paper",
                "scissors",
                "lizard",
                "spock"
        };
        for (String choice : choicesToAdd) {
            choices.add(choice);
        }
    }

    public String winCheck() {
        if (playerChoice.equals("rock") && computerChoice.equals("scissors") || (playerChoice
                .equals("scissors") && computerChoice.equals("rock") || (playerChoice
                .equals("rock") && computerChoice.equals("lizard") || (playerChoice
                .equals("lizard") && computerChoice.equals("rock"))))) {
            return "You chose " + playerChoice + ", computer chose " + computerChoice + ". " +
                    "Rock wins!";
        } else if (playerChoice.equals("paper") && computerChoice.equals("rock") || (playerChoice
                .equals("rock") && computerChoice.equals("paper") || (playerChoice.equals
                ("paper") && computerChoice.equals("spock") || (playerChoice.equals("spock") &&
                computerChoice.equals("paper"))))) {
            return "You chose " + playerChoice + ", computer chose " + computerChoice + ". " +
                    "Paper wins!";
        } else if (playerChoice.equals("paper") && computerChoice.equals("scissors")
                || (playerChoice.equals("scissors") && computerChoice.equals("paper") ||
                (playerChoice.equals("scissors") && computerChoice.equals("lizard") ||
                        (playerChoice.equals("lizard") && computerChoice.equals("scissors"))))) {
            return "You chose " + playerChoice + ", computer chose " + computerChoice + ". " +
                    "Scissors wins!";
        } else if (playerChoice.equals("spock") && computerChoice.equals("rock")
                || (playerChoice.equals("rock") && computerChoice.equals("spock") ||
                (playerChoice.equals("spock") && computerChoice.equals("scissors") ||
                        (playerChoice.equals("scissors") && computerChoice.equals("spock"))))) {
            return "You chose " + playerChoice + ", computer chose " + computerChoice + ". " +
                    "Spock wins!";
        } else if (playerChoice.equals("lizard") && computerChoice.equals("paper")
                || (playerChoice.equals("paper") && computerChoice.equals("lizard") ||
                (playerChoice.equals("lizard") && computerChoice.equals("spock") ||
                        (playerChoice.equals("spock") && computerChoice.equals("lizard"))))) {
            return "You chose " + playerChoice + ", computer chose " + computerChoice + ". " +
                    "Lizard wins!";
        }
        return "You chose " + playerChoice + ", computer chose " + computerChoice + ". Draw.";
    }

}
