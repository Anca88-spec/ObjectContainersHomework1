package org.ObjectContainers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Country romania = new Country("Romania");
        Country spain = new Country("Spain");

        Address address1 = new Address("Romana, 25", romania);
        Address address2 = new Address("Madrid, 17", spain);

        Hobby cycling = new Hobby("Cycling", 3, List.of(address1));
        Hobby swimming = new Hobby("Swimming", 2, List.of(address2));

        Person alex = new Unemployed("Alex", 25);
        Person jon = new Hired("Jon", 30, "Bosch");
        Person brad = new Student("Brad", 20, "Harvard");

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        TreeSet<Person> personsByName = new TreeSet<>(nameComparator);
        TreeSet<Person> personsByAge = new TreeSet<>(ageComparator);

        personsByName.add(alex);
        personsByName.add(jon);
        personsByName.add(brad);

        personsByAge.add(alex);
        personsByAge.add(jon);
        personsByAge.add(brad);

        Map<Person, List<Hobby>> personHobbiesMap = new HashMap<>();
        personHobbiesMap.put(alex, List.of(cycling));
        personHobbiesMap.put(jon, List.of(swimming));
        personHobbiesMap.put(brad, Arrays.asList(cycling, swimming));

        System.out.println("Persons sorted by Name:");
        for (Person person : personsByName) {
            System.out.println(person);
        }

        System.out.println("\nPersons sorted by Age:");
        for (Person person : personsByAge) {
            System.out.println(person);
        }

        System.out.println("\nHobbies and countries for Jon:");
        for (Hobby hobby : personHobbiesMap.get(jon)) {
            System.out.println(hobby);
            for (Address address : hobby.getAddresses()) {
                System.out.println("  Practiced in: " + address.getCountry());
            }
        }
    }
}
