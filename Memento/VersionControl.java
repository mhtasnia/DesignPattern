package DesignPattern.Memento;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<Memento> versions = new ArrayList<>();

    
    public void saveVersion(Memento memento) {
        versions.add(memento);
    }

    
    public Memento getVersion(int index) {
        if (index < 0 || index >= versions.size()) {
            throw new IndexOutOfBoundsException("Invalid version index.");
        }
        return versions.get(index);
    }

   
    public void listVersions() {
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + i + ": " + versions.get(i).getContent());
        }
    }
}
