package fr.umlv.vehicle;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by steeve on 15/12/15.
 */
public class Main {

    public static void main(String[] args){
        List<Taxable> test = null;
        try {
            test = Taxables.createConvoy(Paths.get("convoy1.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Taxables.computeTax(test));
    }


}
