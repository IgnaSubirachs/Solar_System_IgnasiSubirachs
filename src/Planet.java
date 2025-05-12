public class Planet extends HeavenlyBodies implements Habitable {
    private final int moonsNumber;
    private final boolean atmosphere;

    public Planet(double diameter, int hoursPerDay, String name, boolean atmosphere, int moonsNumber) {
        super(diameter, hoursPerDay, name);
        this.atmosphere = atmosphere;
        this.moonsNumber = moonsNumber;
    }

    @Override
    public void BodiesDescription() {
        if (!atmosphere) {
            System.out.println(getName() + " has a diameter of " + getDiameter() + " km and hasn't got an atmosphere. It has " + moonsNumber + "  moon.");
        }
        System.out.println(getName() + " has a diameter of " + getDiameter() + " km and has an atmosphere. It has " + moonsNumber + "  moon.");
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    @Override
    public void isHabitable() {
        System.out.println(getName() + " isHabitable");

    }

    @Override
    public String toString() {
        return "Planet{" +
                "atmosphere=" + atmosphere +
                ", moonsNumber=" + moonsNumber +
                "} " + super.toString();
    }
}


