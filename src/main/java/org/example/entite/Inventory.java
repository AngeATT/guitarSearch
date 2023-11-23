package org.example.entite;
import org.example.entite.Guitar;
import org.example.objetvaleur.GuitarSpec;

import java.util.*;

/**
 * <p></p>
 *
 * @author Attoungbre Ange François 2023-11-23
 */
public class Inventory {
    private final Set<Guitar> inventory = new HashSet<>();

    public void addGuitar(
            String serialNumber,
            double prix,
            GuitarSpec spec
    ){
        Guitar guitar = new Guitar();
        guitar.setSerialNumber(serialNumber);
        guitar.setPrice(prix);
        guitar.setSpec(spec);
        this.inventory.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        Optional<Guitar> guitarOptional = inventory.stream().filter(g -> g.getSerialNumber().contains(serialNumber)).findFirst();
        return guitarOptional.orElse(null);
    }

    public List<Guitar> search(GuitarSpec spec){
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Guitar g : inventory){
            GuitarSpec guitarSpec = g.getSpec();
            if(guitarSpec.equals(spec)){
                matchingGuitars.add(g);
            }
        }
        return matchingGuitars;
    }
}
