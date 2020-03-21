package com.bridgelabz.design_patterns.structural.proxy_design_pattern;

import java.util.List;

public class PublicInternet implements InternetInterface {

	@Override
	public void connect(String sites) {
		System.out.println("Connecting to: "+sites);
	}

	@Override
	public void display(List<String> bannedSites) {
		System.out.println(bannedSites);
	}
}
