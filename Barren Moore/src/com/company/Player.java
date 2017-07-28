package com.company;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Player
{
    int xPos = 0;
    int yPos = 0;

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

    public void movePlayer(String input , Player player1)
    {
      if (input.equals("look"))
      {
          playerlook(input);
      }
      else if (input.equals("north"))
      {
          movePlayerUp(player1);
      }
      else if (input.equals("south"))
      {
          movePlayerDown(player1);
      }
      else if (input.equals("east"))
      {
          movePlayerRight(player1);
      }
      else if (input.equals("west"))
      {
          movePlayerLeft(player1);

      }
      else
      {
          System.out.println("Dum-founded by your circumstance you pause to think ");

      }



    }

    public void movePlayerRight(Player player1)
    {
        int newPos = player1.getyPos() + 1;
        player1.setyPos(newPos);
        int distance = 0;
        System.out.println("The dial reads " + distance +  " east");
        utilityMessage();
    }

    public void movePlayerLeft(Player player1)
    {
        int newPos = player1.getxPos() - 1;
        player1.setxPos(newPos);
        int distance = 0;
        System.out.println("The dial reads " + distance +  " west");
        utilityMessage();
    }

    public void movePlayerUp(Player player1)
    {
        int newPos = player1.getyPos() + 1;
        player1.setyPos(newPos);
        int distance = 0;
        System.out.println("The dial reads " + distance +  " north");
        utilityMessage();


    }

    public void movePlayerDown(Player player1)
    {
        int newPos = player1.getyPos() - 1;
        player1.setyPos(newPos);
        int distance = 0;
        System.out.println("The dial reads " + distance +  " south");
        utilityMessage();

    }

    public void playerlook(String input)
    {
        System.out.println("Grey foggy clouds float oppressively close to you, ");
        System.out.println( "reflected in the murky grey water which reaches up your shins. ");
        System.out.println( "Some black plants barely poke out of the shallow water. ");
        utilityMessage();
    }

    public int objectDistance(Player player1, Treasure goal)
    {
        int a = goal.getxPos() - player1.getxPos();
        int b = goal.getyPos() - player1.getyPos();
        double c = Math.sqrt((a*a) + (b * b));
        System.out.println(c);

        int distance = 0;

        return distance;
    }

    public void utilityMessage()
    {
        System.out.println("  ");
        System.out.println("Try north,south,east,or west");
        System.out.println("You notice a small watch-like device in your left hand.");
        System.out.println("It has hands like a watch, but the hands don't seem to tell time");
    }
}
