package com.cbianchi.jets;

public class Barracks {

	Pilot[] pilotSquadron;
	
	
	public Pilot[] getPilotSquadron() {
		return pilotSquadron;
	}


	public void setPilotSquadron(Pilot[] pilotSquadron) {
		this.pilotSquadron = pilotSquadron;
	}
	
	
	public void addPilot(Pilot p1) {
		Pilot[] tempList = new Pilot[pilotSquadron.length + 1];
		
		for(int i = 0; i < pilotSquadron.length; i++) {
			tempList[i] = pilotSquadron[i];
		}
		tempList[tempList.length - 1] = p1;
		pilotSquadron = tempList;
	}
	
	
	
	
	
	
	
	
	
}
