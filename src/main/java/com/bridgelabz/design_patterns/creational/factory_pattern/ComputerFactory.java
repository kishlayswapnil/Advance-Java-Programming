package com.bridgelabz.design_patterns.creational.factory_pattern;

public class ComputerFactory {
	public static Computers getComputers(String type, String hdd, String ram, String cpu) {
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		return null;
	}
}
