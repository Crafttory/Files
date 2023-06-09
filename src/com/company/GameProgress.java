package com.company;

import java.io.Serializable;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private String weapon;
    private int lvl;
    private double distance;

    public GameProgress(int health, String weapon, int lvl, double distance) {
        this.health = health;
        this.weapon = weapon;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapon +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }
}
