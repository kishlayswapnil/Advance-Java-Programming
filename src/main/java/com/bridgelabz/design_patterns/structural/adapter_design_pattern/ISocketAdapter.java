package com.bridgelabz.design_patterns.structural.adapter_design_pattern;

public interface ISocketAdapter 
{
	public Volt get120Volts();
	public Volt get12Volts();
	public Volt get3Volts();
}
