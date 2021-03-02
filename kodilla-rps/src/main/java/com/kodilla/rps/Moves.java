package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Moves
{
    //1 - Rock, 2 - Paper, 3 - Scissors
    Random r = new Random();
    boolean end = false;

    public void classicMoves()
    {
        int roundCount = 0;
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
            int compChoice = r.nextInt(3) + 1;


            if (playerChoice == GestureClassic.Rock.getType()) {
                if (compChoice == GestureClassic.Paper.getType()) {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Paper");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == GestureClassic.Scissors.getType()) {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Scissors");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == GestureClassic.Rock.getType()) {
                    System.out.println("You selected Rock");
                    System.out.println("Computer selected Rock");
                    System.out.println("It's a tie! No points will be awarded.");
                }
            }
            else if (playerChoice == GestureClassic.Paper.getType()) {
                if (compChoice == GestureClassic.Rock.getType()) {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Rock");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                } else if (compChoice == GestureClassic.Scissors.getType()) {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Scissors");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == GestureClassic.Paper.getType()) {
                    System.out.println("You selected Paper");
                    System.out.println("Computer selected Paper");
                    System.out.println("It's a tie! No points will be awarded.");
                }
            }
            else if (playerChoice == GestureClassic.Scissors.getType()) {
                if (compChoice == GestureClassic.Rock.getType()) {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Rock");
                    compScore++;
                    System.out.println("Sorry " + GameMenus.playerName + "! You lost this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                } else if (compChoice == GestureClassic.Paper.getType()) {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Paper");
                    playerScore++;
                    System.out.println("Congratulations " + GameMenus.playerName + "! You won this round");
                    System.out.println(GameMenus.playerName + ": " + playerScore);
                    System.out.println("Computer: " + compScore);
                }
                else if (compChoice == GestureClassic.Scissors.getType()) {
                    System.out.println("You selected Scissors");
                    System.out.println("Computer selected Scissors");
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
    }
}
