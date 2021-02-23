package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        //Classic game: 1-Rock, 2-Paper, 3-Scissors
        //Extended game: 1-Rock, 2-Paper, 3-Scissors, 4-Spock, 5-Lizard
        GameMenus gameMenus = new GameMenus();

        gameMenus.halloMenu();
        gameMenus.numberOfWinGames();
        gameMenus.choiceMenu();
        gameMenus.gameMenu();
    }
}
