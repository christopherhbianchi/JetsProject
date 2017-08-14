package com.cbianchi.jets; //this second JetAppStretch class is my attempt at building out the project 
						   //with all the stretch goals to challenge myself. Please defer to my regular JetApp file for grading

import java.util.Scanner;
import static java.lang.System.*;

public class JetAppStretch {

	public static Scanner keyboard = new Scanner(System.in);

	Hangar h1 = new Hangar();
	Barracks b1 = new Barracks();
	Pilot[] pilotAssignment;

	public static void main(String[] args) {

		JetAppStretch app = new JetAppStretch();
		app.run();

	}

	public void run() {
		initializeJets();
		initializePilots();
		pilotAssignment = assignPilots(b1, h1);
		listMenu();

	}

	public void initializeJets() {
		Jet[] jetFleet = new Jet[5];
		jetFleet[0] = new Jet();
		jetFleet[1] = new Jet();
		jetFleet[2] = new Jet();
		jetFleet[3] = new Jet();
		jetFleet[4] = new Jet();

		jetFleet[0].setModel("F-35");
		jetFleet[0].setSpeed(7_000);
		jetFleet[0].setRange(90_000);
		jetFleet[0].setPrice(1_000_000_000);

		jetFleet[1].setModel("F-16");
		jetFleet[1].setSpeed(4_000);
		jetFleet[1].setRange(60_000);
		jetFleet[1].setPrice(90_000_000);

		jetFleet[2].setModel("F-18 Super Hornet");
		jetFleet[2].setSpeed(5_000);
		jetFleet[2].setRange(70_000);
		jetFleet[2].setPrice(100_000_000);

		jetFleet[3].setModel("J-20");
		jetFleet[3].setSpeed(3_000);
		jetFleet[3].setRange(30_000);
		jetFleet[3].setPrice(1_000_000);

		jetFleet[4].setModel("Su-35");
		jetFleet[4].setSpeed(500);
		jetFleet[4].setRange(10_000);
		jetFleet[4].setPrice(50_000);
		h1.setJetFleet(jetFleet);
	}

	public void initializePilots() {
		Pilot[] pilotSquadron = new Pilot[5];
		pilotSquadron[0] = new Pilot();
		pilotSquadron[1] = new Pilot();
		pilotSquadron[2] = new Pilot();
		pilotSquadron[3] = new Pilot();

		pilotSquadron[0].setName("Maverick");
		pilotSquadron[0].setAge(24);
		pilotSquadron[0].setExperience(1);

		pilotSquadron[1].setName("Iceman");
		pilotSquadron[1].setAge(24);
		pilotSquadron[1].setExperience(1);

		pilotSquadron[2].setName("Archer");
		pilotSquadron[2].setAge(32);
		pilotSquadron[2].setExperience(7);
		b1.setPilotSquadron(pilotSquadron);
	}

	public void listMenu() {

		int choice = 0;

		while (choice != 6) {
			out.println("Enter a number 1-6 to access the following options: "
					+ "\n1. List fleet \n2. View Fastest Jet \n3. View Jet with longest range "
					+ "\n4. Add a jet to fleet \n5. Hire a pilot \n6. Quit");

			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				showFleet(h1, pilotAssignment);
				break;

			case 2:
				viewFastestJet(h1);
				break;

			case 3:
				viewLongestRangeJet(h1);
				break;

			case 4:
				addJetToFleet();
				break;

			case 5:
				addPilotToSquadron();

			case 6:
				out.println("Application terminated.");
				break;
			}
		}

	}

	public void showFleet(Hangar h2, Pilot[] pilotAssignment) {
		Jet[] jetFleet = h2.getJetFleet();
		for (int i = 0; i < jetFleet.length; i++) {

			out.println(jetFleet[i].toString());
			out.println(pilotAssignment[i].toString());
		}
	}

	public void viewFastestJet(Hangar h2) {
		Jet[] jetFleet = h2.getJetFleet();
		System.out.println(jetFleet.length);
		double fastestSpeed = 0;
		int j = 0;

		fastestSpeed = jetFleet[0].getSpeed();
		for (int i = 0; i < jetFleet.length; i++) {

			if (jetFleet[i].getSpeed() > fastestSpeed) {
				fastestSpeed = jetFleet[i].getSpeed();
				j = i;
			}
		}
		out.println(jetFleet[j].toString());
	}

	public void viewLongestRangeJet(Hangar h2) {
		Jet[] jetFleet = h2.getJetFleet();
		double longestRange = 0;
		int j = 0;

		longestRange = jetFleet[0].getRange();
		for (int i = 0; i < jetFleet.length; i++) {

			if (jetFleet[i].getRange() > longestRange) {

				longestRange = jetFleet[i].getRange();
				j = i;
			}
		}
		out.println(jetFleet[j].toString());
	}

	public void addJetToFleet() {
		Jet[] jetFleet = h1.getJetFleet();
		Jet j1 = new Jet();
		String model;
		double speed, range, price = 0;

		out.println("Please enter the model: ");
		model = keyboard.next();
		out.println("Please enter it's speed: ");
		speed = keyboard.nextDouble();
		out.println("Please enter the range: ");
		range = keyboard.nextDouble();
		out.println("Please enter the price: ");
		price = keyboard.nextDouble();

		j1.setModel(model);
		j1.setSpeed(speed);
		j1.setRange(range);
		j1.setPrice(price);

		h1.addJet(j1);

	}

	public void addPilotToSquadron() {
		Pilot[] pilotSquadron = b1.getPilotSquadron();
		Pilot p1 = new Pilot();
		String name;
		int age, experience;

		out.println("Please enter the pilot's name: ");
		name = keyboard.next();
		out.println("Enter the pilot's age: ");
		age = keyboard.nextInt();
		out.println("Enter the pilot's years of experience: ");
		experience = keyboard.nextInt();

		p1.setName(name);
		p1.setAge(age);
		p1.setExperience(experience);

		b1.addPilot(p1);
		// assignPilots(b1, h1);
	}

	public Pilot[] assignPilots(Barracks b1, Hangar h1) { // need the hangar to get the hangar length
		Pilot[] pilotArray = b1.getPilotSquadron();
		Jet[] jetArray = h1.getJetFleet();
		Pilot[] pilotAssignment = new Pilot[jetArray.length];

		for (int i = 0; i < jetArray.length; i++) {
			int j = (int) (Math.random() * (jetArray.length - 1));
			pilotAssignment[i] = pilotArray[j];
		}
		return pilotAssignment;

	}

	public Pilot[] assignAnotherPilot(Barracks b1, Hangar h1, Pilot[] pilotAssignment) {
		Jet[] jetArray = h1.getJetFleet();
		Pilot[] pilotArray = b1.getPilotSquadron();

		int j = (int) (Math.random() * pilotArray.length - 1);
		Pilot[] pilotAssignment1 = pilotAssignment[pilotAssignment.length + 1];

	}
	// will be continued later

}
