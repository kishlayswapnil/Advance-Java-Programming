package com.bridgelabz.design_patterns.structural.adapter_design_pattern;

public class Socket {
	public Volt getVolt() {
		return new Volt(240);
	}
}