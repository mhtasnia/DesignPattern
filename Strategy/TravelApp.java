package DesignPattern.Strategy;

public class TravelApp {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();

        planner.setRouteStrategy(new ShortestDistanceStrategy());
        planner.calculateRoute("New York", "Los Angeles");

        planner.setRouteStrategy(new FastestTimeStrategy());
        planner.calculateRoute("New York", "Los Angeles");

        planner.setRouteStrategy(new ScenicRouteStrategy());
        planner.calculateRoute("New York", "Los Angeles");

        planner.setRouteStrategy(new PublicTransportStrategy());
        planner.calculateRoute("New York", "Los Angeles");
    }
}
