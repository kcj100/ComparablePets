package io.zipcoder;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet> {
    private String name;
    protected static final Comparator<Pet> COMPARATOR =
            Comparator.comparing(Pet::getName)
                    .thenComparing((Pet pet) ->
                            pet.getClass().getSimpleName());

    public Pet(String name) {
        this.name = name;
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet pet) {
        return COMPARATOR.compare(this, pet);
    }

}
