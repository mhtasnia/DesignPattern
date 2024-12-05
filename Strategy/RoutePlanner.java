package DesignPattern.Strategy;

public class RoutePlanner {
    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculateRoute(String start, String destination) {
        if (strategy == null) {
            System.out.println("No route strategy selected.");
        } else {
            System.out.println(strategy.calculateRoute(start, destination));
        }
    }
}
