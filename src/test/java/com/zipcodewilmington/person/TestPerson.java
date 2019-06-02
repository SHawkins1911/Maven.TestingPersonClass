package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setFavSport() {
        // Given
        Person person = new Person();
        String expected = "Baseball";

        // When
        person.setFavSport(expected);

        // Then
        String actual = person.getFavSport();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setRace() {
        // Given
        Person person = new Person();
        String expected = "Black";

        // When
        person.setRace(expected);

        // Then
        String actual = person.getRace();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNationality() {
        // Given
        Person person = new Person();
        String expected = "American";

        // When
        person.setNationality(expected);

        // Then
        String actual = person.getNationality();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAthlete() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setAthlete(expected);

        // Then
        boolean actual = person.isAthlete();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setOnlyChild() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setOnlyChild(expected);

        // Then
        boolean actual = person.isOnlyChild();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNumSiblings() {
        // Given
        Person person = new Person();
        Integer expected = 0;

        // When
        person.setNumSiblings(expected);

        // Then
        Integer actual = person.getNumSiblings();
        Assert.assertEquals(expected, actual);
    }
}
