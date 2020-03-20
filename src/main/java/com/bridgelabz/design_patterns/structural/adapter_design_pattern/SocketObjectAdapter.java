package com.bridgelabz.design_patterns.structural.adapter_design_pattern;

public class SocketObjectAdapter implements ISocketAdapter {
	private Socket socketObject = new Socket();

	@Override
	public Volt get120Volts() {
		return socketObject.getVolt();
	}

	@Override
	public Volt get12Volts() {
		Volt v= socketObject.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volts() {
		Volt v= socketObject.getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
