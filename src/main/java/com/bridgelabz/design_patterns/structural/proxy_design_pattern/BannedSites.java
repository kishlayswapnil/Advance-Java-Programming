package com.bridgelabz.design_patterns.structural.proxy_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BannedSites implements InternetInterface {
	InternetInterface internet = new PublicInternet();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("torrentz.eu");
		bannedSites.add("kickass.io");
		bannedSites.add("sitebills.info");
		bannedSites.add("kishlay.info");
	}

	@Override
	public void connect(String sites) throws Exception {
		if (bannedSites.contains(sites.toLowerCase())) {
			throw new Exception("Acces Deined..."+sites+" is banned");
		}
		internet.connect(sites);
	}

	public void display() {
		internet.display(bannedSites);
	}

	@Override
	public void display(List<String> bannedSites) {

	}
}
