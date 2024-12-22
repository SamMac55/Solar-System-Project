package solarSystem;
import java.util.ArrayList;

public class Planet extends CelestialBody implements Orbitable {
	protected double distanceFromStar;
	protected ArrayList<Moon> moons = new ArrayList<Moon>();
	protected double starMass;
	public Planet(String name, double mass, double radius, double distance, double starMass) {
		super(name,mass,radius);
		distanceFromStar = distance;
		this.starMass = starMass;
	}
	@Override
	void displayInfo() {
		System.out.println("Planet Name: " + name +"\nMass: " + mass + "\nRadius: " + radius);
		System.out.println("\nOrbital Info: \nSpeed: "+calculateOrbitableSpeed()+ "\nPeriod: " +calculateOrbitablePeriod() );
		System.out.println("*****"+ name + "'s Moons: *****");
		System.out.println();
		for(int i = 0; i<moons.size(); i++) {
			moons.get(i).displayInfo();
			System.out.println();
		}
		System.out.println("**********");
	}

	@Override
	public double calculateOrbitableSpeed() {
		double metersRadius = distanceFromStar*1000;
		double orbitableSpeed = Math.sqrt((6.674e-11*mass)/metersRadius);
		return orbitableSpeed;
	}

	@Override
	public double calculateOrbitablePeriod() {
		double metersRadius= distanceFromStar*1000;
		double orbitablePeriod = 2* Math.PI*Math.sqrt(Math.pow(metersRadius, 3)/(6.674e-11*starMass));
		return orbitablePeriod;
	}
	public void addMoons(Moon moon) {
		moons.add(moon);
	}
	public double getMass() {
		return mass;
	}

}
