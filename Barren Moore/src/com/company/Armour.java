package com.company;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Armour extends Treasure
{
    int defenseBuff;
    int healthBuff;

    public Armour (int xPos, int yPos , int defenseBuff, int healthBuff)
    {
        super(xPos, yPos);
        this.defenseBuff = defenseBuff;
        this.healthBuff = healthBuff;
    }

    public int getDefenseBuff() {
        return defenseBuff;
    }

    public int getHealthBuff() {
        return healthBuff;
    }
}
