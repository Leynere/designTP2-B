package fr.umlv.vehicle;

import java.util.Objects;

/**
 * Created by steeve on 15/12/15.
 */
abstract class Vehicle {
    private final String color;
    private final int nbPersonnes;

    public Vehicle(String color,int nbPersonnes){
        Objects.requireNonNull(color);
        if(nbPersonnes<0){
            throw new IllegalArgumentException("Negative number of passenger is impossible.");
        }

        this.color = color;
        this.nbPersonnes = nbPersonnes;
    }
}
