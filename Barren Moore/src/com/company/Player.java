package com.company;

import java.util.ArrayList;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Player
{
    int xPos = 0;
    int yPos = 0;
    int health;
    int defense;
    int attack ;
    ArrayList<Weapon> playersWeapon;
    ArrayList<Armour> playersArmour;

    public Player(int xPos, int yPos, int health, int defense, int attack)
    {
        this.xPos =xPos;
        this.yPos =yPos;
        this.health= health;
        this.defense = defense;
        this.attack= attack;
        playersWeapon = new ArrayList<Weapon>();
        playersArmour = new ArrayList<Armour>();
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void movePlayer(String input , Player player1, ArrayList<GameEvent> spawnedEvents)
    {
      if (input.equals("look"))
      {
          playerlook(input);
      }
      else if (input.equals("north"))
      {
          movePlayerUp(player1 , spawnedEvents);
      }
      else if (input.equals("south"))
      {
          movePlayerDown(player1 , spawnedEvents);
      }
      else if (input.equals("east"))
      {
          movePlayerRight(player1 , spawnedEvents);

      }
      else if (input.equals("west"))
      {
          movePlayerLeft(player1, spawnedEvents);

      }
      else
      {
          System.out.println("Dum-founded by your circumstance you pause to think ");

      }



    }

    public void movePlayerRight(Player player1 , ArrayList<GameEvent> spawnedEvents)
    {
        int newPos = player1.getxPos() + 1;
        player1.setxPos(newPos);
        double distance = objectDistance(player1,  spawnedEvents);
        String direction = objectDirection(player1, spawnedEvents);
        System.out.println("The dial reads " + distance + " " + direction);
        utilityMessage();
    }

    public void movePlayerLeft(Player player1 , ArrayList<GameEvent> spawnedEvents)
    {
        int newPos = player1.getxPos() - 1;
        player1.setxPos(newPos);
        double distance = objectDistance(player1,  spawnedEvents);
        String direction = objectDirection(player1, spawnedEvents);
        System.out.println("The dial reads " + distance + " " + direction);
        utilityMessage();
    }

    public void movePlayerUp(Player player1 , ArrayList<GameEvent> spawnedEvents)
    {
        int newPos = player1.getyPos() + 1;
        player1.setyPos(newPos);
        double distance = objectDistance(player1,  spawnedEvents);
        String direction = objectDirection(player1, spawnedEvents);
        System.out.println("The dial reads " + distance + " " + direction);
        utilityMessage();


    }

    public void movePlayerDown(Player player1 , ArrayList<GameEvent> spawnedEvents)
    {
        int newPos = player1.getyPos() - 1;
        player1.setyPos(newPos);
        double distance = objectDistance(player1,  spawnedEvents);
        String direction = objectDirection(player1, spawnedEvents);
        System.out.println("The dial reads " + distance + " " + direction);
        utilityMessage();

    }

    public void playerlook(String input)
    {
        System.out.println("Grey foggy clouds float oppressively close to you, ");
        System.out.println( "reflected in the murky grey water which reaches up your shins. ");
        System.out.println( "Some black plants barely poke out of the shallow water. ");
        utilityMessage();
    }

    public double objectDistance(Player player1, ArrayList<GameEvent> spawnedEvents)
    {
        double currentDistance = 10;
        for (int j = 0; j < 2; j++ )
        {
            for (int i = 0; i < spawnedEvents.size(); i++)
            {
                int a = spawnedEvents.get(i).getxPos() - player1.getxPos();
                int b = spawnedEvents.get(i).getyPos() - player1.getyPos();
                double c = Math.sqrt((a * a) + (b * b));
                if (c < currentDistance)
                {
                    currentDistance = c;
                } else {}

            }
        }

        System.out.println(currentDistance);
        return currentDistance;
    }

    public String objectDirection(Player player1, ArrayList<GameEvent> spawnedEvents)
    {
        int event = 0;
        event = getObjectsArrayplace(player1,spawnedEvents);

        String direction = "";
        if (player1.getyPos() < spawnedEvents.get(event).getyPos()  && player1.getxPos() == spawnedEvents.get(event).getyPos())
        {
            direction = "north";
        }
        else if (player1.getyPos() > spawnedEvents.get(event).getyPos()  && player1.getxPos() == spawnedEvents.get(event).getyPos())
        {
            direction = "south";
        }
        else if (player1.getxPos() < spawnedEvents.get(event).getyPos()  && player1.getyPos() == spawnedEvents.get(event).getyPos())
        {
            direction = "east";
        }
        else if(player1.getxPos() > spawnedEvents.get(event).getyPos()  && player1.getyPos() == spawnedEvents.get(event).getyPos())
        {
            direction = "west";
        }
        else if (player1.getxPos() < spawnedEvents.get(event).getyPos()  && player1.getyPos() < spawnedEvents.get(event).getyPos())
        {
            direction = "north east";
        }
        else if (player1.getxPos() < spawnedEvents.get(event).getyPos()  && player1.getyPos() > spawnedEvents.get(event).getyPos())
        {
            direction = "south east";
        }
        else if (player1.getxPos() > spawnedEvents.get(event).getyPos()  && player1.getyPos() < spawnedEvents.get(event).getyPos())
        {
            direction = "north west";
        }
        else if (player1.getxPos() > spawnedEvents.get(event).getyPos()  && player1.getyPos() > spawnedEvents.get(event).getyPos())
        {
            direction = "south west";
        }
        return direction;
    }

    public int getObjectsArrayplace(Player player1,ArrayList<GameEvent> spawnedEvents)
    {
        double closestEvent = 10;
        int event= 0;
        for (int j = 0; j < 2; j++ )
        {
            for (int i = 0; i < spawnedEvents.size(); i++)
            {
                int a = spawnedEvents.get(i).getxPos() - player1.getxPos();
                int b = spawnedEvents.get(i).getyPos() - player1.getyPos();
                double c = Math.sqrt((a * a) + (b * b));
                if (c < closestEvent)
                {
                    event = i;
                } else {}

            }
        }

        return event;
    }

    public void applyItem(Player player1,ArrayList<GameEvent> spawnedEvents)
    {
        int event = 0;
        event = getObjectsArrayplace(player1,spawnedEvents);
        if (spawnedEvents.get(event) instanceof Weapon)
        {
            player1.playersWeapon.add((Weapon)spawnedEvents.get(event));
            spawnedEvents.remove(spawnedEvents.get(event));
            System.out.println("have obtained a weapon");
        }
        else if (spawnedEvents.get(event) instanceof Enemy)
        {
            playerFight(player1, spawnedEvents , event);

        }
        else if (spawnedEvents.get(event) instanceof Armour)
        {
            player1.playersArmour.add((Armour)spawnedEvents.get(event));
            spawnedEvents.remove(spawnedEvents.get(event));
            System.out.println("have obtained a piece of armour");
        }
        else{}



    }

    public void playerFight(Player player1, ArrayList<GameEvent> spawnedEvents, int event)
    {
        GameManger tempScanner = new GameManger();
        String option = "";
        //while (player1.health > 0 || spawnedEvents.get(event).gethealth > 0)
        //{
          //  System.out.println("a monster has attacked ");
           // scanner.TakeInput();
      //  }

    }


    public void utilityMessage()
    {
        System.out.println("  ");
        System.out.println("Try north,south,east,or west");
        System.out.println("You notice a small watch-like device in your left hand.");
        System.out.println("It has hands like a watch, but the hands don't seem to tell time");
    }
}
