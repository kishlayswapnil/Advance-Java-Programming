package com.bridgelabz.design_patterns.structural.adapter_design_pattern;

public class Volt {
	private int volts;

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
	//constructor
	public Volt(int v) {
		this.volts = v; 
	}

}
