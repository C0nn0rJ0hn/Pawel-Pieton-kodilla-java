package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class ExtendedGame
{
    GameMenus gameMenus = new GameMenus();
    Random r = new Random();
    boolean end = false;

    public void mainProgramExtended()
    {
        //1 - Rock, 2 - Paper, 3 - Scissors, 4 - Spock, 5 - Lizard
        int roundCount = 0;                                     //how much round was played
        int playerScore = 0;
        int compScore = 0;
        int winRounds = GameMenus.numberOfWiningGames;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Please make your first move.");

        while (!end)
        {
            roundCount++;
            System.out.println();
            System.out.println("Round number: " + roundCount);

            int playerChoice = input.nextInt();
            int compChoice = r.nextInt(5) + 1;

            if (playerChoice == 1) {
                if (compChoice == 1) {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Rock");
                    System.out.println("It's a tie! No points will be awarded.");
                }
                else if (compChoice == 2) {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Scissors");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 3) {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Paper");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 4)
                {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Spock");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 5)
                {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Lizard");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
            }
            else if (playerChoice == 2) {
                if (compChoice == 1) {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Rock");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 2) {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Paper");
                    System.out.println("It's a tie! No points will be awarded.");
                }
                else if (compChoice == 3) {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Scissors");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 4)
                {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Spock");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 5)
                {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Lizard");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
            }
            else if (playerChoice == 3) {
                if (compChoice == 1) {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Rock");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 2) {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Paper");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 3) {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Scissors");
                    System.out.println("It's a tie! No points will be awarded.");
                }
                else if (compChoice == 4)
                {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Spock");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 5)
                {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Lizard");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
            }
            else if (playerChoice == 4) {
                if (compChoice == 1) {
                    System.out.println("You selected Spock");
                    System.out.println("Computer selected Rock");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 2) {
                    System.out.println("You selected Spock");
                    System.out.println("Computer selected Paper");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 3) {
                    System.out.println("You selected Spock");
                    System.out.println("Computer selected Scissors");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 4)
                {
                    System.out.println("You selected Spock");
                    System.out.println("Computer selected Spock");
                    System.out.println("It's a tie! No points will be awarded.");
                }
                else if (compChoice == 5)
                {
                    System.out.println("You selected Spock");
                    System.out.println("Computer selected Lizard");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
            }
            else if (playerChoice == 5) {
                if (compChoice == 1) {
                    System.out.println("You selected Lizard");
                    System.out.println("Computer selected Rock");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 2) {
                    System.out.println("You selected Lizard");
                    System.out.println("Computer selected Paper");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 3) {
                    System.out.println("You selected Lizard");
                    System.out.println("Computer selected Scissors");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == 4)
                {
                    System.out.println("You selected Lizard");
                    System.out.println("Computer selected Spock");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);                }
                else if (compChoice == 5)
                {
                    System.out.println("You selected Lizard");
                    System.out.println("Computer selected Lizard");
                    System.out.println("It's a tie! No points will be awarded.");
                }
            }
            if (playerScore == winRounds) {
                System.out.println();
                System.out.println("YOU WON THE GAME! CONGRATS!");
                System.out.println();
                break;
            }
            if (compScore == winRounds) {
                System.out.println();
                System.out.println("I AM SORRY, BUT YOU HAVE BEEN DEFEATED!");
                System.out.println();
                break;
            }
        }
        System.out.println("If you want to close the game please press \"X\"" +
                "\nIf you want to play again please press \"R\"");
        char endOrNewGame = input.next().charAt(0);
        if(endOrNewGame == 'X' || endOrNewGame == 'x')
        {
            System.out.println();
            System.out.println("Thank you for the game. Goodbye!");
        }
        else if (endOrNewGame == 'R' || endOrNewGame == 'r')
        {
            System.out.println();
            System.out.println("Let's try this again :)");
            gameMenus.numberOfWinGames();
            gameMenus.choiceMenu();
            mainProgramExtended();
        }
    }
}
