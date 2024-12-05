package DesignPattern.Strategy;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public String calculateRoute(String start, String destination) {
        return "Calculating the public transport route from " + start + " to " + destination + ".";
    }
}
