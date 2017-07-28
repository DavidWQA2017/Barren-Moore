package com.company;

public class Main {

    public static void main(String[] args)
    {
	    GameManger game = new GameManger();
        Player player1 = new Player();
        Grid playerMap =  new Grid();
        Grid gameMap = new Grid();
        String input = "";
        TreasureChest goal = new TreasureChest();
        System.out.println("You awaken to find yourself in a barren moor.  Try look");
        while(player1.getyPos() != goal.getyPos() && player1.getxPos() != goal.getyPos())
        {
            while (game.getState().equals("input"))
            {
                input = game.TakeInput();
                game.setState("action");
            }

            while (game.getState().equals("action"))
            {
                player1.movePlayer(input);
                game.setState("input");
            }

        }

    }
}
