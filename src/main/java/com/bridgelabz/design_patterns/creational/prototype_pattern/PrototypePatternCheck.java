package com.bridgelabz.design_patterns.creational.prototype_pattern;

import java.util.List;
import java.util.Scanner;

public class PrototypePatternCheck {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employ = new Employees();
        Scanner scan = new Scanner(System.in);
        employ.loadData();

        // Use the clone method to get the Employee object
        Employees newEmploy = (Employees) employ.clone();
        List<String> list = newEmploy.getEmpList();
        System.out.println("enter the no.of names to add to a group");
        int number = scan.nextInt();
        for (int index = 0; index < number; index++) {
            list.add(scan.next());
            System.out.println("New employee List: " + list);
        }
        List<String> list1 = newEmploy.getEmpList();
        System.out.println("enter the no.of names to remove from a group");
        int range2 = scan.nextInt();
        for (int index = 0; index < range2; index++) {
            list.remove(scan.next());
            System.out.println("New employee List: " + list1);
        }
    }
}