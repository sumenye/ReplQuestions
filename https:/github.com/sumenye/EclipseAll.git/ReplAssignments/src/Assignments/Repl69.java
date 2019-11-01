package Assignments;

import java.util.Scanner;

public class Repl69 {

	public static void main(String[] args) {

		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String licenceAvailability = scan.nextLine();
		if (licenceAvailability.equals("Yes")) {
			System.out.println("Enter your zip code");
			int zipCode = scan.nextInt();
			switch (zipCode) {
			case 20910:
			case 20740:
				premium += 60;
				break;
			case 22102:
			case 22103:
				premium += 30;
				break;
			default:
				premium += 50;
				break;
			}
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.next();
			if (vehicleOwnership.equalsIgnoreCase("Owned"))
				premium += 10;
			else
				premium += 20;
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.next();
			if (vehicleUsage.equalsIgnoreCase("Bussiness"))
				premium += 50;
			else if (vehicleUsage.equalsIgnoreCase("Pleasure"))
				premium += 10;
			else if (vehicleUsage.equalsIgnoreCase("Commute"))
				premium += 20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium = premium + daysDrivenToWorkOrSchool * 5;
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium = premium + milesToWorkOrSchool;

			System.out.println("How old are you?");
			int age = scan.nextInt();
			if (age < 16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else if (age < 18 && age >= 16)
				premium *= 20;
			else if (age >= 18 && age <= 21)
				premium *= 6;
			else if (age >= 21 && age < 25)
				premium *= 2;
			System.out.println("How many years you've been driving?");
			int drivingYear = scan.nextInt();
			if (drivingYear <= 0 && (age - drivingYear) < 16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else
				premium = premium - drivingYear * 5;
			System.out.println("Have you had any accidents in the last 5 years?");
			String accidentAvailability = scan.nextLine();
			if (accidentAvailability.equalsIgnoreCase("Yes")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				premium = premium + 0.2 * premium * accidentsAmount;
			}
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.nextLine();
			if (continuousInsurance.equalsIgnoreCase("No"))
				premium *= 2;
			System.out.println("What is the highest level of education you have completed?");
			education = scan.nextLine();
			switch (education) {
			case "PhD":
			case "Bachelors":
			case "Masters":
				premium = premium - premium * 0.05;
				break;
			case "Doctors":
				premium = premium - premium * 0.1;
				break;
			case "Less than High School":
				premium = premium + premium * 0.05;
				break;
			default:
				break;
			}

			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $" + premium);
			int nameLength = name.length();

			referenceNumber = "" + name.substring(0, 2) + name.substring((nameLength - 2), nameLength) + ""
					+ education.trim();

			System.out.println("Reference number: " + referenceNumber.toUpperCase());
		}

		if (!licenceAvailability.equals("Yes")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}

	}

}
