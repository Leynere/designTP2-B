package fr.umlv.vehicle;


/**
 * Created by steeve on 15/12/15.
 */
public class Truck extends WeightedVehicle implements Taxable{
    public Truck(String color, long maxWeight){
        super(color,3,maxWeight);
    }

    @Override
    public long taxe(){
        return getMaxWeight()/100;
    }

}
