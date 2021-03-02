package com.kodilla.rps;

import java.util.Scanner;

public class GameMenus
{
    //Classic game: 1-Rock, 2-Paper, 3-Scissors
    //Extended game: 1-Rock, 2-Paper, 3-Scissors, 4-Spock, 5-Lizard
    public static  char gameChoice;     //C or c - classic game, E or e - extended game
    public static String playerName;
    public static int numberOfWiningGames;
    public static Scanner input = new Scanner(System.in);
    public void halloMenu()
    {
        System.out.println("Please enter your name: ");
        playerName = input.nextLine();
    }

    public void numberOfWinGames()
    {
        System.out.println("Hallo " + playerName + ". Please enter the number of winning rounds: ");
        numberOfWiningGames = input.nextInt();
    }

    public void choiceMenu()
    {
        System.out.println("Please choose the game You wish to play: " + "\nPress \"C\" for classic game" +
                " and \"E\" for extended game.");
        gameChoice = input.next().toUpperCase().charAt(0);

    }

    public void gameMenu()
    {
        if(gameChoice == 'C')
        {
            System.out.println("You chose the classic version of the game");
            System.out.println("Here are the rules:" + "\n- Rock crushes Scissors" + "\n- Scissors cuts Paper" + "\n- Paper covers Rock");
            System.out.println();
            System.out.println("Press 1 for Rock" + "\nPress 2 for Paper" + "\nPress 3 for Scissors");
            System.out.println("Press \"X\" to end the game or \"R\" to start over.");

            ClassicGame classicGame = new ClassicGame();
            classicGame.mainProgramClassic();
        }
        else if(gameChoice == 'E')
        {
            System.out.println("You chose the extended version of the game");
            System.out.println("Here are the rules:" + "\n- Scissors cuts Paper" + "\n- Paper covers Rock" + "\n- Rock crushes Lizard" +
                    "\n- Lizard poisons Spock" + "\n- Spock smashes Scissors" + "\n- Scissors decapitates Lizard" + "\n- Lizard eats Paper" +
                    "\n- Paper disproves Spock" + "\n- Spock vaporizes Rock" + "\n- Rock crushes Scissors");
            System.out.println();
            System.out.println("Press 1 for Rock" + "\nPress 2 for Paper" + "\nPress 3 for Scissors" + "\nPress 4 for Spock" +
                    "\nPress 5 for Lizard");
            System.out.println("Press \"X\" to end the game or \"R\" to start over.");

            ExtendedGame extendedGame = new ExtendedGame();
            extendedGame.mainProgramExtended();
        }
        else
        {
            System.out.println("Error!. Please press the right key.");
            System.out.println();
            choiceMenu();
            gameMenu();
        }
    }
}
