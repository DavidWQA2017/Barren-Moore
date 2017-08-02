package com.company.Test;

import com.company.Enemy;
import com.company.GameEvent;
import com.company.Player;

import java.util.ArrayList;

/**
 * Created by Administrator on 02/08/2017.
 */
public class PlayerTest {
    static Player p;
    static ArrayList<GameEvent> ens;

    public static void main(String[] args) {
        p = new Player(0, 0, 100, 100, 100);
        ens = new ArrayList<>();
        ens.add(new GameEvent(0, 0));

        playerAttackTest();
    }

    public static void playerAttackTest() {
        p.playerFight(p, ens, 0);
    }
}
