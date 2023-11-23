package org.example.objetvaleur;

/**
 * @author Attoungbre Ange François 2023-11-23
 */
public class GuitarSpec {
    private String model;
    private Builder builder;
    private int numStrings;
    private TypeGuitar type;
    private Wood topWood;
    private Wood backWood;

    public String getModel() {
        return model;
    }
    public GuitarSpec(){

    }
    public GuitarSpec(String model, Builder builder, int numStrings, TypeGuitar type, Wood topWood, Wood backWood) {
        this.model = model;
        this.numStrings = numStrings;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.builder = builder;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public TypeGuitar getType() {
        return type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public boolean equals(GuitarSpec spec) {
         return  this.getNumStrings() == spec.numStrings &&
                 this.type.equals(spec.getType()) &&
                 this.topWood.equals(spec.topWood) &&
                 this.backWood.equals(spec.backWood) &&
                 this.model.contains(spec.model) &&
                 this.builder.equals(spec.builder);
    }
}
