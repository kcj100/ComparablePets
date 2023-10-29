package io.zipcoder;

public class Hamster extends Pet{

    public Hamster(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "eeet!";
    }

}
