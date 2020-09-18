package com.arnas.hw9.arr;

import java.util.Arrays;

public class LoopInObjectArr {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Juozas", "Juozaitis", "CEO", 3800);
        Employee emp2 = new Employee("Jonas", "Jonaitis", "CFO", 2500);
        Employee emp3 = new Employee("Petras", "Petraitis", "Head of IT", 3200);
        Employee emp4 = new Employee("Ona", "Onaitienė", "Head of Marketing", 2700);

        Employee[] employees = {emp1, emp2, emp3, emp4};

        System.out.println(">> A list of people currently employeed in the company:");
        for (Employee employee : employees) {
            System.out.println((Arrays.asList(employees).indexOf(employee) + 1) + ") " + employee);
        }
    }
}
