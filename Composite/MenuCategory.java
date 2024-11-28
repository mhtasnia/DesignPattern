import java.util.ArrayList;
import java.util.List;

public class MenuCategory implements MenuItem {

    private String name;
    private List<MenuItem> items = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    @Override
    public void print() {
        System.out.println(name);
        for (MenuItem item : items) {
            item.print();
        }
    }
    
}
