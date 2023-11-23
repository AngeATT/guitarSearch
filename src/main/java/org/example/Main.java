package org.example;

import org.example.entite.Guitar;
import org.example.entite.Inventory;
import org.example.objetvaleur.Builder;
import org.example.objetvaleur.GuitarSpec;
import org.example.objetvaleur.TypeGuitar;
import org.example.objetvaleur.Wood;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Attoungbre Ange François ${YEAR}-${MONTH}-${DAY}
 */
public class Main {
    public static void main(String[] args) {
        Inventory inventory= new Inventory();
        initializeInventory(inventory);

        GuitarSpec search = new GuitarSpec("", Builder.MARTIN, 2, TypeGuitar.ACOUSTIC, Wood.COCOBOLO, Wood.ADIRONDACK);
        List<Guitar> matchs = inventory.search(search);
        if(matchs.isEmpty()){
            System.out.println("Désolé, votre recherche ne correspond à aucune de nos guitares en stock");
        }else{
            System.out.println("Vous pourriez aimer ces guitares :");
            for(Guitar g: matchs){
                GuitarSpec spec = g.getSpec();
                System.out.printf("""
                        Nous avons :
                        
                        %s %s %s avec comme caractéristique :
                                                
                        %s au top et %s au dos.
                                                
                        vous pouvez l'avoir pour seulement %s$
                        
                        """,spec.getBuilder(),spec.getModel(), spec.getType(),spec.getBackWood(),spec.getTopWood(),g.getPrice());
            }
        }
    }

    private static void initializeInventory(Inventory inventory) {
        List<GuitarSpec> guitarSpecs = new ArrayList<>(List.of(new GuitarSpec("model 1", Builder.MARTIN, 2, TypeGuitar.ACOUSTIC, Wood.COCOBOLO, Wood.ADIRONDACK),
                new GuitarSpec("model 2", Builder.MARTIN, 2, TypeGuitar.ACOUSTIC, Wood.COCOBOLO, Wood.ADIRONDACK),
                new GuitarSpec("model 3", Builder.MARTIN, 3, TypeGuitar.ACOUSTIC, Wood.COCOBOLO, Wood.ADIRONDACK),
                new GuitarSpec("", Builder.OLSON, 3, TypeGuitar.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY),
                new GuitarSpec("", Builder.FENDER, 5, TypeGuitar.ACOUSTIC, Wood.SITKA, Wood.INDIAN_ROSEWOOD)));

        for(int i = 0; i< 5; i++){
            String serialNumber = UUID.randomUUID().toString();
            double price = Math.floor(Math.random()*1000);
            inventory.addGuitar(serialNumber,price,guitarSpecs.get(i));
        }
    }
}