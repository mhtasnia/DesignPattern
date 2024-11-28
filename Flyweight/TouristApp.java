public class TouristApp {
    public static void main(String[] args) {
        LandmarkFactory factory = new LandmarkFactory();

        Landmark restaurant1 = factory.getLandmark("restaurant", new Point(10, 20));
        Landmark restaurant2 = factory.getLandmark("restaurant", new Point(30, 40));

        Landmark museumLandmark1 = factory.getLandmark("museum", new Point(50, 20));

        Landmark Park1 = factory.getLandmark("park", new Point(75, 100));

        restaurant1.display();
        restaurant2.display();
        museumLandmark1.display();
        Park1.display();
    }

}
