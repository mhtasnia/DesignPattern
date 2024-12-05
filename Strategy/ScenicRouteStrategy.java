package DesignPattern.Strategy;

public class ScenicRouteStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String start, String destination) {
        return "Calculating the scenic route from " + start + " to " + destination + ".";
    }
}
