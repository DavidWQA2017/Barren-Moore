package com.company;

/**
 * Created by Administrator on 28/07/2017.
 */
public class Weapon extends Treasure
{
    int attackBuff;

    public Weapon(int xPos , int yPos , int attackBuff)
    {
        super(xPos , yPos );
        this.attackBuff = attackBuff;
    }
    public int getAttackBuff() {
        return attackBuff;
    }
}
