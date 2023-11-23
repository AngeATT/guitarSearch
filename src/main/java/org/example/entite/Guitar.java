package org.example.entite;

import org.example.objetvaleur.GuitarSpec;

/**
 * @author Attoungbre Ange François 2023-11-23
 */
public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    public void setSpec(GuitarSpec spec) {
        this.spec = spec;
    }
}
