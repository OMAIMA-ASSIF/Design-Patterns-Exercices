package ex1.question1.Composite;

public class Rectangle extends Figure {
    private double largeur;
    private double hauteur;

    public Rectangle(String name, double largeur, double hauteur) {
        super(name);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
 
    @Override
    public void print() {

        System.out.println("Rectangle :" + name + ", Dimensions: " + largeur + "x" + hauteur);
    }
}