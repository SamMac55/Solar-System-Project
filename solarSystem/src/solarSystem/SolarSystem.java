package solarSystem;
import java.util.ArrayList;
public class SolarSystem {
	private ArrayList<CelestialBody> system = new ArrayList<CelestialBody>();
	public SolarSystem() {
		System.out.println("New Solar System Created!");
	}
	public void addStar(String name, double mass, double radius, double luminosity) {
		Star newStar = new Star(name,mass,radius,luminosity);
		system.add(newStar);
	}
	public void addPlanet(String name, double mass, double radius, double distance, double starMass) {
		Planet newPlanet = new Planet(name,mass,radius,distance,starMass);
		system.add(newPlanet);
	}
	public void addMoonToPlanet(Planet planet, String name, double mass, double radius, double distance, double planetMass) {
		Moon newMoon = new Moon(name,mass,radius,distance, planetMass);
		planet.addMoons(newMoon);
		system.add(newMoon);
	}
	public void printInfo() {
		System.out.println("System Information: ");
		for(int i = 0; i<system.size(); i++) {
			system.get(i).displayInfo();
			System.out.println();
		}
	}
	public ArrayList<CelestialBody> getSystem(){
		return system;
	}
	public static void main(String[] args) {
		SolarSystem system = new SolarSystem();
		ArrayList<CelestialBody> arraySystem = system.getSystem();
		system.addStar("Sun", 4.4e30, 696340, 3.846e26);
		system.addPlanet("Mercury", 3.285e23, 2439.7, 6.1992e10, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Venus", 4.86732e24, 6051.8, 1.0875e11, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Earth", 5.9722e24, 6371, 1.496e8, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Mars",6.42e23, 3389.5, 2.2695e8, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Jupiter", 1.898e27, 69911, 4.6964e8, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Saturn", 5.68319e26, 60268, 897.06e8, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Uranus", 8.681e25, 25559, 1.8182e9, ((Star)arraySystem.get(0)).getMass());
		system.addPlanet("Neptune", 1.0241e26, 24622, 2.7786e9, ((Star)arraySystem.get(0)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(3), "Moon", 7.348e22, 1737.4, 384400, ((Planet) arraySystem.get(3)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(4), "Phobos", 1.0659e16, 11.1, 6000, ((Planet) arraySystem.get(4)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(4), "Deimos", 1.4762e15, 6.2, 23458, ((Planet) arraySystem.get(4)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(5), "Europa", 4.79984e22, 1560.8, 671000, ((Planet) arraySystem.get(5)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(5), "Io", 8.9319e22, 1821.6, 422000, ((Planet) arraySystem.get(5)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(6), "Titan", 1.35e23, 2574.7, 1.2e6, ((Planet) arraySystem.get(6)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(6), "Dione", 1.10e21, 561.4, 377400, ((Planet) arraySystem.get(6)).getMass());
		system.addMoonToPlanet((Planet)arraySystem.get(7), "Puck", 2.9e18, 81, 86010, ((Planet) arraySystem.get(7)).getMass());
		system.printInfo();
		
		
	}
}
