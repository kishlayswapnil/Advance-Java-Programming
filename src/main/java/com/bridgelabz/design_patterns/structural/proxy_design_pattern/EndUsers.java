package com.bridgelabz.design_patterns.structural.proxy_design_pattern;

import java.util.Scanner;

public class EndUsers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InternetInterface internet = new BannedSites();
		BannedSites bannedList = new BannedSites();
		System.out.println("enter list All command to show all Banned Sites(ls-al): ");
		String command = scan.next();
		try {
			if(command.equals("ls-al")) {
				bannedList.display();
			}
		} 
		catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("Search Sites: ");

		//Check if the Site is ban or not. this method will go to BannedSite.java and check each site user input.
		try {
			internet.connect(scan.next());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
