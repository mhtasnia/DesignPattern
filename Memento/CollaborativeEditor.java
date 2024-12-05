package DesignPattern.Memento;

public class CollaborativeEditor {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        
        document.write("Hello, World!");
        document.showContent();

        
        versionControl.saveVersion(document.save());

        
        document.write(" This is a collaborative editor.");
        document.showContent();
        versionControl.saveVersion(document.save());

        
        document.write(" Let's add some more text.");
        document.showContent();

        
        versionControl.saveVersion(document.save());

        
        System.out.println("\nSaved Versions:");
        versionControl.listVersions();

        
        System.out.println("\nRestoring to Version 1...");
        document.restore(versionControl.getVersion(1));
        document.showContent();

        
        System.out.println("\nRestoring to Version 0...");
        document.restore(versionControl.getVersion(0));
        document.showContent();
    }
}
