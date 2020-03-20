package com.bridgelabz.design_patterns.creational.factory_pattern;

public abstract class Computers {
	public abstract String getHDD();
	public abstract String geRAM();
	public abstract String getCPU();
	
	public String toString() {
		return "CPU : "+this.getCPU()+"\nHDD : "+this.getHDD()+"\nRAM : "+this.geRAM();
	}
}
