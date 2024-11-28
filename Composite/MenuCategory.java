import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuItem {

    private String name;
    private List<MenuItem> items = new ArrayList<>();
    private int level;

    public MenuCategory(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    @Override
    public void add(MenuItem item) {
        items.add(item);
    }

    @Override
    public void remove(MenuItem item) {
        items.remove(item);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(name);
        for (MenuItem item : items) {
            item.print();
        }
    }
    
}
