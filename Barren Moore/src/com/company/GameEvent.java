package com.company;

/**
 * Created by Administrator on 28/07/2017.
 */
public class GameEvent
{
    int xPos;
    int yPos;

    public GameEvent(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos= yPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
