public class Moon extends HeavenlyBodies implements Habitable {
    private final Planet orbitalPlanet;
    private final boolean rockySurface;

    public Moon(double diameter, int hoursPerDay, String name, Planet orbitalPlanet, boolean rockySurface) {
        super(diameter, hoursPerDay, name);
        this.orbitalPlanet = orbitalPlanet;
        this.rockySurface = rockySurface;
    }

    public Planet getOrbitalPlanet() {
        return orbitalPlanet;
    }

    @Override
    public void BodiesDescription() {
        if (!rockySurface) {
            System.out.println("The " + getName() + " orbits the " + orbitalPlanet + ". Its surface isn't  rocky and its diameter is " + getDiameter() + " km.");
        }
        System.out.println("The " + getName() + " orbits the " + orbitalPlanet + ". Its surface is rocky and its diameter is " + getDiameter() + " km.");
    }

    @Override
    public void isHabitable() {
        System.out.println(getName() + " isHabitable");
    }

    @Override
    public String toString() {
        return "Moon{" +
                "orbitalPlanet=" + orbitalPlanet +
                ", rockySurface=" + rockySurface +
                "} " + super.toString();
    }
}
