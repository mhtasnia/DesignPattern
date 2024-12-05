package DesignPattern.Strategy;

public class ShortestDistanceStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String start, String destination) {
        return "Calculating the shortest distance route from " + start + " to " + destination + ".";
    }
}
