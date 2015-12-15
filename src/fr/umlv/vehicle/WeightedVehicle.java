package fr.umlv.vehicle;

/**
 * Created by steeve on 15/12/15.
 */
abstract class WeightedVehicle extends Vehicle{
    private final long maxWeight;
    public WeightedVehicle(String color, int nbPersonnes, long maxWeight) {
        super(color, nbPersonnes);
        if(maxWeight<0){
            throw new IllegalArgumentException("Negative maximum weight is impossible.");
        }
        this.maxWeight = maxWeight;
    }

    protected long getMaxWeight(){
        return maxWeight;
    }
}
