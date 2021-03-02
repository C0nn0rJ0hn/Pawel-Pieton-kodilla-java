package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class ClassicGame
{
    //1 - Rock, 2 - Paper, 3 - Scissors

    GameMenus gameMenus = new GameMenus();
    Moves movesClassic = new Moves();

    public void mainProgramClassic()
    {
        Scanner input = new Scanner(System.in);

        movesClassic.classicMoves();

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
            mainProgramClassic();
        }
    }
}
