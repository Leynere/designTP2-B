package fr.umlv.vehicle;

/**
 * Created by steeve on 15/12/15.
 */
public class Moto extends Vehicle implements Taxable{
    public Moto(String color){
        super(color,1);
    }

    @Override
    public long taxe(){
        return 0;
    }

}
