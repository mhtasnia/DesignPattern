public class MenuClient {
    public static void main(String[] args) {
        
        MenuCategory mainMenu = new MenuCategory("Main Menu", 0);

        MenuCategory drinks = new MenuCategory("Drinks", 1);
        MenuCategory alcoholicDrinks = new MenuCategory("Alcoholic", 2);
        MenuCategory nonAlcoholicDrinks = new MenuCategory("Non-Alcoholic", 2);

        alcoholicDrinks.add(new MenuItemItem("Beer", "Various beer brands"));
        alcoholicDrinks.add(new MenuItemItem("Wine", "Red, white, and rosé wines"));

        nonAlcoholicDrinks.add(new MenuItemItem("Soda", "Coca-Cola, Pepsi, etc."));
        nonAlcoholicDrinks.add(new MenuItemItem("Juice", "Orange, apple, and other fruit juices"));

        MenuCategory mainCourse = new MenuCategory("Main Courses", 1);
        MenuCategory vegan = new MenuCategory("Vegan", 2);
        MenuCategory seafood = new MenuCategory("Seafood", 2);

        vegan.add(new MenuItemItem("Tofu Salad", "Tofu with vegetable"));
        vegan.add(new MenuItemItem("Endamamme", "boiled endamamme"));

        seafood.add(new MenuItemItem("Lobster ", "Grilled Lobster with Butter"));
        seafood.add(new MenuItemItem("Fish", "Grilled Fish with Lemon"));

        MenuCategory dessert = new MenuCategory("Dessert", 1);
        
        dessert.add(new MenuItemItem("Tropical Fruit", "Fresh Fruits"));
        dessert.add(new MenuItemItem("Chocolate Cake", "Moist Chocolate Cake"));


        mainMenu.add(drinks);
        mainMenu.add(mainCourse);
        mainMenu.add(dessert);
        
        drinks.add(alcoholicDrinks);
        drinks.add(nonAlcoholicDrinks);
        mainCourse.add(vegan);
        mainCourse.add(seafood);

        mainMenu.print();
    }
}
