package com.bridgelabz.design_patterns.structural.adapter_design_pattern;

public class TestAdapterDesignPattern {

	public static void main(String[] args) {
		//Creating object of SocketClassAdapter 
		ISocketAdapter adapterSocketInterface1 = new SocketClassAdapter();
		Volt v3 = getVolts(adapterSocketInterface1, 3);
		Volt v12 = getVolts(adapterSocketInterface1, 12);
		Volt v120 = getVolts(adapterSocketInterface1, 120);
		System.out.println("Socket Class Adapter v3 : "+v3.getVolts());
		System.out.println("Socket Class Adapter v12 : "+v12.getVolts());
		System.out.println("Socket Class Adapter v120 : "+v120.getVolts());
		
		//Creating object of SocketObjectAdapter
		ISocketAdapter adapterSocketInterface2 = new SocketObjectAdapter();
		System.out.println("Adapter Design Pattern Using Object Adapter\n----------------------------------------------");
		Volt v_3 = getVolts(adapterSocketInterface2, 3);
		Volt v_12 = getVolts(adapterSocketInterface2, 12);
		Volt v_120 = getVolts(adapterSocketInterface2, 120);
		System.out.println("Socket Object Adapter v3 : "+v_3.getVolts());
		System.out.println("Socket Object Adapter v12 : "+v_12.getVolts());
		System.out.println("Socket Object Adapter v120 : "+v_120.getVolts());

	}

	private static Volt getVolts(ISocketAdapter adapterSocketInterface, int volts) {
		switch (volts) {
			case 120:
				return adapterSocketInterface.get120Volts();
			case 12:
				return adapterSocketInterface.get12Volts();
			case 3:
				return adapterSocketInterface.get3Volts();
		default:
			break;
		}
		return null;
	}
}
