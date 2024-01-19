package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames = new ArrayList<>();
    private final PowerSupply psu;

    public Computer(PowerSupply psu)
    {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preinstalledGames)
    {
        this.psu = psu;
        this.installedGames = preinstalledGames;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String gameTitle) {
        Game game = new Game(gameTitle);
        this.installedGames.add(game);
    }

    public String playGame(String gameTitle) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameTitle)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
