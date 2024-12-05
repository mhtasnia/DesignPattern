package DesignPattern.Strategy;

public class FastestTimeStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String start, String destination) {
        return "Calculating the fastest time route from " + start + " to " + destination + ".";
    }
}

