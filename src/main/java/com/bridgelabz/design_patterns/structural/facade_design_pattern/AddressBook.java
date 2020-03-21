package com.bridgelabz.design_patterns.structural.facade_design_pattern;

import java.sql.SQLException;
import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		FacadeDatabase facadeDatabase = new FacadeDatabase();
		System.out.println("Enter Database Name : ");
		String database = scan.next();
		System.out.println("Enter Username");
		String username = scan.next();
		System.out.println("Enter Password");
		String password = scan.next();

		String query = null;

		do {
			System.out.println("1. Insert Data\n2. Read Data\n");
			System.out.println("Enter your Choice");
			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					query = "create table Address_Book (`ID` INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT, `FIRST_NAME` VARCHAR(20), `LAST_NAME` VARCHAR(20), "
							+ "`ADDRESS` VARCHAR(20), `CITY` VARCHAR(15), `STATE` VARCHAR(15), `ZIP` INTEGER(6), `CONTACT` BIGINT(10));";
					System.out.println("Table Created Successfully...!!!");

					System.out.println("Enter First Name: ");
					String firstName = scan.next();
					System.out.println("Enter Last Name: ");
					String lastName = scan.next();
					System.out.println("Enter Address: ");
					String address = scan.next();
					System.out.println("Enter City Name: ");
					String city = scan.next();
					System.out.println("Enter State:");
					String state = scan.next();
					System.out.println("Enter ZIP: ");
					int zip = scan.nextInt();
					System.out.println("Enter Contact no: ");
					long contact = scan.nextInt();

					String sqlQuery1 = "INSERT INTO Address_Book(FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, ZIP, CONTACT) VALUES "
							+ "('"+firstName+"', '"+lastName+"', '"+address+"', '"+city+"', '"+state+"', '"+zip+"', '"+contact+"');";


					facadeDatabase.init("jdbc:mysql://localhost:3306/"+database+"?autoReconnect=true&useSSL=false", username, password, query);
					facadeDatabase.insertToTable(sqlQuery1);

					System.out.println("Record Inserted");
					break;

				case 2:
					facadeDatabase.init("jdbc:mysql://localhost:3306/"+database+"?autoReconnect=true&useSSL=false", username, password, query);
					facadeDatabase.readFromDataBase("SELECT * FROM Address_Book");
					break;

				default:
					System.out.println("invalid Choice");
					break;
			}
		}while(true);

	}

}
