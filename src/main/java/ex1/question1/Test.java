package ex1.question1.Composite;

public class Test {
    public static void main(String[] args) {
        GroupeFigures root = new GroupeFigures("Root");

        root.ajouter(new Cercle("Cercle 1", 5.0));
        root.ajouter(new Rectangle("Rectangle 1", 10.0, 4.0));

        GroupeFigures groupeA = new GroupeFigures("Groupe A");
        groupeA.ajouter(new Cercle("Cercle 2", 2.5));

        GroupeFigures sousGroupeB = new GroupeFigures("Sous-Groupe B");
        sousGroupeB.ajouter(new Rectangle("Rectangle 2", 8.0, 3.0));

        groupeA.ajouter(sousGroupeB);
        root.ajouter(groupeA);

        root.print();
    }
}