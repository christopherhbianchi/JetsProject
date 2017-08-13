package com.cbianchi.jets;

public class Hangar {

	Jet[] jetFleet; //can create a Jet array in hangar because both aren't static

	public Jet[] getJetFleet() {
		return jetFleet;
	}

	public void setJetFleet(Jet[] jetFleet) {
		this.jetFleet = jetFleet;
	}
	
	public void addJet(Jet j1) {
		//create new array called "tempList" that is one size bigger than the old fleet
		//we make it one size bigger so we can add the new jet to the fleet
		Jet[] tempList = new Jet[jetFleet.length+ 1];
		
		//iterate over the OLD list, storing the values into the NEW list
		for (int i = 0; i < jetFleet.length; i++) {
			tempList[i] = jetFleet[i];
		}
		
		//set the last index of the new list to equal the new "JET" that is passed in
		tempList[tempList.length-1] = j1;
		
		//set jetFleet to equal the new list
		jetFleet = tempList;
		
	}

	

}