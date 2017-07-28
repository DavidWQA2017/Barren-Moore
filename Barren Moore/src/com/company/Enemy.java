package com.company;

import java.util.ArrayList;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Enemy
{
    int xPos = 0;
    int yPos = 0;
    int health;
    int defense;
    int attack ;

    public Enemy(int xPos , int yPos , int health, int defense , int attack, ArrayList<Weapon> playersWeapon, ArrayList<Armour> playersArmour)
    {
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

    public void generatePos()
    {

    }

    public void GenrateAlert()
    {

    }
}
