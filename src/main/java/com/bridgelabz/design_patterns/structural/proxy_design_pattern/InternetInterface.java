package com.bridgelabz.design_patterns.structural.proxy_design_pattern;

import java.util.List;

public interface InternetInterface {
	public void connect(String sites) throws Exception;
	public void display(List<String> bannedSites);
}
