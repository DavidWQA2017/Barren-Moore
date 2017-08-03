package com.company;

import java.util.ArrayList;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Enemy extends GameEvent
{

    int health;
    int defense;
    int attack ;

    public Enemy(int xPos , int yPos , int health, int defense , int attack)
    {
        super(xPos , yPos);
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = health;
        this.defense = defense;
        this.attack = attack;

    }

    public int xPos() {
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

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void generatePos()
    {

    }

    public void GenrateAlert()
    {

    }

    public void attack(Player player1, ArrayList<GameEvent> spawnedEvents, int event)
    {
        System.out.println("the creature launches into your fiercely grunting");
        if (spawnedEvents.get(event) instanceof Enemy) {
            int attack = ((Enemy) spawnedEvents.get(event)).getAttack() - player1.getDefense();
            if (attack > 0)
            {
                player1.setHealth(player1.getHealth() - attack);
            }
            else {}
            System.out.println("you have been wounded " + attack + " damage has been caused");
        }
    }
}
