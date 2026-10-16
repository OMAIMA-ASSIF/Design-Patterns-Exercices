package ex1.question1.Composite;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(String name, double rayon) {
        super(name);
        this.rayon = rayon;
    }
 
    @Override
    public void print() {
        System.out.println("Cercle :" + name + " , Rayon: " + rayon);
    }
}