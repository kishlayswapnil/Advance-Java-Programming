package com.bridgelabz.design_patterns.creational.factory_pattern;


import java.util.Scanner;

public class ParentFactory {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Type (PC/Server): ");
		String type = scan.next();
		System.out.println("Enter Ram: ");
		String ram = scan.next();
		System.out.println("Hard Disk: ");
		String hdd = scan.next();
		System.out.println("CPU: ");
		String cpu = scan.next();

		Computers pc = ComputerFactory.getComputers(type, ram, hdd, cpu);
		Computers server = ComputerFactory.getComputers(type, ram, hdd, cpu);
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
