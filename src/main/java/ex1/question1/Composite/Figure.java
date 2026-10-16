package ex1.question1.Composite;

//the component
public abstract class Figure {
    protected String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}