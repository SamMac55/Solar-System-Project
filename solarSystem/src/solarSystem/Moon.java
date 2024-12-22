package solarSystem;

public class Moon extends CelestialBody implements Orbitable{
	protected double distanceFromPlanet;
	protected double planetMass;
	public Moon(String name, double mass, double radius, double distance, double planetMass){
		super(name,mass,radius);
		distanceFromPlanet = distance;
		this.planetMass = planetMass;
	}
	@Override
	public double calculateOrbitableSpeed() {
		double metersRadius = distanceFromPlanet*1000;
		double orbitableSpeed = Math.sqrt((6.674e-11*mass)/metersRadius);
		return orbitableSpeed;
	}

	@Override
	public double calculateOrbitablePeriod() {
		double metersRadius= distanceFromPlanet*1000;
		double orbitablePeriod = 2* Math.PI*Math.sqrt(Math.pow(metersRadius, 3)/(6.674e-11*planetMass));
		return orbitablePeriod;
	}
	@Override
	void displayInfo() {
		System.out.println("Moon Name: " + name +"\nMass: " + mass + "\nRadius: " + radius);
		System.out.println("Orbital Info: \nSpeed: "+calculateOrbitableSpeed()+ "\nPeriod: " +calculateOrbitablePeriod() );
		
	}

}
