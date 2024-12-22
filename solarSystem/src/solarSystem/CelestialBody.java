package solarSystem;

public abstract class CelestialBody {
	protected String name;
	protected double mass;
	protected double radius;
	public CelestialBody(String name2, double mass2, double radius2) {
		name = name2;
		mass = mass2;
		radius = radius2;
	}
	abstract void displayInfo();
}
