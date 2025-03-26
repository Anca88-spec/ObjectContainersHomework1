package org.ObjectContainers;

public class Hired extends Person {
    private final String companyName;

    public Hired(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() + " - Hired at " + companyName;
    }
}
