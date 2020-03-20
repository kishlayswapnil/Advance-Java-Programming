package com.bridgelabz.design_patterns.creational.factory_pattern;

public class Server extends Computers {
	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	public String getHDD() {
		return this.hdd;
	}

	public String geRAM() {
		return this.ram;
	}

	public String getCPU() {
		return this.cpu;
	}
}
