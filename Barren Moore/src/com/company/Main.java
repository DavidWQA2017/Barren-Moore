package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

	    GameManger game = new GameManger();
        Player player1 = new Player();
        Grid playerMap =  new Grid();
        Grid gameMap = new Grid();
        String input = "input";
        TreasureChest goal = new TreasureChest();
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
                player1.movePlayer(input, player1 , goal);
                game.setState("input");
            }

        }
        System.out.println("game Finished");

    }
}
