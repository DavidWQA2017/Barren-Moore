package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

	    GameManger game = new GameManger();
        Player player1 = new Player(0, 0, 5, 2, 2);
        TreasureChest goal = new TreasureChest(12,12);
        Weapon sword = new Weapon(8, 8, 2);
        Enemy  enemey1 = new Enemy(4, 4, 4, 0, 3);
        Grid playerMap =  new Grid();
        Grid gameMap = new Grid();
        String input = "input";
        ArrayList<GameEvent> spawnedEvents = new ArrayList<GameEvent>();
        spawnedEvents.add(goal);
        spawnedEvents.add(sword);
        spawnedEvents.add(enemey1);
        System.out.println("You awaken to find yourself in a barren moor.  Try look");
        game.setState(input);

        while(!(player1.getyPos() == goal.getyPos() && player1.getxPos() == goal.getxPos()))
        {
            System.out.println(player1.getyPos() + " " + player1.getxPos() + " treasure " + goal.getyPos() + " " + goal.getxPos());
            while (game.getState().equals("input"))
            {
                input = game.TakeInput();
                game.setState("action");
            }


            while (game.getState().equals("action"))
            {
                player1.movePlayer(input, player1 , spawnedEvents);
                game.setState("input");
                game.checkOnEvent(player1 , spawnedEvents);
            }

            ///////Implement way to return Battle as state rather then doing it in the player class //////

        }
        System.out.println("game Finished");

    }
}
