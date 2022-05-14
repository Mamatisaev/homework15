package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Shark();
        Animal animal2 = new Turtle();
        Animal animal3 = new Eagle();

        Animal[] animals = {animal1, animal2, animal3};

        Shark[] sharks = new Shark[5];
        Turtle[] turtles = new Turtle[5];
        Eagle[] eagles = new Eagle[5];

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
                System.out.println(animal1.getClass().getName());
                sharks[0] = (Shark) animal1;
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
                System.out.println(animal2.getClass().getName());
                turtles[0] = (Turtle) animal2;
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
                System.out.println(animal3.getClass().getName());
                eagles[0] = (Eagle) animal3;
            }
        }
    }
}