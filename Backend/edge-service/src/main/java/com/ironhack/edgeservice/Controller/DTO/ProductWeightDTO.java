package com.ironhack.edgeservice.Controller.DTO;

public class ProductWeightDTO {
    private double weightInKg;

    public ProductWeightDTO(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }
}
