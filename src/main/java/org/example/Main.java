package main.java.org.example;

import main.java.org.example.Task1.Animal;
import main.java.org.example.Task1.Cat;
import main.java.org.example.Task1.Dog;
import main.java.org.example.Task2.Movable;
import main.java.org.example.Task2.Point;
import main.java.org.example.Task3.Smartphone;
import main.java.org.example.Task4.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Завдання 1:\n");

        Animal dog = new Dog("Копиум");
        Animal cat = new Cat("Гламурка");

        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());


        System.out.println("\n\n\nЗавдання 2:\n");

        Movable myPoint = new Point(2, 9);

        System.out.println("Початкова позиція: " + myPoint);

        myPoint.moveTo(241, -4);
        System.out.println("Після moveTo: " + myPoint);

        myPoint.setX(927);
        System.out.println("Після setX: " + myPoint);

        myPoint.setY(729);
        System.out.println("Після setY: " + myPoint);

        System.out.println("Поточна координата X: " + myPoint.getX());
        System.out.println("Поточна координата Y: " + myPoint.getY());


        System.out.println("\n\n\nЗавдання 3:\n");

        Smartphone phone = new Smartphone("Грушефон 241", 50.45, 30.52);

        phone.makeCall();
        phone.receiveCall();

        System.out.println("Координати: " + Arrays.toString(phone.getCoordinates()));


        System.out.println("\n\n\nЗавдання 4:\n");

        Car car1 = new Car(20000, 2019, 150);
        Car car2 = new Car(20000, 2021, 140);
        Car car3 = new Car(15000, 2018, 110);
        Car car4 = new Car(15000, 2022, 100);
        Car car5 = new Car(20000, 2021, 180);

        int res;

        // car1 vs car2
        res = car1.compareTo(car2);
        if (res > 0) System.out.println("car1 краща за car2");
        else if (res < 0) System.out.println("car2 краща за car1");
        else System.out.println("car1 і car2 рівноцінні");
        System.out.println("  car1: " + car1);
        System.out.println("  car2: " + car2);
        System.out.println();

        // car2 vs car3
        res = car2.compareTo(car3);
        if (res > 0) System.out.println("car2 краща за car3");
        else if (res < 0) System.out.println("car3 краща за car2");
        else System.out.println("car2 і car3 рівноцінні");
        System.out.println("  car2: " + car2);
        System.out.println("  car3: " + car3);
        System.out.println();

        // car2 vs car5
        res = car2.compareTo(car5);
        if (res > 0) System.out.println("car2 краща за car5");
        else if (res < 0) System.out.println("car5 краща за car2");
        else System.out.println("car2 і car5 рівноцінні");
        System.out.println("  car2: " + car2);
        System.out.println("  car5: " + car5);
        System.out.println();

        // car3 vs car4
        res = car3.compareTo(car4);
        if (res > 0) System.out.println("car3 краща за car4");
        else if (res < 0) System.out.println("car4 краща за car3");
        else System.out.println("car3 і car4 рівноцінні");
        System.out.println("  car3: " + car3);
        System.out.println("  car4: " + car4);
        System.out.println();
    }
}