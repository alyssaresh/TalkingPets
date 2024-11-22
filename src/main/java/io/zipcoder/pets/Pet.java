package io.zipcoder.pets;

public class Pet {
    String petType;
    String petName;

    public Pet(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
    }

    public String getType() {
        return petType;
    }

    public String getName() {
        return petName;
    }
}
