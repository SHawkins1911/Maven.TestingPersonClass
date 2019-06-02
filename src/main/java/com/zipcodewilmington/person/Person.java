package com.zipcodewilmington.person;

import java.sql.SQLOutput;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String race;
    private String nationality;
    private boolean athlete;
    private String favSport;
    private boolean onlyChild;
    private int numSiblings;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;


    }

    public Person(int age) {
        this.age = 5;
    }

    public Person(String name) {
       this.name = "Leon";
    }

    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }


    public Person(String race, String nationality){
        System.out.println(race + ", " + nationality);
    }

    public Person(boolean onlyChild, int numSiblings){
        System.out.println(onlyChild + ", " + numSiblings);
    }

    public Person(boolean athlete, String favSport){
        System.out.print(athlete + ", " + favSport);
     }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public boolean isAthlete() {
        return athlete;
    }

    public void setAthlete(boolean athlete) {
        this.athlete = athlete;
    }
    public boolean isOnlyChild() {
        return onlyChild;
    }

    public void setOnlyChild(boolean onlyChild) {
        this.onlyChild = onlyChild;
    }

    public int getNumSiblings() {
        return numSiblings;
    }

    public void setNumSiblings(int numSiblings) {
        this.numSiblings = numSiblings;
    }

    public void setFavSport(String favSport) {
        this.favSport = favSport;
    }

    public String getFavSport() {
        return favSport;
    }
}
