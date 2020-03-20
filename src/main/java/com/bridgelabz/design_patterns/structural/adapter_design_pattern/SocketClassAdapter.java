package com.bridgelabz.design_patterns.structural.adapter_design_pattern;

/*			SocketClassAdapter, This form uses java inheritance and extends the source interface, in our case Socket class.
 * 			While implementing Adapter pattern, there are two approaches � class adapter and object adapter � however both
 * 			these approaches produce same result.
 */
public class SocketClassAdapter extends Socket implements ISocketAdapter {
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get120Volts() {
		return getVolt();
	}

	@Override
	public Volt get12Volts() {
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volts() {
		Volt v= getVolt();
		return convertVolt(v,40);
	}
}
