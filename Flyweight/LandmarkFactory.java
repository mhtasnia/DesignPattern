import java.util.HashMap;
import java.util.Map;

class LandmarkFactory {
    private Map<String, LandmarkFlyweight> flyweights = new HashMap<>();

    public Landmark getLandmark(String type, Point location) {
        LandmarkFlyweight flyweight = flyweights.get(type);
        if (flyweight == null) {
            switch (type) {
                case "restaurant":
                    flyweight = new LandmarkFlyweight("R", "Restaurant");
                    break;
                case "museum":
                    flyweight = new LandmarkFlyweight("M", "Museum");
                    break;
                case "park":
                    flyweight = new LandmarkFlyweight("P", "Park");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid landmark type");
            }
            flyweights.put(type, flyweight);
        }
        return new ConcreteLandmark(flyweight, location);
    }
}