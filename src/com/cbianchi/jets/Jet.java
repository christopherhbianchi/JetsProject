package com.cbianchi.jets;

public class Jet {

	String model;
	double speed, price, range; // speed taken in mph and converted to Mach

	public Jet(String model, double speed, double range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;

	}

	public Jet() {
		this("Nimbus 2000", 0.0, 60_000, 1_000);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = machConversion(speed);
	}

	public double machConversion(double speed) { // created a method rather than a calculation up in the field area for
													// reusability.

		this.speed = speed * 0.001303;
		return this.speed;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = (double) price;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = (double) range;
	}

	public String showPlane() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet Model:");
		builder.append(model);
		builder.append(", Speed: ");
		builder.append(speed);
		builder.append(", Price: ");
		builder.append(price);
		builder.append(", Range: ");
		builder.append(range);
		builder.append("");
		return builder.toString();
	}
}





















