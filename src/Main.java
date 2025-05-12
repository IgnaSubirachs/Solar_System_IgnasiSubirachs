public class Main {
    public static void main(String[] args) {
        HeavenlyBodiesManager bodiesManager = new HeavenlyBodiesManager();


        Planet planet1 = new Planet(5000, 24, "Marts", false, 5);
        Planet planet2 = new Planet(45000, 24, "Earth", true, 1);
        Star star1 = new Star(500, 5, "Sun", "V62", 5000);
        Moon moon1 = new Moon(300, 5, "CheeseHoles", planet2, true);

        bodiesManager.addBodies(planet1);
        bodiesManager.addBodies(star1);
        bodiesManager.addBodies(moon1);
        bodiesManager.addBodies(planet2);
        System.out.println(bodiesManager.getHeavenlyBodiesDescription());
        System.out.println(bodiesManager.moonsPerPlanet(planet2));
        System.out.println(bodiesManager.planetWithAtmosphere());


    }


}