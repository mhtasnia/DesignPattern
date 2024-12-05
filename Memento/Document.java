package DesignPattern.Memento;

public class Document {
    private String content;

    public Document() {
        this.content = "";
    }

    
    public void write(String text) {
        content += text;
    }

    
    public void showContent() {
        System.out.println("Current Content: " + content);
    }

    
    public Memento save() {
        return new Memento(content);
    }

    
    public void restore(Memento memento) {
        this.content = memento.getContent();
    }
}
