package com.company;

public abstract class Animal {
    public Roam roam;

    public Animal() {}

    public void sleep() {
        System.out.println("Sleep");
    }
    public Animal(Roam roam) {
       this.roam = roam;
    }

    public void makeNoise() {
        System.out.println("Noise");
    }

    public static class Roam {
    }
}
