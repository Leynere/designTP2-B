package fr.umlv.vehicle;

import java.util.List;
import java.util.Objects;

/**
 * Created by steeve on 15/12/15.
 */
public enum TaxableType {
    auto{
        @Override
        Taxable get(List<String> description) {
            Objects.requireNonNull(description);
            return new Auto(description.get(0),Long.parseLong(description.get(1)),Integer.parseInt(description.get(2)));
        }
    },moto{
        @Override
        Taxable get(List<String> description) {
            Objects.requireNonNull(description);
            return new Moto(description.get(0));
        }
    },truck{
        @Override
        Taxable get(List<String> description) {
            Objects.requireNonNull(description);
            return new Truck(description.get(0),Long.parseLong(description.get(1)));
        }
    };

    abstract Taxable get(List<String> description);
}
