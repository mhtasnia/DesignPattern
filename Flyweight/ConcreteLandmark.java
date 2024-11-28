class ConcreteLandmark implements Landmark {
    private LandmarkFlyweight flyweight;
    private Point location;

    public ConcreteLandmark(LandmarkFlyweight flyweight, Point location) {
        this.flyweight = flyweight;
        this.location = location;
    }

    @Override
    public void display() {
        System.out.println("Icon: " + flyweight.icon + ", Description: " + flyweight.description + ", Location: (" + location.getX() + ", " + location.getY() + ")");
    }
}