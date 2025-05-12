public class Star extends HeavenlyBodies {
    private final double temperature;
    private final String spectralLight;

    public Star(double diameter, int hoursPerDay, String name, String spectralLight, double temperature) {
        super(diameter, hoursPerDay, name);
        this.spectralLight = spectralLight;
        this.temperature = temperature;
    }

    @Override
    public void BodiesDescription() {
        System.out.println("The " + getName() + " is a " + spectralLight + " star with a surface temperature of " + temperature + " K. It is the main source of energy for the solar system.");

    }

    @Override
    public String toString() {
        return "Star{" +
                "spectralLight='" + spectralLight + '\'' +
                ", temperature=" + temperature +
                "} " + super.toString();
    }
}
