public abstract class HeavenlyBodies {

    private final double diameter;
    private final int hoursPerDay;
    private final String name;

    public HeavenlyBodies(double diameter, int hoursPerDay, String name) {
        this.diameter = diameter;
        this.hoursPerDay = hoursPerDay;
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public String getName() {
        return name;
    }

    public abstract void BodiesDescription ();

    @Override
    public String toString() {
        return "HeavenlyBodies{" +
                "diameter=" + diameter +
                ", hoursPerDay=" + hoursPerDay +
                ", name='" + name + '\'' +
                '}';
    }
}
