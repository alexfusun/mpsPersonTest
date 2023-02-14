package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4, p5, p6;
    List<Person> persons;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception {
        p1 = new Person("John", 21, "male");
        p2 = new Person("Ross", 14, "Male");
        p3 = new Person("Jess", 26, "FEMALE");
        p4 = new Person("Bob", 5, "MALE");
        p5 = new Person("Tess", 11, "Female");
        p6 = new Person("Lisa", 33, "female");

        persons = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        persons = null;
        p1 = null;
        p2 = null;
        p3 = null;
        p4 = null;
        p5 = null;
        p6 = null;
    }

    @Test
    void shouldReturnName() {
        assertEquals("John", p1.name());
        assertEquals("Tess", p5.name());
    }

    @Test
    void shouldReturnAge() {
        assertEquals(21, p1.age());
        assertEquals(11, p5.age());
    }

    @Test
    void shouldReturnGender() {
        assertEquals("MALE", p1.gender());
        assertEquals("FEMALE", p5.gender());
    }

}