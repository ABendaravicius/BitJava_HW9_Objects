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

        // Employee masyvo rikiavimas pagal atlyginimą nuo mažiausio iki didžiausio
        System.out.println("... Employee array sort min -> max");
        int minIdx;
        int minSalary;
        int currentSalary;

        // Element min -> max sort
        for (int i = 0; i < employees.length; i++) {
            minIdx = i;
            minSalary = employees[i].getSalary();

            for (int j = i + 1;j < employees.length; j++) {

                currentSalary = employees[j].getSalary();

                if (currentSalary < minSalary) {
                    minIdx = j;
                    minSalary = currentSalary;
                }
            }
            System.out.println("... keiciamas");
            System.out.println(minIdx);
            Employee temp = employees[minIdx];
            employees[minIdx] = employees[i];
            employees[i] = temp;
        }

        //int min;
        //for (int i = 0; i < employees.length; i++) {
        //
        //}
        //System.out.println(employees[min]);

        System.out.println(">> Employee array after sorting:");
        for (Employee employee : employees) {
            System.out.println((Arrays.asList(employees).indexOf(employee) + 1) + ") " + employee);
        }
    }
}
