package com.company.model;

public class Animal extends Shape {

     public String name;
     public int age;
     public double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void speak(){
        System.out.println("Say hello to your mother for me.");
    }

    @Override
    public void draw() {

    }

    @Override
    public void update() {

    }
}

