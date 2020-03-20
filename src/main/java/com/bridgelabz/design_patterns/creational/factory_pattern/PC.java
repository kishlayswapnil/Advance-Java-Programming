package com.bridgelabz.design_patterns.creational.factory_pattern;

public class PC extends Computers {
	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String geRAM() {
		return this.ram;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}
