package question3.Decorator;

import ex1.question3.Decorator.Composant;
import ex1.question3.Decorator.ComposantConcret;
import ex1.question3.Decorator.DecoratorAfter;
import ex1.question3.Decorator.DecoratorBefore;

public class Test {
    public static void main(String[] args) {
        Composant composantDeBase = new ComposantConcret();

        System.out.println("1 Composant seul");
        composantDeBase.traitement();

        System.out.println("2 Avec Décorateur Avant");
        Composant avecAvant = new DecoratorBefore(composantDeBase);
        avecAvant.traitement();

        System.out.println("3 Combinaison des deux décorateurs (Avant + Après)");
        Composant totalementDecore = new DecoratorAfter(new DecoratorBefore(composantDeBase));
        totalementDecore.traitement();
    }
}