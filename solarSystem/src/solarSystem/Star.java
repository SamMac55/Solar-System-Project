package solarSystem;

public class Star extends CelestialBody{
	private double luminosity;
	public Star(String name2, double mass2, double radius2, double luminosity) {
		super(name2, mass2, radius2);
		this.luminosity = luminosity;
	}

	@Override
	void displayInfo() {
		System.out.println("Name: " + name + "\nMass: " + mass + "\nRadius: " + radius + "\nLuminosity: " + luminosity);
		
	}
	public double getMass() {
		return mass;
	}

}
