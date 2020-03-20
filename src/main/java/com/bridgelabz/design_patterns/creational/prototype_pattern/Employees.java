package com.bridgelabz.design_patterns.creational.prototype_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employees {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        Scanner scan = new Scanner(System.in);

        // read all employees from database and put into the list
        System.out.println("enter the number of persons to add a group");
        int range = scan.nextInt();
        System.out.println("enter the names");
        for (int index = 0; index < range; index++) {
            empList.add(scan.next());
        }
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}