package org.ObjectContainers;

public class Student extends Person {
    private final String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + " - Student at " + university;
    }
}
