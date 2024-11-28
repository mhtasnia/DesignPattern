public class MenuClient {
    public static void main(String[] args) {
        MenuCategory mainMenu = new MenuCategory("Main Menu");

        MenuCategory drinks = new MenuCategory("Drinks");
        drinks.addItem(new MenuItemItem("Coffee", "Hot coffee"));
        drinks.addItem(new MenuItemItem("Tea", "Hot tea"));
        mainMenu.addItem(drinks);

        MenuCategory food = new MenuCategory("Food");
        food.addItem(new MenuItemItem("Pizza", "Delicious pizza"));
        food.addItem(new MenuItemItem("Pasta", "Tasty pasta"));
        mainMenu.addItem(food);

        mainMenu.print();
    }
}
