package org.example;

import java.util.List;

public class Person {

    private final String name;
    private final int age;
    private final String gender;

    /**
     *
     * @param name: string value
     * @param age: integer value
     * @param gender: male or female
     * @throws Exception when gender input is invalid
     */
    public Person(String name, int age, String gender) throws Exception {
        if (!gender.equalsIgnoreCase("MALE") && !gender.equalsIgnoreCase("FEMALE")) {
            throw new Exception("The following gender is invalid: " + gender);
        }
        this.name = name;
        this.age = age;
        this.gender = gender.toUpperCase();
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public String gender() {
        return gender.toUpperCase();
    }

    /**
     * Computes the average age of male and female persons in a list and returns the result in
     * an array of two elements( the first element is the male mean age and the second one is the
     * female mean age)
     *
     * @param persons: List of Person
     * @return average, -1 if persons does not contain any Person of such gender
     */
    public static double[] averageAgePerGender(List<Person> persons) {
        double[] average = {0, 0};
        int maleCount = 0, femaleCount = 0;

        for (Person p : persons) {
            if (p.gender.equalsIgnoreCase("MALE")) {
                average[0] += p.age;
                maleCount += 1;
            } else {
                average[1] += p.age;
                femaleCount += 1;
            }
        }

        if (maleCount > 0) {
            average[0] /= maleCount;
        } else {
            average[0] = -1;
        }

        if (femaleCount > 0) {
            average[1] /= femaleCount;
        } else {
            average[1] = -1;
        }


        return average;
    }
}
