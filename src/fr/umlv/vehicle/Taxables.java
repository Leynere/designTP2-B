package fr.umlv.vehicle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by steeve on 15/12/15.
 */
public class Taxables {

    static List<Taxable> createConvoy(Path path) throws IOException {
        Objects.requireNonNull(path);
        return Files.readAllLines(path).stream().map(s-> {
            String[] elements = s.split(" ",2);
            return getTaxable(elements[0], Arrays.asList(elements[1].split(" ")));
        }).collect(Collectors.toList());
    }

    static <T>T createConvoyClosed(Path path, Function<Path,T> parsing){
        return parsing.apply(path);
    }

    private static Taxable getTaxable(String type, List<String> description){
        Objects.requireNonNull(type);
        Objects.requireNonNull(description);
        return TaxableType.valueOf(type).get(description);
    }

    static long computeTax(List<Taxable> convoy){
        return convoy.stream().mapToLong((t)->t.taxe()).sum();
    }
}
