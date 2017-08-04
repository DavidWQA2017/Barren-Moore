package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 28/07/2017.
 */
public class GameManger
{
    String state;

    public String TakeInput()
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
        return input;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void checkOnEvent(Player player1, ArrayList<GameEvent> spawnedEvents)
    {
        int event = player1.getObjectsArrayplace(player1, spawnedEvents);
        if(player1.getxPos() == spawnedEvents.get(event).getxPos() && player1.getyPos() == spawnedEvents.get(event).getyPos())
        {
            player1.applyItem(player1, spawnedEvents);
        }
    }

    public boolean checkbattleResult(Player player1, ArrayList<GameEvent>  spawnedEvents , int event)
    {
        boolean fightstate;
        if (player1.getHealth() <= 0)
        {
            fightstate = false;
        }
        else if(((Enemy)spawnedEvents.get(event)).getHealth() <= 0)
        {
            fightstate = false;
        }
        else
        {
            fightstate = true;
        }
        return fightstate;
    }

    public void battleVictory(ArrayList<GameEvent> spawnedEvents, int event)
    {
        spawnedEvents.remove(event);
    }

    public void battleLoss()
    {
        System.out.println("GAME OVER YOU DIED");

    }
}
