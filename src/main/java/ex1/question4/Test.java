package question4.Observer;

import ex1.question4.Observer.*;

public class Test {
    public static void main(String[] args) {
        JoueurImpl joueur = new JoueurImpl();

        ObjetJeu couloir = new Couloir();
        ObjetJeu camera = new Camera();
        ObjetJeu gardien = new Gardien();

        joueur.addObserver(couloir);
        joueur.addObserver(camera);
        joueur.addObserver(gardien);

        System.out.println("Changement de score à 10");
        joueur.setScore(10);

        System.out.println("Changement de score à 50");
        joueur.setScore(50);
    }
}