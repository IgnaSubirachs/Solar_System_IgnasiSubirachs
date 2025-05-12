import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeavenlyBodiesManager {
    private final List<HeavenlyBodies> bodies;

    public HeavenlyBodiesManager() {
        this.bodies = new ArrayList<>();
    }

    public void addBodies(HeavenlyBodies bodies) {
        this.bodies.add(bodies);
    }

    public void listAll() {
        bodies.forEach(body -> System.out.println(body.toString()));
    }

    public List<HeavenlyBodies> getHeavenlyBodiesDescription() {
        List<HeavenlyBodies> descriptionBodies = new ArrayList<>();
        for (HeavenlyBodies body : bodies) {
            body.BodiesDescription();
            descriptionBodies.add(body);
        }
        return descriptionBodies;
    }

    public List<Planet> planetWithAtmosphere() {
        return bodies.stream()
                .filter(c -> c instanceof Planet)
                .map(body -> (Planet) body)
                .filter(Planet::isAtmosphere)
                .collect(Collectors.toList());
    }


    public List<Moon> moonsPerPlanet(Planet planetName) {
        return bodies.stream()
                .filter(c -> c instanceof Moon)
                .map(c -> (Moon) c)
                .filter(l -> l.getOrbitalPlanet().equals(planetName.getName()))
                .collect(Collectors.toList());
    }


}





