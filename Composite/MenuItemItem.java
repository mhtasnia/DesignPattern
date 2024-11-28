public class MenuItemItem implements MenuItem{
    private String name;
    private String description;

    public MenuItemItem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void print() {
        System.out.println("- " + name + ": " + description);
    }

    
}
