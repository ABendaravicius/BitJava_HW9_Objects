package com.arnas.hw9;

import java.util.Scanner;

class Person {
    private String name;
    private String lastName;
    private int age;
    private String email;

    Scanner userInput = new Scanner(System.in);

    // ... default constructor
    public Person() {

    }

    // ... parameterized constructor
    public Person(String n, String ln, int yrs, String mail) {
        this.name = n;
        this.lastName = ln;
        this.age = yrs;
        this.email = mail;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        System.out.println("Please enter the person's name: ");
        String name = userInput.nextLine();
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName() {
        System.out.println("Please enter the person's last name: ");
        String lastName = userInput.nextLine();
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        System.out.println("Please enter the person's age: ");
        int age = userInput.nextInt();
        while (age < 0 || age >= 130) {
            System.out.println("Please pass a valid age value (0 - 130)");
            age = userInput.nextInt();
        }
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail() {
        System.out.println("Please enter the person's email: ");
        String email = userInput.nextLine();
        this.email = email;
    }
}

public class ObjectFromConsole {

    public static void main(String[] args) {
        Person individual = new Person();

        individual.setName();
        individual.setLastName();
        individual.setEmail();
        individual.setAge();

        System.out.println("... Informacijos spausdinimas");
        System.out.println("Duomenys apie asmenį:\n" + individual.getName() + "\n" + individual.getLastName() + "\n"+ individual.getAge() + "\n"+ individual.getEmail());
    }
}
