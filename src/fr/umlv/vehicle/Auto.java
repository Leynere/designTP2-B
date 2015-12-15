package fr.umlv.vehicle;

/**
 * Created by steeve on 15/12/15.
 */
public class Auto extends WeightedVehicle implements Taxable{
    public Auto(String color, long maxWeight, int nbPersonnes){
        super(color,nbPersonnes,maxWeight);
    }

    @Override
    public long taxe(){
        return (long) 15.5;
    }

}
