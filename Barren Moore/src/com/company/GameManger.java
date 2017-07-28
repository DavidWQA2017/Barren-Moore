package com.company;

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
}
